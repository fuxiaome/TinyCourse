package cn.tinycourse.pojo;

import java.util.Date;

public class ResEvaluate {
    private Integer resEvaId;

    private Integer resArtId;

    private Integer userId;

    private String resEvaText;

    private Date resEvaDate;

    private Integer resEvaGrade;

    public Integer getResEvaId() {
        return resEvaId;
    }

    public void setResEvaId(Integer resEvaId) {
        this.resEvaId = resEvaId;
    }

    public Integer getResArtId() {
        return resArtId;
    }

    public void setResArtId(Integer resArtId) {
        this.resArtId = resArtId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getResEvaText() {
        return resEvaText;
    }

    public void setResEvaText(String resEvaText) {
        this.resEvaText = resEvaText == null ? null : resEvaText.trim();
    }

    public Date getResEvaDate() {
        return resEvaDate;
    }

    public void setResEvaDate(Date resEvaDate) {
        this.resEvaDate = resEvaDate;
    }

    public Integer getResEvaGrade() {
        return resEvaGrade;
    }

    public void setResEvaGrade(Integer resEvaGrade) {
        this.resEvaGrade = resEvaGrade;
    }
}