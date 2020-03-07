package com.qingmu.spider.weibo.page;

public class BasePageResponse {
    private String ok;
    private String data;

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BasePageResponse{" +
                "ok='" + ok + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
