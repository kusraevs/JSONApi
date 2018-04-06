package com.gustavofao.jsonapi.Models;

import com.gustavofao.jsonapi.Annotations.SerialName;

/**
 * Created by Kusraev Soslan on 4/6/18.
 */
public class Page {
    @SerialName("size")
    private Integer size;

    @SerialName("number")
    private Integer number;

    public Integer getSize() {
        return size;
    }

    public Integer getNumber() {
        return number;
    }
}
