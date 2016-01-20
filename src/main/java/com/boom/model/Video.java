package com.boom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Video{
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;
  private String title;
  private String uri;
  private int likes;
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedAt;


  protected Video() {}
  
  public Video(String uri, String title, int likes, Date createdAt, Date updatedAt){
    this.uri        = uri;
    this.title      = title;
    this.likes      = likes;
    this.createdAt  = createdAt;
    this.updatedAt  = updatedAt;
  }

  @Override
  public String toString() {
    return String.format("Video[id=%d]", id);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


}
