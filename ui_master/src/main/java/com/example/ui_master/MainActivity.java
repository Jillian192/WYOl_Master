package com.example.ui_master;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.ui_master.filter.FilterActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BaseQuickAdapter.OnItemClickListener {

    private RecyclerView mUiMaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUiMaster = findViewById(R.id.ui_master);
        mUiMaster.setLayoutManager(new LinearLayoutManager(this));
        UIMasterAdaptert uiMasterAdaptert = new UIMasterAdaptert(R.layout.adapter_ui_master);
        mUiMaster.setAdapter(uiMasterAdaptert);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Paint-滤镜");
        strings.add("Paint-画笔高级应用");
        uiMasterAdaptert.setNewData(strings);
        uiMasterAdaptert.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, FilterActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, PaintApplicationActivity.class));
                break;
        }
    }
}
