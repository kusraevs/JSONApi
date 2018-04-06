package br.com.gustavofao.jsonapisample.V2;

import com.gustavofao.jsonapi.Annotations.Type;
import com.gustavofao.jsonapi.Models.Meta;
import com.gustavofao.jsonapi.Models.Resource;

import java.util.Date;

@Type("conversation")
public class Conversation extends Resource {

    private String message;
    private Date date;
    private Person person;
    private Meta meta;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
