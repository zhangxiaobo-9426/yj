package com.example.yj.ui.accompany.accompany_main;


import android.content.Context;
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
public class AccompanyMainFragment extends Fragment {
    private TextView accompany_main_title_tv,accompany_main_title_tag_tv,accompany_main_price_tv,accompany_main_sign_up_tv,accompany_main_travel_time_tv;
    private ImageView accompany_main_img_iv,accompany_main_price_description_iv,accompany_main_product_features_iv;


    public AccompanyMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accompany_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initData();

    }

    private void initData() {
        Bundle bundle = getArguments();
        accompany_main_title_tv.setText(bundle.getString("ACCOMPANY_TITLE"));
        accompany_main_title_tag_tv.setText(bundle.getString("ACCOMPANY_MAIN_TITLE_TAG"));
        accompany_main_price_tv.setText(bundle.getString("ACCOMPANY_PRICE"));
        accompany_main_sign_up_tv.setText(bundle.getString("ACCOMPANY_MAIN_SIGN_UP"));
        accompany_main_travel_time_tv.setText(bundle.getString("ACCOMPANY_MAIN_TRAVEL_TIME"));
        Glide.with(this).load(bundle.getString("ACCOMPANY_IMG_URL")).into(accompany_main_img_iv);
        Glide.with(this).load(bundle.getString("ACCOMPANY_MAIN_PRICE_DESCRIPTION")).into(accompany_main_price_description_iv);
        Glide.with(this).load(bundle.getString("ACCOMPANY_MAIN_PRODUCT_FEATURES")).into(accompany_main_product_features_iv);

    }

    private void initView(View view) {
        accompany_main_title_tv = view.findViewById(R.id.accompany_main_title_tv);
        accompany_main_title_tag_tv = view.findViewById(R.id.accompany_main_title_tag_tv);
        accompany_main_price_tv = view.findViewById(R.id.accompany_main_price_tv);
        accompany_main_sign_up_tv = view.findViewById(R.id.accompany_main_sign_up_tv);
        accompany_main_travel_time_tv = view.findViewById(R.id.accompany_main_travel_time_tv);
        accompany_main_img_iv = view.findViewById(R.id.accompany_main_img_iv);
        accompany_main_price_description_iv = view.findViewById(R.id.accompany_main_price_description_iv);
        accompany_main_product_features_iv = view.findViewById(R.id.accompany_main_product_features_iv);
    }

}
