package com.example.android_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private Button showGuess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.guess_button);

        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ShowGuess.class); //show guess class just says,ok give me the class and then i will deal with everything else that need to be
                intent.putExtra("guess","Hellow There");  //here guess is the key and value is "Hellow There"
                startActivity(intent); //we pass the (String->"Hellow There") intent to ShowGuess.java
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