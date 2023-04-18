package com.hfxt.fmmall.entity;


public class OrderItem {

  private String itemId;
  private String orderId;
  private String productId;
  private String productName;
  private String productImg;
  private String skuId;
  private String skuName;
  private double productPrice;
  private long buyCounts;
  private double totalAmount;
  private java.sql.Timestamp basketDate;
  private java.sql.Timestamp buyTime;
  private long isComment;


  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


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


  public String getProductImg() {
    return productImg;
  }

  public void setProductImg(String productImg) {
    this.productImg = productImg;
  }


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public long getBuyCounts() {
    return buyCounts;
  }

  public void setBuyCounts(long buyCounts) {
    this.buyCounts = buyCounts;
  }


  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public java.sql.Timestamp getBasketDate() {
    return basketDate;
  }

  public void setBasketDate(java.sql.Timestamp basketDate) {
    this.basketDate = basketDate;
  }


  public java.sql.Timestamp getBuyTime() {
    return buyTime;
  }

  public void setBuyTime(java.sql.Timestamp buyTime) {
    this.buyTime = buyTime;
  }


  public long getIsComment() {
    return isComment;
  }

  public void setIsComment(long isComment) {
    this.isComment = isComment;
  }

}
