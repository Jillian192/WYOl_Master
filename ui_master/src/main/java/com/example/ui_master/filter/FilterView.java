package com.example.ui_master.filter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jieding on 2019/6/28.
 */
public class FilterView extends View {

    private Paint mPaint;

    public FilterView(Context context) {
        this(context,null);
    }

    public FilterView(Context context,  AttributeSet attrs) {
        this(context, attrs,0);
    }

    public FilterView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);

    }

}
