package net.xdclass.project.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chapter {

  private int id;
  @JsonProperty("video_id")
  private int videoId;
  private String title;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getVideoId() {
    return videoId;
  }

  public void setVideoId(int videoId) {
    this.videoId = videoId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Chapter{" + "id=" + id + ", videoId=" + videoId + ", title='" + title + '\'' + '}';
  }
}
