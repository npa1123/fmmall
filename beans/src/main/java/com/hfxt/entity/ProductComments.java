package com.hfxt.entity;


public class ProductComments {

  private String commId;
  private String productId;
  private String productName;
  private String orderItemId;
  private String userId;
  private long isAnonymous;
  private long commType;
  private long commLevel;
  private String commContent;
  private String commImgs;
  private java.sql.Timestamp sepcName;
  private long replyStatus;
  private String replyContent;
  private java.sql.Timestamp replyTime;
  private long isShow;


  public String getCommId() {
    return commId;
  }

  public void setCommId(String commId) {
    this.commId = commId;
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


  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public long getIsAnonymous() {
    return isAnonymous;
  }

  public void setIsAnonymous(long isAnonymous) {
    this.isAnonymous = isAnonymous;
  }


  public long getCommType() {
    return commType;
  }

  public void setCommType(long commType) {
    this.commType = commType;
  }


  public long getCommLevel() {
    return commLevel;
  }

  public void setCommLevel(long commLevel) {
    this.commLevel = commLevel;
  }


  public String getCommContent() {
    return commContent;
  }

  public void setCommContent(String commContent) {
    this.commContent = commContent;
  }


  public String getCommImgs() {
    return commImgs;
  }

  public void setCommImgs(String commImgs) {
    this.commImgs = commImgs;
  }


  public java.sql.Timestamp getSepcName() {
    return sepcName;
  }

  public void setSepcName(java.sql.Timestamp sepcName) {
    this.sepcName = sepcName;
  }


  public long getReplyStatus() {
    return replyStatus;
  }

  public void setReplyStatus(long replyStatus) {
    this.replyStatus = replyStatus;
  }


  public String getReplyContent() {
    return replyContent;
  }

  public void setReplyContent(String replyContent) {
    this.replyContent = replyContent;
  }


  public java.sql.Timestamp getReplyTime() {
    return replyTime;
  }

  public void setReplyTime(java.sql.Timestamp replyTime) {
    this.replyTime = replyTime;
  }


  public long getIsShow() {
    return isShow;
  }

  public void setIsShow(long isShow) {
    this.isShow = isShow;
  }

}
