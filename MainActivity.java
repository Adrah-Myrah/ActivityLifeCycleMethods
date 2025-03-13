package com.example.lifecycledemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tv = findViewById(R.id.tv);
        tv.setText("Activity Created!");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","The onStart method is called");
        TextView tv = findViewById(R.id.tv);
        tv.setText("Activity Started!");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","The onResume method is called");
        TextView tv = findViewById(R.id.tv);
        tv.setText("Activity Resumed!");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","The onPause method is called");
        TextView tv = findViewById(R.id.tv);
        tv.setText("Activity Paused!");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","The onStop method is called");
        TextView tv = findViewById(R.id.tv);
        tv.setText("Activity Stop!");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","The onRestart method is called");
        TextView tv = findViewById(R.id.tv);
        tv.setText("Activity Restarted!");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","The onDestroy method is called");
        TextView tv = findViewById(R.id.tv);
        tv.setText("Activity Destroyed!");
    }
}