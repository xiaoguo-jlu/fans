package com.qingmu.spider.weibo.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qingmu.spider.common.Fetcher;
import com.qingmu.spider.weibo.api.UserApi;
import com.qingmu.spider.weibo.model.Card;
import com.qingmu.spider.weibo.model.Status;
import com.qingmu.spider.weibo.model.User;
import com.qingmu.spider.weibo.page.BasePageResponse;
import com.qingmu.spider.weibo.page.UserInfoPage;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class UserImpl implements UserApi {
    private Fetcher userFetcher = new Fetcher();
    private Fetcher statusFetcher = new Fetcher();
    private Fetcher fansFetcher = new Fetcher();

    @Override
    public User getUserInfo(String id) {
        String url = "https://m.weibo.cn/profile/info";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("uid", id);
        User result = null;
        String response = "";
        try {
            response = userFetcher.doGet(url, params);
        } catch (URISyntaxException e) {
            System.out.println(e);
            return result;
        }
//        JSONObject json = JSONObject.parseObject(response);
        BasePageResponse json = JSONObject.parseObject(response, BasePageResponse.class);
        if (!json.getOk().equals("1")) {
            return result;
        }
        UserInfoPage userInfoPage = JSONObject.parseObject(json.getData(), UserInfoPage.class);
        result = userInfoPage.getUser();
        return result;
    }

    @Override
    public User getUserInfoByName(String name) {
        return null;
    }

    @Override
    public Status getLastStatus(String userId) {
        return null;
    }

    @Override
    public int getFansCount(String userId) {
        return 0;
    }

    @Override
    public List<User> getFans(String userId, int page) {
        List<User> result = new LinkedList<User>();
        String url = "https://m.weibo.cn/api/container/getIndex";
        String containerid = "231051_-_fans_-_" + userId;
        String since_id = "" + page;
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("containerid", containerid);
        params.put("since_id", since_id);
        BasePageResponse response;
        try {
            response = JSONObject.parseObject(fansFetcher.doGet(url, params), BasePageResponse.class);
        } catch (URISyntaxException e) {
            System.out.println(e);
            return result;
        }
        if (!response.getOk().equals("1")) {
            return result;
        }
        JSONObject json = JSONObject.parseObject(response.getData());
        String cardsString = json.getString("cards");
        JSONArray cards = JSONArray.parseArray(cardsString);
        Card fansCardList = JSONObject.parseObject(cards.get(cards.size() - 1).toString(), Card.class);
        fansCardList.getCard_group().forEach(fansCard -> result.add(fansCard.getUser()));
        return result;
    }
}
