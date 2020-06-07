package com.qycai.gilded_rose;

public class BackstagePass extends Goods {
    public BackstagePass(double quality, int sellIn) {
        super("backStagePass", quality, sellIn);
    }

    @Override
    public void updateByDay() {
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
