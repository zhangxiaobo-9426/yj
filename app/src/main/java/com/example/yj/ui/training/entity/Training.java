package com.example.yj.ui.training.entity;

public class Training {
    //id
    private Integer id;
    //图片
    private String training_img_url;
    //标题
    private String training_title;
    //标签1
    private String training_tag_1;
    //标签2
    private String training_tag_2;
    //钱
    private String training_price;
    //已售数目
    private Integer training_sign_up;
    //正文标题
    private String training_main_title;
    //正文标题标签
    private String training_main_title_tag;
    //正文套餐
    private String training_main_set_meal;
    //正文价格说明
    private String training_main_price_description;
    //正文产品特色
    private String training_main_product_features;

    public Training(Integer id, String training_img_url, String training_title, String training_tag_1, String training_tag_2, String training_price, Integer training_sign_up, String training_main_title, String training_main_title_tag, String training_main_set_meal, String training_main_price_description, String training_main_product_features) {
        this.id = id;
        this.training_img_url = training_img_url;
        this.training_title = training_title;
        this.training_tag_1 = training_tag_1;
        this.training_tag_2 = training_tag_2;
        this.training_price = training_price;
        this.training_sign_up = training_sign_up;
        this.training_main_title = training_main_title;
        this.training_main_title_tag = training_main_title_tag;
        this.training_main_set_meal = training_main_set_meal;
        this.training_main_price_description = training_main_price_description;
        this.training_main_product_features = training_main_product_features;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTraining_img_url() {
        return training_img_url;
    }

    public void setTraining_img_url(String training_img_url) {
        this.training_img_url = training_img_url;
    }

    public String getTraining_title() {
        return training_title;
    }

    public void setTraining_title(String training_title) {
        this.training_title = training_title;
    }

    public String getTraining_tag_1() {
        return training_tag_1;
    }

    public void setTraining_tag_1(String training_tag_1) {
        this.training_tag_1 = training_tag_1;
    }

    public String getTraining_tag_2() {
        return training_tag_2;
    }

    public void setTraining_tag_2(String training_tag_2) {
        this.training_tag_2 = training_tag_2;
    }

    public String getTraining_price() {
        return training_price;
    }

    public void setTraining_price(String training_price) {
        this.training_price = training_price;
    }

    public Integer getTraining_sign_up() {
        return training_sign_up;
    }

    public void setTraining_sign_up(Integer training_sign_up) {
        this.training_sign_up = training_sign_up;
    }

    public String getTraining_main_title() {
        return training_main_title;
    }

    public void setTraining_main_title(String training_main_title) {
        this.training_main_title = training_main_title;
    }

    public String getTraining_main_title_tag() {
        return training_main_title_tag;
    }

    public void setTraining_main_title_tag(String training_main_title_tag) {
        this.training_main_title_tag = training_main_title_tag;
    }

    public String getTraining_main_set_meal() {
        return training_main_set_meal;
    }

    public void setTraining_main_set_meal(String training_main_set_meal) {
        this.training_main_set_meal = training_main_set_meal;
    }

    public String getTraining_main_price_description() {
        return training_main_price_description;
    }

    public void setTraining_main_price_description(String training_main_price_description) {
        this.training_main_price_description = training_main_price_description;
    }

    public String getTraining_main_product_features() {
        return training_main_product_features;
    }

    public void setTraining_main_product_features(String training_main_product_features) {
        this.training_main_product_features = training_main_product_features;
    }

}
