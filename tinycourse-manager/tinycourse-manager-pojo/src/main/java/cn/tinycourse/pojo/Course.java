package cn.tinycourse.pojo;

public class Course {
    private Integer courId;

    private Integer teaId;

    private Integer courTypeId;

    private String courName;

    private Integer courStu;

    private String courDescription;

    private Integer courGrade;

    private String courImage;

    public Integer getCourId() {
        return courId;
    }

    public void setCourId(Integer courId) {
        this.courId = courId;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public Integer getCourTypeId() {
        return courTypeId;
    }

    public void setCourTypeId(Integer courTypeId) {
        this.courTypeId = courTypeId;
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName == null ? null : courName.trim();
    }

    public Integer getCourStu() {
        return courStu;
    }

    public void setCourStu(Integer courStu) {
        this.courStu = courStu;
    }

    public String getCourDescription() {
        return courDescription;
    }

    public void setCourDescription(String courDescription) {
        this.courDescription = courDescription == null ? null : courDescription.trim();
    }

    public Integer getCourGrade() {
        return courGrade;
    }

    public void setCourGrade(Integer courGrade) {
        this.courGrade = courGrade;
    }

    public String getCourImage() {
        return courImage;
    }

    public void setCourImage(String courImage) {
        this.courImage = courImage == null ? null : courImage.trim();
    }
}