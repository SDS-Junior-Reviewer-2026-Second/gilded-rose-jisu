package com.gildedrose.item;

public class BackstagePassItem extends UpdatableItem {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePassItem(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void update() {
        if (sellIn <= 0) {
            quality = 0;
        } else if (sellIn <= 5) {
            increaseQuality(3);
        } else if (sellIn <= 10) {
            increaseQuality(2);
        } else {
            increaseQuality(1);
        }

        decreaseSellIn();
    }
}
