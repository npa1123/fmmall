package com.hfxt.entity;

import lombok.Data;

@Data
public class Users {

  private long userId;
  private String username;
  private String password;
  private String nickname;
  private String realname;
  private String userImg;
  private String userMobile;
  private String userEmail;
  private String userSex;
  private java.sql.Date userBirth;
  private java.sql.Timestamp userRegtime;
  private java.sql.Timestamp userModtime;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
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


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getUserImg() {
    return userImg;
  }

  public void setUserImg(String userImg) {
    this.userImg = userImg;
  }


  public String getUserMobile() {
    return userMobile;
  }

  public void setUserMobile(String userMobile) {
    this.userMobile = userMobile;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public java.sql.Date getUserBirth() {
    return userBirth;
  }

  public void setUserBirth(java.sql.Date userBirth) {
    this.userBirth = userBirth;
  }


  public java.sql.Timestamp getUserRegtime() {
    return userRegtime;
  }

  public void setUserRegtime(java.sql.Timestamp userRegtime) {
    this.userRegtime = userRegtime;
  }


  public java.sql.Timestamp getUserModtime() {
    return userModtime;
  }

  public void setUserModtime(java.sql.Timestamp userModtime) {
    this.userModtime = userModtime;
  }

}
