package cn.tinycourse.pojo;

import java.util.Date;

public class ArtLike {
    private Integer artLikeId;

    private Integer artId;

    private Integer userId;

    private Date artLikeDate;

    public Integer getArtLikeId() {
        return artLikeId;
    }

    public void setArtLikeId(Integer artLikeId) {
        this.artLikeId = artLikeId;
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

    public Date getArtLikeDate() {
        return artLikeDate;
    }

    public void setArtLikeDate(Date artLikeDate) {
        this.artLikeDate = artLikeDate;
    }
}