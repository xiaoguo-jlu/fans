package com.qingmu.spider.weibo.model;

import java.util.List;

public class Card {
    private String card_type;
    private String title;
    private String itemid;
    private List<Card> card_group;
    private User user;

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public List<Card> getCard_group() {
        return card_group;
    }

    public void setCard_group(List<Card> card_group) {
        this.card_group = card_group;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card_type='" + card_type + '\'' +
                ", title='" + title + '\'' +
                ", itemid='" + itemid + '\'' +
                ", card_group=" + card_group +
                '}';
    }
}
