package com.example.yj.ui.accompany;

import android.text.Layout;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.yj.R;
import com.example.yj.ui.accompany.entity.Accompany;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AccompanyAdapter extends BaseQuickAdapter<Accompany, BaseViewHolder> {
    public AccompanyAdapter(int layoutResId, @Nullable List<Accompany> data) {
        super(layoutResId, data);
    }

    public AccompanyAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, Accompany accompany) {
        Glide.with(holder.itemView).load(accompany.getAccompany_img_url()).into((ImageView) holder.getView(R.id.accompany_img_url_iv));
        holder.setText(R.id.accompany_title_tx,accompany.getAccompany_title())
              .setText(R.id.accompany_age_tv,accompany.getAccompany_age())
              .setText(R.id.accompany_spend_time_tv,accompany.getAccompany_spend_time())
              .setText(R.id.accompany_start_tme_tv,accompany.getAccompany_start_tme())
              .setText(R.id.accompany_price_tv,accompany.getAccompany_price())
              .setText(R.id.accompany_original_price,accompany.getAccompany_original_price())
              .setText(R.id.accompany_group_work_tv,accompany.getAccompany_group_work())
              .setText(R.id.accompany_tag_1_tv,accompany.getAccompany_tag_1())
              .setText(R.id.accompany_tag_2_tv,accompany.getAccompany_tag_2());
    }
}
