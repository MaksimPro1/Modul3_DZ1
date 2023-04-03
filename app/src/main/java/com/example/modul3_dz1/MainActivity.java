package com.example.modul3_dz1;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String KEY_COUNT = "KEY_COUNT";
    private int count = 0;
    private TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = findViewById(R.id.text_view_count);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(KEY_COUNT);
            textViewCount.setText(String.valueOf(count));
        }
    }

    public void incrementCount(View view) {
        count++;
        textViewCount.setText(String.valueOf(count));
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt(KEY_COUNT);
        textViewCount.setText(String.valueOf(count));
    }        }