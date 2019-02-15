package com.hashmap.exercise;

public class Price {
    private int oneSharingWithFood=9500;
    private int twoSharingWithFood=6500;
    private int threeSharingWithFood=5500;

    public int getOneSharingWithFood() {
        return oneSharingWithFood;
    }

    public int getTwoSharingWithFood() {
        return twoSharingWithFood;
    }

    public int getThreeSharingWithFood() {
        return threeSharingWithFood;
    }

    public Price(int oneSharingWithFood, int twoSharingWithFood, int threeSharingWithFood) {
        this.oneSharingWithFood = oneSharingWithFood;
        this.twoSharingWithFood = twoSharingWithFood;
        this.threeSharingWithFood = threeSharingWithFood;
    }
}
