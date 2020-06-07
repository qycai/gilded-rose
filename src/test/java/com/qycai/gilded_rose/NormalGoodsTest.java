package com.qycai.gilded_rose;

import com.qycai.gilded_rose.Goods.Goods;
import com.qycai.gilded_rose.NormalGoods.NormalGoods;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class NormalGoodsTest {

    @Test
    void should_quality_decrease_by1_and_sellIn_decrease_by1_when_update_given_in_sell_and_quality_between_1_50() {
        double oldQuality = 34;
        int oldSellIn = 10;
        Goods goods = new NormalGoods(oldQuality, oldSellIn);
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
        Goods goods = new NormalGoods(oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();
        assertThat(newQuality).isEqualTo(0);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

    @Test
    void should_quality_decrease_by2_and_sellIn_decrease_by1_when_update_given_out_sell_and_quality_between_2_50() {
        double oldQuality = 3;
        int oldSellIn = 0;
        Goods goods = new NormalGoods(oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();
        assertThat(newQuality).isEqualTo(oldQuality - 2);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

    @Test
    void should_quality_be_0_and_sellIn_decrease_by1_when_update_given_out_sell_and_quality_is_1() {
        double oldQuality = 1;
        int oldSellIn = -1;
        Goods goods = new NormalGoods(oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();
        assertThat(newQuality).isEqualTo(0);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }
}
