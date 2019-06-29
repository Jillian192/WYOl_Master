package com.example.administrator.wyol_master;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mIvImageView;
    private Button mBDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvImageView = (ImageView) findViewById(R.id.main_iv_image_view);
        mBDraw = findViewById(R.id.main_b_draw);
        animateImage(); // 动画播放图片

        // 重绘动画
        mBDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateImage();
            }
        });
    }

    private void animateImage() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // 获取动画效果
            AnimatedVectorDrawable mAnimatedVectorDrawable = (AnimatedVectorDrawable)
                    ContextCompat.getDrawable(getApplication(), R.drawable.v_heard_animation);
            mIvImageView.setImageDrawable(mAnimatedVectorDrawable);
            if (mAnimatedVectorDrawable != null) {
                mAnimatedVectorDrawable.start();
            }
        }
    }
}
