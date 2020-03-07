package com.qingmu.spider.weibo.page;

import com.qingmu.spider.weibo.model.Status;
import com.qingmu.spider.weibo.model.User;

public class UserInfoPage {
    private User user;
    private Status status;
    private String more;
    private String fans;
    private String follow;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans;
    }

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow;
    }

    @Override
    public String toString() {
        return "UserInfoPage{" +
                "user=" + user +
                ", status=" + status +
                ", more='" + more + '\'' +
                ", fans='" + fans + '\'' +
                ", follow='" + follow + '\'' +
                '}';
    }
}
