package com.gildedrose.item;

public class SulfurasItem extends UpdatableItem {
    public static final String NAME = "Sulfuras, Hand of Ragnaros";

    public SulfurasItem(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void update() {
        // Legendary items never change.
    }
}
