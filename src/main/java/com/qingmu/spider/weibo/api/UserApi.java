package com.qingmu.spider.weibo.api;

import com.qingmu.spider.weibo.model.Status;
import com.qingmu.spider.weibo.model.User;

import java.net.URISyntaxException;
import java.util.List;

public interface UserApi {
    // 根据用户id获取用户信息
    public User getUserInfo(String id);
    // 根据用户名获取用户信息
    public User getUserInfoByName(String name);
    // 根据用户id获取用户最近的一条微博
    public Status getLastStatus(String userId);
    // 根据用户id获取用户的粉丝数量
    public int getFansCount(String userId);
    // 根据用户id和页数返回用户的粉丝信息，每页返回20条数据
    public List<User> getFans(String userId, int page) throws URISyntaxException;
}
