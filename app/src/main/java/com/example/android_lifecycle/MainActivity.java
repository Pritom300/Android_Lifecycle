package com.example.android_lifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private Button showGuess;
   private EditText enterGuess;
   private final int REQUEST_CODE=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showGuess = findViewById(R.id.guess_button);
        enterGuess = findViewById(R.id.Guess_field);

        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String guess = enterGuess.getText().toString().trim();  //data input nebo enterGuess theke(Guess_field)

                if(!guess.isEmpty())
                {
                    Intent intent = new Intent(MainActivity.this,ShowGuess.class); //show guess class just says,ok give me the class and then i will deal with everything else that need to be

                    intent.putExtra("guess",guess);  //here guess is the key and value is guess

                    intent.putExtra("Games","bond");
                    intent.putExtra("age",34);
                    //startActivity(intent); //we pass the (String->"Hellow There") intent to ShowGuess.java
                    startActivityForResult(intent,REQUEST_CODE); //if something happened,to receive something inside of our own activity result(created "onActivityResult" in this class)



                }
                else{
                    Toast.makeText(MainActivity.this,"Enter Guess",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }

  //we also have a resultCode parameter.this gonnabe this(ShowGuess.java { setResult(RESULT_OK,intent); }) and this means,
    //ok!everything is good to be passed back to that activity (onActivityResult)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE)
        {
            String message = data.getStringExtra("Message_Back");
            Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
        }
    }
}