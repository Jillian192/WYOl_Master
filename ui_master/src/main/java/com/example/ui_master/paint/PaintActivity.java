package com.example.ui_master.paint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ui_master.R;

public class PaintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);
        SaveRestoreView viewById = findViewById(R.id.set_react);
    }
}
