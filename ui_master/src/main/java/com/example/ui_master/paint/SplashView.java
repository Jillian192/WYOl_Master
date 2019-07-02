package com.example.ui_master.paint;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jieding on 2019/7/1.
 */
public class SplashView extends View {

    private Paint mPaint;
    private Paint mHolePaint;
    private int mBackgroundColor= Color.GRAY;
    private int[] mCircleColors;

    public SplashView(Context context) {
        this(context,null);
    }

    public SplashView(Context context,  AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SplashView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mHolePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mHolePaint.setStyle(Paint.Style.STROKE);
        mHolePaint.setColor(mBackgroundColor);
//        mCircleColors =context.getResources().getIntArray(R.array.splash);

    }


}
