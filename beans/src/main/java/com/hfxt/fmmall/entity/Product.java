package com.hfxt.fmmall.entity;


public class Product {

  private String productId;
  private String productName;
  private long categoryId;
  private long rootCategoryId;
  private long soldNum;
  private long productStatus;
  private String content;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public long getRootCategoryId() {
    return rootCategoryId;
  }

  public void setRootCategoryId(long rootCategoryId) {
    this.rootCategoryId = rootCategoryId;
  }


  public long getSoldNum() {
    return soldNum;
  }

  public void setSoldNum(long soldNum) {
    this.soldNum = soldNum;
  }


  public long getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(long productStatus) {
    this.productStatus = productStatus;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
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
