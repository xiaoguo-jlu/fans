package com.qingmu.spider.common;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Fetcher {
    private HttpClient client = HttpClients.createDefault();

    public String doGet(String url) throws URISyntaxException {
        return doGet(url, null);
    }

    public String doGet(String url, HashMap<String, String> kvpairs) throws URISyntaxException {
        List<NameValuePair> params = new ArrayList<>();
        URIBuilder builder = new URIBuilder(url);
        if (kvpairs != null) {
            kvpairs.forEach((key, value) -> {
//                params.add(new BasicNameValuePair(key, value));
                builder.setParameter(key, value);
            });
        }
        URI uri = builder.build();
        HttpGet req = new HttpGet(uri);
        req.setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        String result = "";
        HttpResponse response = null;
        try {
            response = client.execute(req);
        } catch (IOException e) {
            System.out.println(e);
            return result;
        }
        if (response.getStatusLine().getStatusCode() == 200) {
            try {
                result = EntityUtils.toString(response.getEntity());
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return result;
    }
}
