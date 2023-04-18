package com.hfxt.fmmall.entity;


public class ShoppingCart {

  private long cartId;
  private String productId;
  private String skuId;
  private String userId;
  private String cartNum;
  private String cartTime;
  private double productPrice;
  private String skuProps;


  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getCartNum() {
    return cartNum;
  }

  public void setCartNum(String cartNum) {
    this.cartNum = cartNum;
  }


  public String getCartTime() {
    return cartTime;
  }

  public void setCartTime(String cartTime) {
    this.cartTime = cartTime;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public String getSkuProps() {
    return skuProps;
  }

  public void setSkuProps(String skuProps) {
    this.skuProps = skuProps;
  }

}
