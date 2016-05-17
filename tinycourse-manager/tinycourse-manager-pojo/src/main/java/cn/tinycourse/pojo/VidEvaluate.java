package cn.tinycourse.pojo;

import java.util.Date;

public class VidEvaluate {
    private Integer vidEvaId;

    private Integer userId;

    private Integer vidId;

    private String vidEvaText;

    private Date vidEvaDate;

    public Integer getVidEvaId() {
        return vidEvaId;
    }

    public void setVidEvaId(Integer vidEvaId) {
        this.vidEvaId = vidEvaId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }

    public String getVidEvaText() {
        return vidEvaText;
    }

    public void setVidEvaText(String vidEvaText) {
        this.vidEvaText = vidEvaText == null ? null : vidEvaText.trim();
    }

    public Date getVidEvaDate() {
        return vidEvaDate;
    }

    public void setVidEvaDate(Date vidEvaDate) {
        this.vidEvaDate = vidEvaDate;
    }
}