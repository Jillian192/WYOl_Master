package com.example.ui_master;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jieding on 2019/6/28.
 */
public class PaintApplicationView extends View {

    private Paint mPaint;
    private int mWidth;
    private int mHeight;

    public PaintApplicationView(Context context) {
        this(context,null);
    }

    public PaintApplicationView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PaintApplicationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        //重置
        mPaint.reset();
        //给画笔设置颜色
        mPaint.setColor(Color.RED);
        //给画笔设置透明度
        mPaint.setAlpha(255);

        //设置画笔的样式
        mPaint.setStyle(Paint.Style.FILL);//填充内容
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setStyle(Paint.Style.STROKE);//描边
        //画笔的宽度
        mPaint.setStrokeWidth(50);
        //线帽
        mPaint.setStrokeCap(Paint.Cap.BUTT);//没有
        mPaint.setStrokeCap(Paint.Cap.ROUND);//圆的
        mPaint.setStrokeCap(Paint.Cap.SQUARE);//方形

        mPaint.setStrokeJoin(Paint.Join.MITER);//锐角
        mPaint.setStrokeJoin(Paint.Join.ROUND);//圆弧
        mPaint.setStrokeJoin(Paint.Join.BEVEL);//直线

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setLayerType(View.LAYER_TYPE_SOFTWARE,null);
        canvas.saveLayer(0,0,getWidth(),getHeight(),mPaint,Canvas.ALL_SAVE_FLAG);
    }
}
