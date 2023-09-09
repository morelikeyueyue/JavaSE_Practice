package com.itheima.domain;

import java.io.Serial;
import java.io.Serializable;

public class DiaryInfo implements Serializable {


    @Serial
    private static final long serialVersionUID = -8164190721951851954L;
    private int id;
    private String title;
    private String area;

    public DiaryInfo() {
    }

    public DiaryInfo(String title, String area) {
        this.title = title;
        this.area = area;
    }

    public DiaryInfo(int id, String title, String area) {
        this.id = id;
        this.title = title;
        this.area = area;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    public String toString() {
        return "\""+id+"\",\""+title+"\",\""+area+"\"";
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
}
