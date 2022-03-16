package com.example.android_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

        showTextGuessview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                intent.putExtra("Message_Back","From Second Activity");
                setResult(RESULT_OK,intent);  //it's actually pass value amader MainActivity te create kora (onActivityResult) te.
                finish();
            }
        });
    }
}

//eitar output hosse jokon name like guess button e click korbo then notun create kora shoGuess activity er textview e input kora nam visible hobe
//r tik oi input kora nam er upor click korle abr back chole jabe MainActivity te!! Amaizing,isn't it :)