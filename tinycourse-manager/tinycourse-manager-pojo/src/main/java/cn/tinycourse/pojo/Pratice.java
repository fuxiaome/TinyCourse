package cn.tinycourse.pojo;

public class Pratice {
    private Integer praId;

    private Integer vidId;

    private String praQuestion;

    private String praOptiona;

    private String praOptionb;

    private String praOptionc;

    private String praOptiond;

    private Integer praRight;

    private Integer praOrder;

    public Integer getPraId() {
        return praId;
    }

    public void setPraId(Integer praId) {
        this.praId = praId;
    }

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }

    public String getPraQuestion() {
        return praQuestion;
    }

    public void setPraQuestion(String praQuestion) {
        this.praQuestion = praQuestion == null ? null : praQuestion.trim();
    }

    public String getPraOptiona() {
        return praOptiona;
    }

    public void setPraOptiona(String praOptiona) {
        this.praOptiona = praOptiona == null ? null : praOptiona.trim();
    }

    public String getPraOptionb() {
        return praOptionb;
    }

    public void setPraOptionb(String praOptionb) {
        this.praOptionb = praOptionb == null ? null : praOptionb.trim();
    }

    public String getPraOptionc() {
        return praOptionc;
    }

    public void setPraOptionc(String praOptionc) {
        this.praOptionc = praOptionc == null ? null : praOptionc.trim();
    }

    public String getPraOptiond() {
        return praOptiond;
    }

    public void setPraOptiond(String praOptiond) {
        this.praOptiond = praOptiond == null ? null : praOptiond.trim();
    }

    public Integer getPraRight() {
        return praRight;
    }

    public void setPraRight(Integer praRight) {
        this.praRight = praRight;
    }

    public Integer getPraOrder() {
        return praOrder;
    }

    public void setPraOrder(Integer praOrder) {
        this.praOrder = praOrder;
    }
}