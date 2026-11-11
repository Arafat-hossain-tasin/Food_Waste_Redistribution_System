package com.foodrescue;

public class FoodRequestModel {

    private int id;
    private String ngoName;
    private String foodCategory;
    private int quantity;
    private String foodStatus;
    private String requestStatus;

    public FoodRequestModel(int id, String ngoName,
                            String foodCategory, int quantity) {
        this.id = id;
        this.ngoName = ngoName;
        this.foodCategory = foodCategory;
        this.quantity = quantity;
        this.foodStatus = "Requested";
        this.requestStatus = "Pending";
    }

    public int getId() {
        return id;
    }

    public String getNgoName() {
        return ngoName;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFoodStatus() {
        return foodStatus;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
