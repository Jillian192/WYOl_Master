package com.example.ui_master.paint;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jieding on 2019/6/30.
 */
public class GradientLayout extends View {

    private Paint mPaint;

    public GradientLayout(Context context) {
        this(context, null);
    }

    public GradientLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GradientLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setARGB(255, 255, 255, 0);//设置绘制的颜色，a代表透明度，r，g，b代表颜色值。
        mPaint.setAlpha(255); //设置绘制图形的透明度。
        mPaint.setColor(Color.RED); //设置绘制的颜色，使用颜色值来表示，该颜色值包括透明度和RGB颜色。
        mPaint.setAntiAlias(true); //设置是否使用抗锯齿功能，会消耗较大资源，绘制图形速度会变慢。
        mPaint.setDither(true);// 设定是否使用图像抖动处理，会使绘制出来的图片颜色更加平滑和饱满，图像更加清晰
        mPaint.setFilterBitmap(true);// 如果该项设置为true，则图像在动画进行中会滤掉对Bitmap图像的优化操作， 加快显示速度，本设置项依赖于dither和xfermode的设置


        mPaint.setMaskFilter(new MaskFilter());// 设置MaskFilter，可以用不同的MaskFilter实现滤镜的效果，如滤化，立体等
        mPaint.setColorFilter(new ColorFilter());// 设置颜色过滤器，可以在绘制颜色时实现不用颜色的变换效果
        mPaint.setPathEffect(new PathEffect()); //设置绘制路径的效果，如点画线等
        mPaint.setShader(new Shader());// 设置图像效果，使用Shader可以绘制出各种渐变效果
        mPaint.setShadowLayer( 10, 10, 10,10);//在图形下面设置阴影层，产生阴影效果， radius为阴影的角度，dx和dy为阴影在x轴和y轴上的距离，color为阴影的颜色
        mPaint.setStyle(Paint.Style.STROKE); //设置画笔的样式，为FILL，FILL_OR_STROKE，或STROKE
        mPaint.setStrokeCap(Paint.Cap.BUTT); //<span style="font-family: Arial, Helvetica, sans-serif;">当画笔样式为STROKE或FILL_OR_STROKE时，设置笔刷的图形样式， 如圆形样Cap.ROUND,或方形样式Cap.SQUARE</span>
//        mPaint.setSrokeJoin(Paint.Join.BEVEL); //设置绘制时各图形的结合方式，如平滑效果等
        mPaint.setStrokeWidth( 15); //当画笔样式为STROKE或FILL_OR_STROKE时，设置笔刷的粗细度
        mPaint.setXfermode(new Xfermode()); //设置图形重叠时的处理方式，如合并，取交集或并集，经常用来制作橡皮的擦除效果


//        setStrikeThruText(boolean strikeThruText)：// 设置带有删除线的效果
//        setStrokeJoin(Paint.Join join)：// 设置结合处的样子，Miter:结合处为锐角， Round:结合处为圆弧：BEVEL：结合处为直线
//        setStrokeMiter(float miter)：//设置画笔倾斜度
//        setStrokeCap (Paint.Cap cap)：//设置转弯处的风格 其他常用方法：
//        float ascent( )：//测量baseline之上至字符最高处的距离
//        float descent()：//baseline之下至字符最低处的距离
//        int breakText(char[] text, int index, int count, float maxWidth, float[] measuredWidth)：// 检测一行显示多少文字
//        clearShadowLayer( )：//清除阴影层
    }
}
