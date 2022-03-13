package com.example.android_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView showTextGuessview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showTextGuessview = findViewById(R.id.received_textview);

       String value = getIntent().getStringExtra("guess");  //receieve value from mainactivity via key(guess)

        if(value!=null)
        {
            showTextGuessview.setText(value);  //main activity theke ana string value("Hellow There") showTextGuessview te set hoye jabe
        }





    }
}