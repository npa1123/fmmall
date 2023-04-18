package com.hfxt.fmmall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private long userId;
  private String username;
  private String password;
  private String nickname;
  private String realname;
  private String userImg;
  private String userMobile;
  private String userEmail;
  private String userSex;
  private Date userBirth;
  private Date userRegtime;
  private Date userModtime;
}
