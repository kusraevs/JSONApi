package com.gustavofao.jsonapi.Models;

import com.gustavofao.jsonapi.Annotations.SerialName;

public class Links {
    @SerialName("self")
    private String self;

    @SerialName("first")
    private String first;

    @SerialName("prev")
    private String prev;

    @SerialName("next")
    private String next;

    @SerialName("last")
    private String last;

    @SerialName("related")
    private String related;

    @SerialName("meta")
    private Meta meta;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
