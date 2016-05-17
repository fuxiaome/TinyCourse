package cn.tinycourse.pojo;

import java.util.Date;

public class Video {
    private Integer vidId;

    private Integer courId;

    private String vidName;

    private String vidPath;

    private Date vidDate;

    private Integer vidOrder;

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }

    public Integer getCourId() {
        return courId;
    }

    public void setCourId(Integer courId) {
        this.courId = courId;
    }

    public String getVidName() {
        return vidName;
    }

    public void setVidName(String vidName) {
        this.vidName = vidName == null ? null : vidName.trim();
    }

    public String getVidPath() {
        return vidPath;
    }

    public void setVidPath(String vidPath) {
        this.vidPath = vidPath == null ? null : vidPath.trim();
    }

    public Date getVidDate() {
        return vidDate;
    }

    public void setVidDate(Date vidDate) {
        this.vidDate = vidDate;
    }

    public Integer getVidOrder() {
        return vidOrder;
    }

    public void setVidOrder(Integer vidOrder) {
        this.vidOrder = vidOrder;
    }
}