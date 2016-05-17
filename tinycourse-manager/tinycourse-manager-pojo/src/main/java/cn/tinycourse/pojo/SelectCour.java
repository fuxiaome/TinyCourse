package cn.tinycourse.pojo;

import java.util.Date;

public class SelectCour {
    private Integer selCourId;

    private Integer courId;

    private Integer userId;

    private Date selCourDate;

    private Integer selCourSchedule;

    private Integer selCourDone;

    public Integer getSelCourId() {
        return selCourId;
    }

    public void setSelCourId(Integer selCourId) {
        this.selCourId = selCourId;
    }

    public Integer getCourId() {
        return courId;
    }

    public void setCourId(Integer courId) {
        this.courId = courId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSelCourDate() {
        return selCourDate;
    }

    public void setSelCourDate(Date selCourDate) {
        this.selCourDate = selCourDate;
    }

    public Integer getSelCourSchedule() {
        return selCourSchedule;
    }

    public void setSelCourSchedule(Integer selCourSchedule) {
        this.selCourSchedule = selCourSchedule;
    }

    public Integer getSelCourDone() {
        return selCourDone;
    }

    public void setSelCourDone(Integer selCourDone) {
        this.selCourDone = selCourDone;
    }
}