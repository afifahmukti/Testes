/*
 * Copyright (c) 2017. http://hiteshsahu.com- All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * If you use or distribute this project then you MUST ADD A COPY OF LICENCE
 * along with the project.
 *  Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 */

package com.hitesh_sahu.retailapp.model.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by afi on 19/12/2017.
 */

public class produkFirebase implements Parcelable{

    String itemName, itemShortDesc, itemDetail, MRP, discount, sellMRP, quantity, imageURL, orderId;

    public produkFirebase() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemShortDesc() {
        return itemShortDesc;
    }

    public void setItemShortDesc(String itemShortDesc) {
        this.itemShortDesc = itemShortDesc;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getMRP() {
        return MRP;
    }

    public void setMRP(String MRP) {
        this.MRP = MRP;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getSellMRP() {
        return sellMRP;
    }

    public void setSellMRP(String sellMRP) {
        this.sellMRP = sellMRP;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public static Creator<produkFirebase> getCREATOR() {
        return CREATOR;
    }

    public produkFirebase(String itemName, String itemShortDesc, String itemDetail, String MRP, String discount, String sellMRP, String quantity, String imageURL, String orderId) {
        this.itemName = itemName;
        this.itemShortDesc = itemShortDesc;
        this.itemDetail = itemDetail;
        this.MRP = MRP;
        this.discount = discount;
        this.sellMRP = sellMRP;
        this.quantity = quantity;
        this.imageURL = imageURL;
        this.orderId = orderId;
    }

    protected produkFirebase(Parcel in) {
        itemName = in.readString();
        itemShortDesc = in.readString();
        itemDetail = in.readString();
        MRP = in.readString();
        discount = in.readString();
        sellMRP = in.readString();
        quantity = in.readString();
        imageURL = in.readString();
        orderId = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(itemName);
        dest.writeString(itemShortDesc);
        dest.writeString(itemDetail);
        dest.writeString(MRP);
        dest.writeString(discount);
        dest.writeString(sellMRP);
        dest.writeString(quantity);
        dest.writeString(imageURL);
        dest.writeString(orderId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<produkFirebase> CREATOR = new Creator<produkFirebase>() {
        @Override
        public produkFirebase createFromParcel(Parcel in) {
            return new produkFirebase(in);
        }

        @Override
        public produkFirebase[] newArray(int size) {
            return new produkFirebase[size];
        }
    };
}
