package com.example.android_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



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
    }

}