package com.qycai.gilded_rose.Goods;

public class Goods {
    private String name;
    private double quality;
    protected int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateByDay() {
        if (name.equals("backStagePass")) {
            increaseQualityBy1();
            if (sellIn < 11) {
                increaseQualityBy1();
            }
            if (sellIn < 6) {
                increaseQualityBy1();
            }
            if (sellIn <= 0) {
                quality = 0;
            }
            decreaseSellInBy1();
        }
    }

    protected void decreaseSellInBy1() {
        sellIn = sellIn - 1;
    }

    private void increaseQualityBy1() {
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
