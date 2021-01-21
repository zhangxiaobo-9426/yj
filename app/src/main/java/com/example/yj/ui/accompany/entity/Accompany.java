package com.example.yj.ui.accompany.entity;

public class Accompany {
    //id
    private Integer id;
    //图片
    private String accompany_img_url;
    //标题
    private String accompany_title;
    //年龄
    private String accompany_age;
    //度过时间
    private String accompany_spend_time;
    //起始时间
    private String accompany_start_tme;
    //钱
    private String accompany_price;
    //原价
    private String accompany_original_price;
    //拼团返利
    private String accompany_group_work;
    //标签1
    private String accompany_tag_1;
    //标签2
    private String accompany_tag_2;
    //正文标题标签
    private String accompany_main_title_tag;
    //正文已售数目
    private Integer accompany_main_sign_up;
    //正文出行时间
    private String accompany_main_travel_time;
    //正文价格说明
    private String accompany_main_price_description;
    //正文产品特色
    private String accompany_main_product_features;

    public Accompany(Integer id, String accompany_img_url, String accompany_title, String accompany_age, String accompany_spend_time, String accompany_start_tme, String accompany_price, String accompany_original_price, String accompany_group_work, String accompany_tag_1, String accompany_tag_2, String accompany_main_title_tag, Integer accompany_main_sign_up, String accompany_main_travel_time, String accompany_main_price_description, String accompany_main_product_features) {
        this.id = id;
        this.accompany_img_url = accompany_img_url;
        this.accompany_title = accompany_title;
        this.accompany_age = accompany_age;
        this.accompany_spend_time = accompany_spend_time;
        this.accompany_start_tme = accompany_start_tme;
        this.accompany_price = accompany_price;
        this.accompany_original_price = accompany_original_price;
        this.accompany_group_work = accompany_group_work;
        this.accompany_tag_1 = accompany_tag_1;
        this.accompany_tag_2 = accompany_tag_2;
        this.accompany_main_title_tag = accompany_main_title_tag;
        this.accompany_main_sign_up = accompany_main_sign_up;
        this.accompany_main_travel_time = accompany_main_travel_time;
        this.accompany_main_price_description = accompany_main_price_description;
        this.accompany_main_product_features = accompany_main_product_features;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccompany_img_url() {
        return accompany_img_url;
    }

    public void setAccompany_img_url(String accompany_img_url) {
        this.accompany_img_url = accompany_img_url;
    }

    public String getAccompany_title() {
        return accompany_title;
    }

    public void setAccompany_title(String accompany_title) {
        this.accompany_title = accompany_title;
    }

    public String getAccompany_age() {
        return accompany_age;
    }

    public void setAccompany_age(String accompany_age) {
        this.accompany_age = accompany_age;
    }

    public String getAccompany_spend_time() {
        return accompany_spend_time;
    }

    public void setAccompany_spend_time(String accompany_spend_time) {
        this.accompany_spend_time = accompany_spend_time;
    }

    public String getAccompany_start_tme() {
        return accompany_start_tme;
    }

    public void setAccompany_start_tme(String accompany_start_tme) {
        this.accompany_start_tme = accompany_start_tme;
    }

    public String getAccompany_price() {
        return accompany_price;
    }

    public void setAccompany_price(String accompany_price) {
        this.accompany_price = accompany_price;
    }

    public String getAccompany_original_price() {
        return accompany_original_price;
    }

    public void setAccompany_original_price(String accompany_original_price) {
        this.accompany_original_price = accompany_original_price;
    }

    public String getAccompany_group_work() {
        return accompany_group_work;
    }

    public void setAccompany_group_work(String accompany_group_work) {
        this.accompany_group_work = accompany_group_work;
    }

    public String getAccompany_tag_1() {
        return accompany_tag_1;
    }

    public void setAccompany_tag_1(String accompany_tag_1) {
        this.accompany_tag_1 = accompany_tag_1;
    }

    public String getAccompany_tag_2() {
        return accompany_tag_2;
    }

    public void setAccompany_tag_2(String accompany_tag_2) {
        this.accompany_tag_2 = accompany_tag_2;
    }

    public String getAccompany_main_title_tag() {
        return accompany_main_title_tag;
    }

    public void setAccompany_main_title_tag(String accompany_main_title_tag) {
        this.accompany_main_title_tag = accompany_main_title_tag;
    }

    public Integer getAccompany_main_sign_up() {
        return accompany_main_sign_up;
    }

    public void setAccompany_main_sign_up(Integer accompany_main_sign_up) {
        this.accompany_main_sign_up = accompany_main_sign_up;
    }

    public String getAccompany_main_travel_time() {
        return accompany_main_travel_time;
    }

    public void setAccompany_main_travel_time(String accompany_main_travel_time) {
        this.accompany_main_travel_time = accompany_main_travel_time;
    }

    public String getAccompany_main_price_description() {
        return accompany_main_price_description;
    }

    public void setAccompany_main_price_description(String accompany_main_price_description) {
        this.accompany_main_price_description = accompany_main_price_description;
    }

    public String getAccompany_main_product_features() {
        return accompany_main_product_features;
    }

    public void setAccompany_main_product_features(String accompany_main_product_features) {
        this.accompany_main_product_features = accompany_main_product_features;
    }
}
