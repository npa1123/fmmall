package com.hfxt.entity;


public class IndexImg {

  private String imgId;
  private String imgUrl;
  private String imgBgColor;
  private String prodId;
  private String categoryId;
  private long indexType;
  private long seq;
  private long status;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public String getImgId() {
    return imgId;
  }

  public void setImgId(String imgId) {
    this.imgId = imgId;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public String getImgBgColor() {
    return imgBgColor;
  }

  public void setImgBgColor(String imgBgColor) {
    this.imgBgColor = imgBgColor;
  }


  public String getProdId() {
    return prodId;
  }

  public void setProdId(String prodId) {
    this.prodId = prodId;
  }


  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public long getIndexType() {
    return indexType;
  }

  public void setIndexType(long indexType) {
    this.indexType = indexType;
  }


  public long getSeq() {
    return seq;
  }

  public void setSeq(long seq) {
    this.seq = seq;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
