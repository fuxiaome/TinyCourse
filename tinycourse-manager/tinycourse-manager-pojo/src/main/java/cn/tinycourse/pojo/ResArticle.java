package cn.tinycourse.pojo;

public class ResArticle {
    private Integer resArtId;

    private Integer resId;

    private Integer userId;

    private String resArtTitle;

    private String resArtContent;

    private Integer resArtCost;

    private Integer resArtDownload;

    private Integer resArtGrade;

    public Integer getResArtId() {
        return resArtId;
    }

    public void setResArtId(Integer resArtId) {
        this.resArtId = resArtId;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getResArtTitle() {
        return resArtTitle;
    }

    public void setResArtTitle(String resArtTitle) {
        this.resArtTitle = resArtTitle == null ? null : resArtTitle.trim();
    }

    public String getResArtContent() {
        return resArtContent;
    }

    public void setResArtContent(String resArtContent) {
        this.resArtContent = resArtContent == null ? null : resArtContent.trim();
    }

    public Integer getResArtCost() {
        return resArtCost;
    }

    public void setResArtCost(Integer resArtCost) {
        this.resArtCost = resArtCost;
    }

    public Integer getResArtDownload() {
        return resArtDownload;
    }

    public void setResArtDownload(Integer resArtDownload) {
        this.resArtDownload = resArtDownload;
    }

    public Integer getResArtGrade() {
        return resArtGrade;
    }

    public void setResArtGrade(Integer resArtGrade) {
        this.resArtGrade = resArtGrade;
    }
}