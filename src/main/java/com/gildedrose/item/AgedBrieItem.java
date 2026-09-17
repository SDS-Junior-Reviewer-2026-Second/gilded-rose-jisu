package com.gildedrose.item;

public class AgedBrieItem extends UpdatableItem {
    public static final String NAME = "Aged Brie";

    public AgedBrieItem(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality(sellIn <= 0 ? 2 : 1);
        decreaseSellIn();
    }
}
