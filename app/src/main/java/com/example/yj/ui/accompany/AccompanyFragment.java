package com.example.yj.ui.accompany;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.yj.R;
import com.example.yj.ui.accompany.entity.Accompany;
import com.example.yj.ui.network.ApiDemo;
import com.example.yj.ui.network.RetrofitFactory;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccompanyFragment extends Fragment implements OnBannerListener {
    //轮播图
    private Banner accompany_banner;
    private ArrayList<String> accompany_banner_list_path;
    private ArrayList<String> accompany_banner_list_title;

    //list
    private RecyclerView recyclerView;
    private AccompanyAdapter adapter;

    public AccompanyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accompany, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList(view);
    }

    private void initList(View view) {
        recyclerView = view.findViewById(R.id.accompany_recyclerView);
        // 第一步：指定布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        // 第二步：设置适配器
        adapter = new AccompanyAdapter(R.layout.accompany_item);

        //设置头部
        View headView = getLayoutInflater().inflate(R.layout.accompany_head, null);
        //轮播图
        initBanner(headView);
        adapter.addHeaderView(headView);


        recyclerView.setAdapter(adapter);
        //recyclerView分割线
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));

        loadDatahttp();
    }

    private void loadDatahttp() {
        // 获取Retrofit对象
        RetrofitFactory.getRetrofit().create(ApiDemo.class)
                .getAccompany()
                // 切换到IO现场执行网络请求
                .subscribeOn(Schedulers.io())
                // 切换到UI线程执行UI操作
                .observeOn(AndroidSchedulers.mainThread())
                // 获取网络请求结果
                .subscribe(new Consumer<List<Accompany>>()
                           {
                               @Override
                               public void accept(List<Accompany> repos) throws Exception
                               {

                                   adapter.addData(repos);
                               }
                           },
                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception
                            {
                                throwable.printStackTrace();
                            }
                        });
    }

    private void initBanner( View view) {
        accompany_banner = view.findViewById(R.id.accompany_banner);
        //放图片地址的集合
        accompany_banner_list_path = new ArrayList<>();
        //放标题的集合
        accompany_banner_list_title = new ArrayList<>();

        accompany_banner_list_path.add("https://s3.ax1x.com/2021/01/20/sWyNvQ.jpg");
        accompany_banner_list_path.add("https://s3.ax1x.com/2021/01/20/sWytgg.jpg");
        accompany_banner_list_path.add("https://s3.ax1x.com/2021/01/20/sWyJC8.jpg");
        accompany_banner_list_path.add("https://s3.ax1x.com/2021/01/20/sWyY8S.jpg");
        accompany_banner_list_title.add("突破少年");
        accompany_banner_list_title.add("森林戏剧夏令营");
        accompany_banner_list_title.add("上海迪士尼");
        accompany_banner_list_title.add("喀斯特学院");
        //设置内置样式，共有六种可以点入方法内逐一体验使用。
        accompany_banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        accompany_banner.setImageLoader(new AccompanyFragment.MyLoader());
        //设置图片网址或地址的集合
        //设置图片网址或地址的集合
        accompany_banner.setImages(accompany_banner_list_path);
        //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
        accompany_banner.setBannerAnimation(Transformer.Default);
        //设置轮播图的标题集合
        accompany_banner.setBannerTitles(accompany_banner_list_title);
        //设置轮播间隔时间
        accompany_banner.setDelayTime(3000);
        //设置是否为自动轮播，默认是“是”。
        accompany_banner.isAutoPlay(true);
        //设置指示器的位置，小点点，左中右。
        accompany_banner.setIndicatorGravity(BannerConfig.CENTER)
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
