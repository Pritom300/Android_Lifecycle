package com.example.android_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView showTextGuessview;
    private EditText enterGuess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        Bundle extra = getIntent().getExtras();


        showTextGuessview = findViewById(R.id.received_textview);

        if(extra!=null)
        {
            //String value = getIntent().getStringExtra("guess");

            showTextGuessview.setText(extra.getString("guess"));
            Log.d("Nme extra","onCreate: " +extra.getInt("age"));


        }


//       String value = getIntent().getStringExtra("guess");  //receieve value from mainactivity via key(guess)
//
//        if(value!=null)
//        {
//            showTextGuessview.setText(value);  //main activity theke ana string value("Hellow There") showTextGuessview te set hoye jabe
//        }





    }
}