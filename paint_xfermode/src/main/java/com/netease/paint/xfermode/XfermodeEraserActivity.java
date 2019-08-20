package com.netease.paint.xfermode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class XfermodeEraserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(new XfermodeEraserView(this));
        setContentView(new XfermodeEraserView(this));

    }
}
