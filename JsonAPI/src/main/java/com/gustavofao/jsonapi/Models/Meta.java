package com.gustavofao.jsonapi.Models;

import com.gustavofao.jsonapi.Annotations.SerialName;

/**
 * Created by Kusraev Soslan on 4/6/18.
 */
public class Meta {
    @SerialName("page")
    private Page page;

    @SerialName("total")
    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public Page getPage() {
        return page;
    }
}
