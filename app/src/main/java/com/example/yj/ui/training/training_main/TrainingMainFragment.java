package com.example.yj.ui.training.training_main;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainingMainFragment extends Fragment {
    private TextView training_main_title_tv,training_main_title_tag_tv,training_main_price_tv;
    private ImageView training_main_img_iv,training_main_set_meal_iv,training_main_price_description_iv,training_main_product_features_iv;


    public TrainingMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_training_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initData();
    }

    private void initData() {
        Bundle bundle = getArguments();
        training_main_title_tv.setText(bundle.getString("TRAINING_MAIN_TITLE"));
        training_main_title_tag_tv.setText(bundle.getString("TRAINING_MAIN_TITLE_TAG"));
        training_main_price_tv.setText(bundle.getString("TRAINING_PRICE"));
        Glide.with(this).load(bundle.getString("TRAINING_IMG_URL")).into(training_main_img_iv);
        Glide.with(this).load(bundle.getString("TRAINING_MAIN_SET_MEAL")).into(training_main_set_meal_iv);
        Glide.with(this).load(bundle.getString("TRAINING_MAIN_PRICE_DESCRIPTION")).into(training_main_price_description_iv);
        Glide.with(this).load(bundle.getString("TRAINING_MAIN_PRODUCT_FEATURES")).into(training_main_product_features_iv);

    }

    private void initView(View view) {
        training_main_title_tv = view.findViewById(R.id.training_main_title_tv);
        training_main_title_tag_tv = view.findViewById(R.id.training_main_title_tag_tv);
        training_main_price_tv = view.findViewById(R.id.training_main_price_tv);
        training_main_img_iv = view.findViewById(R.id.training_main_img_iv);
        training_main_set_meal_iv = view.findViewById(R.id.training_main_set_meal_iv);
        training_main_price_description_iv = view.findViewById(R.id.training_main_price_description_iv);
        training_main_product_features_iv = view.findViewById(R.id.training_main_product_features_iv);
    }
}
