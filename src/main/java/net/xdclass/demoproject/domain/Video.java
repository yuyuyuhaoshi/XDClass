package net.xdclass.demoproject.domain;

import java.io.Serializable;
import java.util.Date;

public class Video implements Serializable {
    private int id;
    private String title;
    private String summary;
    private int price;
    private String coverImage;
    private Date tdate;

    public Video(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Video(int id, String title, String summary, int price, String coverImage) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.price = price;
        this.coverImage = coverImage;
        this.tdate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", coverImage='" + coverImage + '\'' +
                ", tdate=" + tdate +
                '}';
    }
}
