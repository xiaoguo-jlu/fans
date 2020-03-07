package com.qingmu.spider.weibo.model;

public class User {
    private String id;
    private String name;
    private String age;
    private String screen_name;     //昵称
    private String province;
    private String city;
    private String descriptioin;
    private String weihao;
    private String gender;          //性别
    private String followers_count; //粉丝数
    private String follow_count;   //关注数
    private String statuses_count;  //微博数
    private String favourites_count;//收藏数
    private String verified;
    private String desc2;           //小面板中包含粉丝数字符串

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescriptioin() {
        return descriptioin;
    }

    public void setDescriptioin(String descriptioin) {
        this.descriptioin = descriptioin;
    }

    public String getWeihao() {
        return weihao;
    }

    public void setWeihao(String weihao) {
        this.weihao = weihao;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(String followers_count) {
        this.followers_count = followers_count;
    }

    public String getFollow_count() {
        return follow_count;
    }

    public void setFollow_count(String follow_count) {
        this.follow_count = follow_count;
    }

    public String getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(String statuses_count) {
        this.statuses_count = statuses_count;
    }

    public String getFavourites_count() {
        return favourites_count;
    }

    public void setFavourites_count(String favourites_count) {
        this.favourites_count = favourites_count;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", screen_name='" + screen_name + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", descriptioin='" + descriptioin + '\'' +
                ", weihao='" + weihao + '\'' +
                ", gender='" + gender + '\'' +
                ", followers_count='" + followers_count + '\'' +
                ", follow_count='" + follow_count + '\'' +
                ", statuses_count='" + statuses_count + '\'' +
                ", favourites_count='" + favourites_count + '\'' +
                ", verified='" + verified + '\'' +
                '}';
    }
}
