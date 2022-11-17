package com.atguigu.crowd.entity;

import java.util.Date;

public class Admin {
    private Integer id;

    private String usrAcct;

    private String usrPswd;

    private String usrAlias;

    private String email;

    private Date createTime;

    public Admin() {
    }

    public Admin(Integer id, String usrAcct, String usrPswd, String usrAlias, String email, Date createTime) {
        this.id = id;
        this.usrAcct = usrAcct;
        this.usrPswd = usrPswd;
        this.usrAlias = usrAlias;
        this.email = email;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsrAcct() {
        return usrAcct;
    }

    public void setUsrAcct(String usrAcct) {
        this.usrAcct = usrAcct == null ? null : usrAcct.trim();
    }

    public String getUsrPswd() {
        return usrPswd;
    }

    public void setUsrPswd(String usrPswd) {
        this.usrPswd = usrPswd == null ? null : usrPswd.trim();
    }

    public String getUsrAlias() {
        return usrAlias;
    }

    public void setUsrAlias(String usrAlias) {
        this.usrAlias = usrAlias == null ? null : usrAlias.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", usrAcct='" + usrAcct + '\'' +
                ", usrPswd='" + usrPswd + '\'' +
                ", usrAlias='" + usrAlias + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}