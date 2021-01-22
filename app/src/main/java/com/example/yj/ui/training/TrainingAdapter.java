package com.example.yj.ui.training;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.yj.R;
import com.example.yj.ui.training.entity.Training;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TrainingAdapter extends BaseQuickAdapter<Training, BaseViewHolder> {
    public TrainingAdapter(int layoutResId, @Nullable List<Training> data) {
        super(layoutResId, data);
    }

    @Override
    protected void setOnItemClick(@NotNull View v, int position) {
        super.setOnItemClick(v, position);
    }
    public TrainingAdapter(int layoutResId) {
        super(layoutResId);
    }
    @Override
    protected void convert(@NotNull BaseViewHolder holder, final Training training) {
        Glide.with(holder.itemView).load(training.getTraining_img_url()).into((ImageView) holder.getView(R.id.training_img_url_iv));
        holder.setText(R.id.training_title_tv,training.getTraining_title())
                .setText(R.id.training_tag_1_tv,training.getTraining_tag_1())
                .setText(R.id.training_tag_2_tv,training.getTraining_tag_2())
                .setText(R.id.training_price_tv,training.getTraining_price())
                .setText(R.id.training_sign_up_tv,training.getTraining_sign_up().toString());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController controller = Navigation.findNavController(view);
                Bundle bundle = new Bundle();
                bundle.putString("TRAINING_IMG_URL",training.getTraining_img_url());
                bundle.putString("TRAINING_MAIN_TITLE",training.getTraining_main_title());
                bundle.putString("TRAINING_MAIN_TITLE_TAG",training.getTraining_main_title_tag());
                bundle.putString("TRAINING_PRICE",training.getTraining_price());
                bundle.putString("TRAINING_MAIN_SET_MEAL",training.getTraining_main_set_meal());
                bundle.putString("TRAINING_MAIN_PRICE_DESCRIPTION",training.getTraining_main_price_description());
                bundle.putString("TRAINING_MAIN_PRODUCT_FEATURES",training.getTraining_main_product_features());
                controller.navigate(R.id.action_TrainingFragment_to_trainingMainFragment,bundle);
            }
        });

    }
}
