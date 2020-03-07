package com.qingmu.spider.weibo;

import com.qingmu.spider.weibo.impl.UserImpl;
import com.qingmu.spider.weibo.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserApiTest {
    @Test
    public void testGetUserInfo() {
        String id = "2908761947";
        UserImpl u = new UserImpl();
        User user = u.getUserInfo(id);
        String res = user.toString();
        System.out.println(res);
        System.out.println(user.getId());
        System.out.println(user.getName());
    }

    @Test
    public void testGetFans() {
        UserImpl imp = new UserImpl();
        String userId = "1792951112";
        for (int i = 0; i < 5; i++) {
            List<User> fans = imp.getFans(userId, 1);
            fans.forEach(user -> {
                System.out.println(user.getScreen_name() + ":");
                System.out.println("\tid: " + user.getId());
                System.out.println("\t粉丝数: " + user.getFollowers_count());
                System.out.println("\t关注数: " + user.getFollow_count());
            });
            System.out.println(fans.size());
        }
    }


}
