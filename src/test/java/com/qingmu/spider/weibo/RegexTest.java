package com.qingmu.spider.weibo;

import org.junit.jupiter.api.Test;

public class RegexTest {
    @Test
    public void testFans() {
        String pattern = "全部粉丝";
        String s1 = "他的全部粉丝";
        String s2 = "她的全部粉丝";
        System.out.println(s1.indexOf(pattern));
        System.out.println(s2.indexOf(pattern));
        assert (-1 == s1.indexOf(pattern)) : "错误";
    }
}
