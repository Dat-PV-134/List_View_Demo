package com.android45.foodlistview;

public class Food {
    int img;
    String foodName;
    String description;
    String ship;
    String minMoney;

    public Food(int img, String foodName, String description, String ship, String minMoney) {
        this.img = img;
        this.foodName = foodName;
        this.description = description;
        this.ship = ship;
        this.minMoney = minMoney;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(String minMoney) {
        this.minMoney = minMoney;
    }
}
