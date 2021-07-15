package com.personal.spcxueping.dao;

import java.util.Date;

public class ReturnSourceBySearch {
    private String cno;
    private String cname;
    private int numberofappraise;
    private Date recentappraisenumber;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getNumberofappraise() {
        return numberofappraise;
    }

    public void setNumberofappraise(int numberofappraise) {
        this.numberofappraise = numberofappraise;
    }

    public Date getRecentappraisenumber() {
        return recentappraisenumber;
    }

    public void setRecentappraisenumber(Date recentappraisenumber) {
        this.recentappraisenumber = recentappraisenumber;
    }
}
