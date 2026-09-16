package com.gildedrose;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

	@Test
	public void test() {

		Item[] items = new Item[]{
				new Item("naname", 0, 0)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		//assertEquals(0, items[0].quality);


	}

}
