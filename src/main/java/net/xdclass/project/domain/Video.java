package net.xdclass.project.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Video implements Serializable {
  private int id;

  private boolean isDeleted;
  private String name;
  private String summary;
  private int price;
  @JsonProperty("cover_image")
  private String coverImage;
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
  private Date tDate;

  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
  private Date uDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("chapter_list")
  private List<Chapter> chapterList;

  public Video(int id, boolean isDeleted, String name, String summary, int price, String coverImage, Date tDate, Date uDate) {
    this.id = id;
    this.isDeleted = isDeleted;
    this.name = name;
    this.summary = summary;
    this.price = price;
    this.coverImage = coverImage;
    this.tDate = tDate;
    this.uDate = uDate;
    this.chapterList = new ArrayList<>();
  }

  public Video() {}

  public Video(int id, String title) {
    this.id = id;
    this.name = title;
    this.tDate = new Date();
  }

  public Video(int id, String title, String summary, int price, String coverImage) {
    this.id = id;
    this.name = title;
    this.summary = summary;
    this.price = price;
    this.coverImage = coverImage;
    this.tDate = new Date();
    this.chapterList = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public Date getTDate() {
    return tDate;
  }

  public void setTDate(Date tdate) {
    this.tDate = tdate;
  }

  public boolean isDeleted() {
    return isDeleted;
  }

  public void setDeleted(boolean deleted) {
    isDeleted = deleted;
  }

  public Date getUDate() {
    return uDate;
  }

  public void setUDate(Date uDate) {
    this.uDate = uDate;
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
        + name
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
        + tDate
        + ", chapterList="
        + chapterList
        + '}';
  }
}
