package com.personal.spcxueping.dao;

import java.util.Date;

public class Admin {
    private String userid;

    private String apswd;

    private String aid;

    private Date createtime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getApswd() {
        return apswd;
    }

    public void setApswd(String apswd) {
        this.apswd = apswd;
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