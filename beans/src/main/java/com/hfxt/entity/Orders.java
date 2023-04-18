package com.hfxt.entity;


public class Orders {

  private String orderId;
  private String userId;
  private String untitled;
  private String receiverName;
  private String receiverMobile;
  private String receiverAddress;
  private double totalAmount;
  private long actualAmount;
  private long payType;
  private String orderRemark;
  private String status;
  private String deliveryType;
  private String deliveryFlowId;
  private double orderFreight;
  private long deleteStatus;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private java.sql.Timestamp payTime;
  private java.sql.Timestamp deliveryTime;
  private java.sql.Timestamp flishTime;
  private java.sql.Timestamp cancelTime;
  private long closeType;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUntitled() {
    return untitled;
  }

  public void setUntitled(String untitled) {
    this.untitled = untitled;
  }


  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }


  public String getReceiverMobile() {
    return receiverMobile;
  }

  public void setReceiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
  }


  public String getReceiverAddress() {
    return receiverAddress;
  }

  public void setReceiverAddress(String receiverAddress) {
    this.receiverAddress = receiverAddress;
  }


  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public long getActualAmount() {
    return actualAmount;
  }

  public void setActualAmount(long actualAmount) {
    this.actualAmount = actualAmount;
  }


  public long getPayType() {
    return payType;
  }

  public void setPayType(long payType) {
    this.payType = payType;
  }


  public String getOrderRemark() {
    return orderRemark;
  }

  public void setOrderRemark(String orderRemark) {
    this.orderRemark = orderRemark;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }


  public String getDeliveryFlowId() {
    return deliveryFlowId;
  }

  public void setDeliveryFlowId(String deliveryFlowId) {
    this.deliveryFlowId = deliveryFlowId;
  }


  public double getOrderFreight() {
    return orderFreight;
  }

  public void setOrderFreight(double orderFreight) {
    this.orderFreight = orderFreight;
  }


  public long getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(long deleteStatus) {
    this.deleteStatus = deleteStatus;
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


  public java.sql.Timestamp getPayTime() {
    return payTime;
  }

  public void setPayTime(java.sql.Timestamp payTime) {
    this.payTime = payTime;
  }


  public java.sql.Timestamp getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(java.sql.Timestamp deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public java.sql.Timestamp getFlishTime() {
    return flishTime;
  }

  public void setFlishTime(java.sql.Timestamp flishTime) {
    this.flishTime = flishTime;
  }


  public java.sql.Timestamp getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(java.sql.Timestamp cancelTime) {
    this.cancelTime = cancelTime;
  }


  public long getCloseType() {
    return closeType;
  }

  public void setCloseType(long closeType) {
    this.closeType = closeType;
  }

}
