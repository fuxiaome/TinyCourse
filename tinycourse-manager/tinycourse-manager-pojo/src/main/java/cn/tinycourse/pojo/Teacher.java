package cn.tinycourse.pojo;

public class Teacher {
    private Integer teaId;

    private String teaName;

    private Integer teaAge;

    private String teaDescription;

    private String teaImage;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public String getTeaDescription() {
        return teaDescription;
    }

    public void setTeaDescription(String teaDescription) {
        this.teaDescription = teaDescription == null ? null : teaDescription.trim();
    }

    public String getTeaImage() {
        return teaImage;
    }

    public void setTeaImage(String teaImage) {
        this.teaImage = teaImage == null ? null : teaImage.trim();
    }
}