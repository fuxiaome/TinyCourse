package cn.tinycourse.pojo;

import java.util.Date;

public class Follow {
    private Integer folId;

    private Integer folUser;

    private Integer folUsered;

    private Date folDate;

    public Integer getFolId() {
        return folId;
    }

    public void setFolId(Integer folId) {
        this.folId = folId;
    }

    public Integer getFolUser() {
        return folUser;
    }

    public void setFolUser(Integer folUser) {
        this.folUser = folUser;
    }

    public Integer getFolUsered() {
        return folUsered;
    }

    public void setFolUsered(Integer folUsered) {
        this.folUsered = folUsered;
    }

    public Date getFolDate() {
        return folDate;
    }

    public void setFolDate(Date folDate) {
        this.folDate = folDate;
    }
}