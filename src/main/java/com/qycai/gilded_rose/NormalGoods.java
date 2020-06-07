package com.qycai.gilded_rose;

public class NormalGoods extends Goods {
    public NormalGoods(double quality, int sellIn) {
        super("normalGoods", quality, sellIn);
    }

    @Override
    public void updateByDay() {
        decreaseQualityBy1();
        decreaseSellInBy1();
        if (sellIn < 0) {
            decreaseQualityBy1();
        }
    }
}
