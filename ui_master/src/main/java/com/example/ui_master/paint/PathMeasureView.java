package com.example.ui_master.paint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jieding on 2019/7/5.
 */
public class PathMeasureView extends View {
    public PathMeasureView(Context context) {
        this(context,null);
    }

    public PathMeasureView(Context context,  AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PathMeasureView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
