package cn.tinycourse.pojo;

import java.util.Date;

public class CourseGrade {
    private Integer courGraId;

    private Integer courId;

    private Integer userId;

    private Short courGraNum;

    private Date courGraDate;

    public Integer getCourGraId() {
        return courGraId;
    }

    public void setCourGraId(Integer courGraId) {
        this.courGraId = courGraId;
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

    public Short getCourGraNum() {
        return courGraNum;
    }

    public void setCourGraNum(Short courGraNum) {
        this.courGraNum = courGraNum;
    }

    public Date getCourGraDate() {
        return courGraDate;
    }

    public void setCourGraDate(Date courGraDate) {
        this.courGraDate = courGraDate;
    }
}