package cn.tinycourse.pojo;

import java.util.Date;

public class Article {
    private Integer artId;

    private Integer userId;

    private String artTitle;

    private String artContent;

    private Integer artLike;

    private Date artPubdate;

    private Date artRepdate;

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

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle == null ? null : artTitle.trim();
    }

    public String getArtContent() {
        return artContent;
    }

    public void setArtContent(String artContent) {
        this.artContent = artContent == null ? null : artContent.trim();
    }

    public Integer getArtLike() {
        return artLike;
    }

    public void setArtLike(Integer artLike) {
        this.artLike = artLike;
    }

    public Date getArtPubdate() {
        return artPubdate;
    }

    public void setArtPubdate(Date artPubdate) {
        this.artPubdate = artPubdate;
    }

    public Date getArtRepdate() {
        return artRepdate;
    }

    public void setArtRepdate(Date artRepdate) {
        this.artRepdate = artRepdate;
    }
}