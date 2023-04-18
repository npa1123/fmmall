package com.hfxt.entity;


public class Category {

  private long categoryId;
  private String categoryName;
  private long categoryLevel;
  private long parentId;
  private String categoryIcon;
  private String categorySlogan;
  private String categoryPic;
  private String categoryBgColor;


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public long getCategoryLevel() {
    return categoryLevel;
  }

  public void setCategoryLevel(long categoryLevel) {
    this.categoryLevel = categoryLevel;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getCategoryIcon() {
    return categoryIcon;
  }

  public void setCategoryIcon(String categoryIcon) {
    this.categoryIcon = categoryIcon;
  }


  public String getCategorySlogan() {
    return categorySlogan;
  }

  public void setCategorySlogan(String categorySlogan) {
    this.categorySlogan = categorySlogan;
  }


  public String getCategoryPic() {
    return categoryPic;
  }

  public void setCategoryPic(String categoryPic) {
    this.categoryPic = categoryPic;
  }


  public String getCategoryBgColor() {
    return categoryBgColor;
  }

  public void setCategoryBgColor(String categoryBgColor) {
    this.categoryBgColor = categoryBgColor;
  }

}
