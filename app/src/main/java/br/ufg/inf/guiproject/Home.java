package br.ufg.inf.guiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Log.d("MyActivity", "createee");
    }

    @Override
    protected void onRestart() {
        super.onRestart();


        Log.d("MyActivity", "restarttt");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MyActivity", "pauseee");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MyActivity", "stoppp");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MyActivity", "resumeee");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MyActivity", "starttt");
    }
}
