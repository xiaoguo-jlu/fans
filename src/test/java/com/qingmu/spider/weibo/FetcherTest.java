package com.qingmu.spider.weibo;

import com.qingmu.spider.common.Fetcher;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.util.HashMap;

public class FetcherTest {
    @Test
    public void fetchJianshu() throws URISyntaxException {
        String url = "https://www.jianshu.com/p/cb562c60d080";
        Fetcher fetcher = new Fetcher();
        String res = fetcher.doGet(url, null);
        System.out.println(res);
    }

    @Test
    public void fetchWeiboFans() throws URISyntaxException {
        Fetcher fetcher = new Fetcher();
        String url = "https://m.weibo.cn/api/container/getSecond";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("containerid", "1005052908761947_-_FANS");
        params.put("page", "4");
        String res = fetcher.doGet(url, params);
        System.out.println(res);
    }
}
