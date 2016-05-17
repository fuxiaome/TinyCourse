package cn.tinycourse.pojo;

import java.util.Date;

public class Message {
    private Integer msgId;

    private Integer userId;

    private String msgText;

    private Date msgDate;

    private Integer msgDone;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText == null ? null : msgText.trim();
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    public Integer getMsgDone() {
        return msgDone;
    }

    public void setMsgDone(Integer msgDone) {
        this.msgDone = msgDone;
    }
}