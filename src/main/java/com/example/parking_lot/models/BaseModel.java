package com.example.parking_lot.models;

import java.util.Date;

public abstract class BaseModel {
   private int id;
   private Date createdAt;
   private Date updatedAt;


    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
