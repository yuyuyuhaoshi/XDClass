package net.xdclass.demoproject.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.xdclass.demoproject.domain.Chapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Video implements Serializable {
  private int id;
  private String title;
  private String summary;
  private int price;


  @JsonProperty("cover_image")
  private String coverImage;

  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
  private Date tdate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("chapter_list")
  private List<Chapter> chapterList;

  public Video() {}

  public Video(int id, String title) {
    this.id = id;
    this.title = title;
    this.tdate = new Date();
  }

  public Video(int id, String title, String summary, int price, String coverImage) {
    this.id = id;
    this.title = title;
    this.summary = summary;
    this.price = price;
    this.coverImage = coverImage;
    this.tdate = new Date();
    this.chapterList = new ArrayList<>();
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

  public List<Chapter> getChapterList() {
    return chapterList;
  }

  public void setChapterList(List<Chapter> chapterList) {
    this.chapterList = chapterList;
  }

  @Override
  public String toString() {
    return "Video{"
        + "id="
        + id
        + ", title='"
        + title
        + '\''
        + ", summary='"
        + summary
        + '\''
        + ", price="
        + price
        + ", coverImage='"
        + coverImage
        + '\''
        + ", tdate="
        + tdate
        + ", chapterList="
        + chapterList
        + '}';
  }
}
