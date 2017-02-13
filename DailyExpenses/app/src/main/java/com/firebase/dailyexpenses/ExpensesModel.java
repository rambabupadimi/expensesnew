package com.firebase.dailyexpenses;

/**
 * Created by eunoiatechnologies on 15/09/16.
 */

public class ExpensesModel {
    private String amount;
    private String description;
    private String flag;
    private String dateStore;
    private String createdTime;
    private String modifiedTime;

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getDateStore() {
        return dateStore;
    }

    public void setDateStore(String dateStore) {
        this.dateStore = dateStore;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
