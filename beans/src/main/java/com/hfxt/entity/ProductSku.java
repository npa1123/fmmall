package com.hfxt.entity;


public class ProductSku {

  private String skuId;
  private String productId;
  private String skuName;
  private String skuImg;
  private String untitled;
  private long originalPrice;
  private long sellPrice;
  private double discounts;
  private long stock;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long status;


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public String getSkuImg() {
    return skuImg;
  }

  public void setSkuImg(String skuImg) {
    this.skuImg = skuImg;
  }


  public String getUntitled() {
    return untitled;
  }

  public void setUntitled(String untitled) {
    this.untitled = untitled;
  }


  public long getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(long originalPrice) {
    this.originalPrice = originalPrice;
  }


  public long getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(long sellPrice) {
    this.sellPrice = sellPrice;
  }


  public double getDiscounts() {
    return discounts;
  }

  public void setDiscounts(double discounts) {
    this.discounts = discounts;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
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


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
