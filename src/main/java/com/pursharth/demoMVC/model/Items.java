package com.pursharth.demoMVC.model;

public class Items {

    public int itemId;
    public String itemPicUrl;
    public String itemName;
    public int itemPrice;

    public Items(int itemId, String itemPicUrl, String itemName, int itemPrice) {
        this.itemId = itemId;
        this.itemPicUrl = itemPicUrl;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemPicUrl() {
        return itemPicUrl;
    }

    public void setItemPicUrl(String itemPicUrl) {
        this.itemPicUrl = itemPicUrl;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
