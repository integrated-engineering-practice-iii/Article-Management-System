package com.hengzhi.entity;/**
 * Created by Administrator on 2019/5/27.
 */

import javafx.scene.chart.PieChart;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * News
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
@Entity
@Table(name="news")
public class News {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="date")
    private String date;
    @Column(name="userId")
    private Integer userId;
    @Column(name="type")
    private String type;
    @Column(name="context")
    private String context;
    @Column(name = "display")
    private Boolean display;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" ).format(new Date());
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public News() {
    }

    public News(String title, Integer userId, String type, String context, Boolean display) {
        this.title = title;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" ).format(new Date());
        this.userId = userId;
        this.type = type;
        this.context = context;
        this.display = display;
    }

    public News(Integer id, String title, Integer userId, String type, String context, Boolean display) {
        this.id = id;
        this.title = title;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" ).format(new Date());
        this.userId = userId;
        this.type = type;
        this.context = context;
        this.display = display;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", userId=" + userId +
                ", type='" + type + '\'' +
                ", context='" + context + '\'' +
                ", display=" + display +
                '}';
    }
}
