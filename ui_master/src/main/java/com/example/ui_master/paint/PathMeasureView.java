package com.example.ui_master.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jieding on 2019/7/5.
 */
public class PathMeasureView extends View {
    private String TAG = "☆PathMeasureView☆:";

    private Paint mPaint;
    private Paint mHolePaint;

    public PathMeasureView(Context context) {
        this(context, null);
    }

    public PathMeasureView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PathMeasureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(8);
        mPaint.setColor(Color.RED);

        mHolePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mHolePaint.setStyle(Paint.Style.STROKE);
        mHolePaint.setColor(Color.BLUE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2, mHolePaint);

        canvas.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight(), mHolePaint);
        canvas.translate(getWidth() / 2, getHeight() / 2);
//
//        Path path = new Path();
//        path.lineTo(0,200);
//        path.lineTo(200,200);
//        path.lineTo(200,0);
//        canvas.drawPath(path, mPaint);
//PathMeasure pathMeasure;
//        PathMeasure pathMeasure = new PathMeasure();
//        pathMeasure.setPath(path,true);
//        Log.e(TAG, "onDraw:forceclose==true: "+ pathMeasure.getLength());
//        PathMeasure pathMeasure1 = new PathMeasure();
//        pathMeasure.setPath(path,false);
//        Log.e(TAG, "onDraw: forceclose==false:"+ pathMeasure1.getLength());

        Path path = new Path();
        path.addRect(-200, -200, 200, 200, Path.Direction.CW);

        Path dst = new Path();

        PathMeasure pathMeasure = new PathMeasure(path, false);
        pathMeasure.getSegment(100, 500, dst, false);
        canvas.drawPath(path, mPaint);
        mHolePaint.setColor(Color.GREEN);
        mHolePaint.setStrokeWidth(5);
        canvas.drawPath(dst, mHolePaint);
    }
}
