package com.netease.paint.gradient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BaseQuickAdapter.OnItemClickListener {

    private GradientLayout mView;
    private RecyclerView mViewById;
    private PaintAdapter mPaintAdapter;
    private String mString[] = {"线性渲染", "环形渲染", "扫描渲染", "位图渲染", "组合渲染"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(new GradientLayout(this));
        setContentView(R.layout.activity_gradientlayout_main);
        mView = (GradientLayout) findViewById(R.id.gridlayout);
        mViewById = (RecyclerView) findViewById(R.id.paint_application);
        mPaintAdapter = new PaintAdapter(R.layout.paint_title);
        mViewById.setLayoutManager(new GridLayoutManager(this, 6));
        mViewById.setAdapter(mPaintAdapter);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < mString.length; i++) {
            strings.add(mString[i]);
        }
        mPaintAdapter.setNewData(strings);
        mPaintAdapter.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
//        mView
        switch (position) {
//            case 0:
//                mView.linearGradient();
//                break;
//            case 1:
//                mView.RadialGradient();
//                break;
//            case 2:
//                mView.SweepGradient();
//                break;
//            case 3:
//                mView.BitmapShader();
//                break;
//            case 4:
//                mView.ComposeShader();
//                break;
        }
    }
}
