package cn.tinycourse.pojo;

import java.util.Date;

public class Chat {
    private Integer chatId;

    private Integer chatUserfrom;

    private Integer chatUserto;

    private Date chatDate;

    private String chatText;

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getChatUserfrom() {
        return chatUserfrom;
    }

    public void setChatUserfrom(Integer chatUserfrom) {
        this.chatUserfrom = chatUserfrom;
    }

    public Integer getChatUserto() {
        return chatUserto;
    }

    public void setChatUserto(Integer chatUserto) {
        this.chatUserto = chatUserto;
    }

    public Date getChatDate() {
        return chatDate;
    }

    public void setChatDate(Date chatDate) {
        this.chatDate = chatDate;
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText == null ? null : chatText.trim();
    }
}