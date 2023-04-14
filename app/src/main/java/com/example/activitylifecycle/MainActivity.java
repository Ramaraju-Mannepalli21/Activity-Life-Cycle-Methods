package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LogName","On Create Activity started");
        Toast.makeText(this, "On Create Activity started", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("LogName","On START Activity started");
        Toast.makeText(this, "On Start Activity started", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("LogName","On RESUME Activity started");
        Toast.makeText(this, "On Resume Activity started", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("LogName","On PAUSE Activity started");
        Toast.makeText(this, "On Pause Activity started", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("LogName","On STOP Activity started");
        Toast.makeText(this, "On Stop Activity started", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("LogName","On DESTROY Activity started");
        Toast.makeText(this, "On Destroy Activity started", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("LogName","On RESTART Activity started");
        Toast.makeText(this, "On Restart Activity started", Toast.LENGTH_SHORT).show();
    }
}