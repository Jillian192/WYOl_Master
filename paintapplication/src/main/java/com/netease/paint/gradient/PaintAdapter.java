package com.netease.paint.gradient;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by jieding on 2019/8/16 11:22
 */
public class PaintAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public PaintAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.paint_in,item);
    }
}
