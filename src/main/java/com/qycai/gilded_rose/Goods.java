package com.qycai.gilded_rose;

public class Goods {
    private String name;
    protected double quality;
    protected int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateByDay() {
    }

    protected void decreaseSellInBy1() {
        sellIn = sellIn - 1;
    }

    protected void increaseQualityBy1() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    protected void decreaseQualityBy1() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public double getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}
