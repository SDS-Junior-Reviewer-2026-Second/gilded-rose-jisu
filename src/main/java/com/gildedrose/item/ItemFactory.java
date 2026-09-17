package com.gildedrose.item;

public final class ItemFactory {

    private ItemFactory() {
    }

    public static UpdatableItem from(Item item) {
        if (item instanceof UpdatableItem) {
            return (UpdatableItem) item;
        }

        switch (item.name) {
            case AgedBrieItem.NAME:
                return new AgedBrieItem(item.sellIn, item.quality);
            case BackstagePassItem.NAME:
                return new BackstagePassItem(item.sellIn, item.quality);
            case SulfurasItem.NAME:
                return new SulfurasItem(item.sellIn, item.quality);
            default:
                return new NormalItem(item.name, item.sellIn, item.quality);
        }
    }
}
