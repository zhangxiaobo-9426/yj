package com.example.yj.ui.accompany;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

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

    @Override
    protected void setOnItemClick(@NotNull View v, int position) {
        super.setOnItemClick(v, position);
    }

    public AccompanyAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, final Accompany accompany) {
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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController controller = Navigation.findNavController(view);
                Bundle bundle = new Bundle();
                bundle.putString("ACCOMPANY_IMG_URL",accompany.getAccompany_img_url());
                bundle.putString("ACCOMPANY_TITLE",accompany.getAccompany_title());
                bundle.putString("ACCOMPANY_MAIN_TITLE_TAG",accompany.getAccompany_main_title_tag());
                bundle.putString("ACCOMPANY_PRICE",accompany.getAccompany_price());
                bundle.putString("ACCOMPANY_MAIN_SIGN_UP",accompany.getAccompany_main_sign_up().toString());
                bundle.putString("ACCOMPANY_MAIN_TRAVEL_TIME",accompany.getAccompany_main_travel_time());
                bundle.putString("ACCOMPANY_MAIN_PRICE_DESCRIPTION",accompany.getAccompany_main_price_description());
                bundle.putString("ACCOMPANY_MAIN_PRODUCT_FEATURES",accompany.getAccompany_main_product_features());
                controller.navigate(R.id.action_AccompanyFragment_to_accompanyMainFragment,bundle);
            }
        });
    }
}
