package com.eoffcn.mvpapplication.adapter;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.eoffcn.mvpapplication.R;
import com.eoffcn.mvpapplication.model.entity.ResultBean;

import java.util.List;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.adapter
 * @fileName SongPoetryAdapter
 * @date 2018/10/25 11:10
 * @org www.offcn.com
 * @email
 * @description
 */
public class SongPoetryAdapter extends BaseQuickAdapter<ResultBean,BaseViewHolder> {
    public SongPoetryAdapter(int layoutResId, @Nullable List<ResultBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ResultBean item) {
        TextView tvTitle = helper.itemView.findViewById(R.id.tv_title);
        TextView tvAuthors = helper.itemView.findViewById(R.id.tv_authors);
        TextView tvContent = helper.itemView.findViewById(R.id.tv_content);
        tvTitle.setText(item.getTitle());
        tvAuthors.setText(item.getAuthors());
        tvContent.setText(item.getContent());
    }
}
