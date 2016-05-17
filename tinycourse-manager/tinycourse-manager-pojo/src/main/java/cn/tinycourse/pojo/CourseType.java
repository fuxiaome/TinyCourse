package cn.tinycourse.pojo;

public class CourseType {
    private Integer courTypeId;

    private String courTypeName;

    public Integer getCourTypeId() {
        return courTypeId;
    }

    public void setCourTypeId(Integer courTypeId) {
        this.courTypeId = courTypeId;
    }

    public String getCourTypeName() {
        return courTypeName;
    }

    public void setCourTypeName(String courTypeName) {
        this.courTypeName = courTypeName == null ? null : courTypeName.trim();
    }
}