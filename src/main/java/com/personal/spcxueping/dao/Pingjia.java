package com.personal.spcxueping.dao;

import java.util.Date;

public class Pingjia extends PingjiaKey {
    private Boolean audit;

    private Date reltime;

    private String text;

    private Boolean hidename;

    private String aid;

    private Date createtime;

    public Boolean getAudit() {
        return audit;
    }

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    public Date getReltime() {
        return reltime;
    }

    public void setReltime(Date reltime) {
        this.reltime = reltime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getHidename() {
        return hidename;
    }

    public void setHidename(Boolean hidename) {
        this.hidename = hidename;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}