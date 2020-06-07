package com.qycai.gilded_rose;

import com.qycai.gilded_rose.Goods.Goods;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BackStagePassTest {
    @Test
    void should_quality_increase_by1_and_sellIn_decrease_by1_when_update_given_sellIn_above_10_and_quality_between_0_49() {
        double oldQuality = 29;
        int oldSellIn = 13;
        Goods goods = new Goods("backStagePass", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();
        assertThat(newQuality).isEqualTo(oldQuality + 1);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }
}
