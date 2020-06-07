package com.qycai.gilded_rose;

import com.qycai.gilded_rose.Goods.Goods;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class NormalGoodsTest {

    @Test
    void should_quality_decrease_by1_and_sellIn_decrease_by1_when_update_given_in_sell_and_quality_between_0_50() {
        double oldQuality = 34;
        int oldSellIn = 10;
        Goods goods = new Goods("normalGoods", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();
        assertThat(newQuality).isEqualTo(oldQuality - 1);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

    @Test
    void should_quality_be_0_and_sellIn_decrease_by1_when_update_given_in_sell_and_quality_is_0() {
        double oldQuality = 0;
        int oldSellIn = 10;
        Goods goods = new Goods("normalGoods", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();
        assertThat(newQuality).isEqualTo(0);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }
}
