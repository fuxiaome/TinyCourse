package cn.tinycourse.pojo;

import java.util.Date;

public class Content {
    private Integer conId;

    private Integer artId;

    private Integer userId;

    private String conText;

    private Date conDate;

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConText() {
        return conText;
    }

    public void setConText(String conText) {
        this.conText = conText == null ? null : conText.trim();
    }

    public Date getConDate() {
        return conDate;
    }

    public void setConDate(Date conDate) {
        this.conDate = conDate;
    }
}