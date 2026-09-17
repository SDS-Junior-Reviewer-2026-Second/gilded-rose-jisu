package com.gildedrose.item;

public abstract class UpdatableItem extends Item {
    private static final int MAX_QUALITY = 50;

    protected UpdatableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void update();

    protected void increaseQuality(int amount) {
        if (quality < MAX_QUALITY) {
            quality = Math.min(MAX_QUALITY, quality + amount);
        }
    }

    protected void decreaseQuality(int amount) {
        if (quality > 0) {
            quality = Math.max(0, quality - amount);
        }
    }

    protected void decreaseSellIn() {
        sellIn--;
    }
}
