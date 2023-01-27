package net.xdclass.project.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User implements Serializable {
  private int id;
  private String username;
//  @JsonIgnore
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;

  public User() {
  }

  public User(int id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{"
        + "id="
        + id
        + ", username='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + '}';
  }
}
