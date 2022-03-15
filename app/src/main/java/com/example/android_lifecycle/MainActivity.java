package com.example.android_lifecycle;

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
                    startActivity(intent); //we pass the (String->"Hellow There") intent to ShowGuess.java
                }
                else{
                    Toast.makeText(MainActivity.this,"Enter Guess",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }


/*
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Cycle","onStart");
        Toast.makeText(MainActivity.this,"onStart() Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {  //onResume and onPostResume is same
        super.onResume();

        Log.d("Cycle","onResume");
        Toast.makeText(MainActivity.this,"onResume() Called",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Cycle","onPause");
        Toast.makeText(MainActivity.this,"onPause() Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Cycle","onStop");
        Toast.makeText(MainActivity.this,"onStop() Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Cycle","onDestroy");
        Toast.makeText(MainActivity.this,"onDestroy() Called",Toast.LENGTH_SHORT).show();
    }*/

}