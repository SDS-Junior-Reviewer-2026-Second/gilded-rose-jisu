package com.gildedrose;

import com.gildedrose.item.Item;
import com.gildedrose.item.ItemFactory;
import com.gildedrose.item.UpdatableItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            UpdatableItem item = ItemFactory.from(items[i]);
            items[i] = item;
            item.update();
        }
    }
}
