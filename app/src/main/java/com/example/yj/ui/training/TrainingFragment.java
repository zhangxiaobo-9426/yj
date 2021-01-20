package com.example.yj.ui.training;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.yj.R;
import com.example.yj.ui.accompany.AccompanyFragment;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrainingFragment extends Fragment implements OnBannerListener {
    //轮播图
    private Banner training_banner;
    private ArrayList<String> training_banner_list_path;
    private ArrayList<String> training_banner_list_title;

    public TrainingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_training, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initBanner(view);
    }

    private void initBanner(View view) {
        training_banner = view.findViewById(R.id.training_banner);
        //放图片地址的集合
        training_banner_list_path = new ArrayList<>();
        //放标题的集合
        training_banner_list_title = new ArrayList<>();

        training_banner_list_path.add("https://s3.ax1x.com/2021/01/20/sWfGee.jpg");
        training_banner_list_path.add("https://s3.ax1x.com/2021/01/20/sWfYod.jpg");
        training_banner_list_path.add("https://s3.ax1x.com/2021/01/20/sWfJdH.jpg");
        training_banner_list_title.add("萌趣中国书");
        training_banner_list_title.add("地球说明书");
        training_banner_list_title.add("了不起的世界奇观");
        //设置内置样式，共有六种可以点入方法内逐一体验使用。
        training_banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        training_banner.setImageLoader(new TrainingFragment.MyLoader());
        //设置图片网址或地址的集合
        //设置图片网址或地址的集合
        training_banner.setImages(training_banner_list_path);
        //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
        training_banner.setBannerAnimation(Transformer.Default);
        //设置轮播图的标题集合
        training_banner.setBannerTitles(training_banner_list_title);
        //设置轮播间隔时间
        training_banner.setDelayTime(3000);
        //设置是否为自动轮播，默认是“是”。
        training_banner.isAutoPlay(true);
        //设置指示器的位置，小点点，左中右。
        training_banner.setIndicatorGravity(BannerConfig.CENTER)
                //以上内容都可写成链式布局，这是轮播图的监听。比较重要。方法在下面。
                .setOnBannerListener(this)
                //必须最后调用的方法，启动轮播图。
                .start();


    }
    //轮播图的监听方法
    public void OnBannerClick(int position) {
        Log.i("tag", "你点了第"+position+"张轮播图");
    }
    //自定义的图片加载器
    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String) path).into(imageView);
        }
    }
}
