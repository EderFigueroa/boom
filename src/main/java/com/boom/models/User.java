package com.boom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;
  private String username;
  private String password;
  private boolean enabled;


  protected User() {}
  
  public User(boolean enabled, String username, String password){
    this.username = username;
    this.password = password;
    this.enabled  = enabled;
  }

  @Override
  public String toString() {
    return String.format("User[id=%d]", id);
  }

}
