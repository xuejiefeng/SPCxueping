package com.personal.spcxueping.dao;

import java.util.Date;

public class Plat_user {
    private String userid;

    private String userpswd;

    private String mibaoq;

    private String mibaoa;

    private String nickname;

    private Boolean cert;

    private Boolean ban;

    private String netid;

    private String aid;

    private Date createtime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getMibaoq() {
        return mibaoq;
    }

    public void setMibaoq(String mibaoq) {
        this.mibaoq = mibaoq;
    }

    public String getMibaoa() {
        return mibaoa;
    }

    public void setMibaoa(String mibaoa) {
        this.mibaoa = mibaoa;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getCert() {
        return cert;
    }

    public void setCert(Boolean cert) {
        this.cert = cert;
    }

    public Boolean getBan() {
        return ban;
    }

    public void setBan(Boolean ban) {
        this.ban = ban;
    }

    public String getNetid() {
        return netid;
    }

    public void setNetid(String netid) {
        this.netid = netid;
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