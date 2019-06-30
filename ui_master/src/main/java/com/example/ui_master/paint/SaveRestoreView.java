package com.example.ui_master.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jieding on 2019/6/30.
 */
public class SaveRestoreView extends View {

    private Paint mPaint;

    public SaveRestoreView(Context context) {
        this(context, null);
    }

    public SaveRestoreView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SaveRestoreView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mPaint = new Paint();
        mPaint.setStrokeWidth(20);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = new Rect();
        rect.set(0,0,200,200);
        canvas.drawRect(rect,mPaint);
        canvas.translate(50,50);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
