package com.qycai.gilded_rose.Goods;

public class Goods {
    private String name;
    private double quality;
    private int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateByDay() {
        if (quality > 0) {
            quality = quality - 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }

    public double getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}
