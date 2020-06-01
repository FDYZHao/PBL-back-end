package com.pbl.backend.entity;

/**
 * @ClassName Disscussion
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

public class Discussion {
    private int disc_id;
    private String user_id;
    private int pj_id;
    private String disc_title;
    private String disc_message;

    public int getDisc_id() {
        return disc_id;
    }

    public int getPj_id() {
        return pj_id;
    }

    public String getDisc_message() {
        return disc_message;
    }

    public String getDisc_title() {
        return disc_title;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setDisc_id(int disc_id) {
        this.disc_id = disc_id;
    }

    public void setDisc_message(String disc_message) {
        this.disc_message = disc_message;
    }

    public void setDisc_title(String disc_title) {
        this.disc_title = disc_title;
    }

    public void setPj_id(int pj_id) {
        this.pj_id = pj_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
