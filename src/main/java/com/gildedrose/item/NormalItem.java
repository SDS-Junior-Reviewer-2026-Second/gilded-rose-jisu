package com.gildedrose.item;

public class NormalItem extends UpdatableItem {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseQuality(sellIn <= 0 ? 2 : 1);
        decreaseSellIn();
    }
}
