package com.gildedrose;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

	@Test
	public void normalItemZeroValue(){
		Item[] items = new Item[]{
				new Item("naname", 0, 0)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(0, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}

	@Test
	public void normalItemPositiveSellInPositiveQuality(){
		Item[] items = new Item[]{
				new Item("something", 1, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(9, items[0].quality);
		assertEquals(0, items[0].sellIn);
	}

	@Test
	public void normalItemNegativeSellInPositiveQuality(){
		Item[] items = new Item[]{
				new Item("something", -1, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(8, items[0].quality);
		assertEquals(-2, items[0].sellIn);
	}

	@Test
	public void agedBriePositiveSellInNotMaxQuality(){
		Item[] items = new Item[]{
				new Item("Aged Brie", 1, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(11, items[0].quality);
		assertEquals(0, items[0].sellIn);
	}

	@Test
	public void agedBrieNegativeSellInNotMaxQuality(){
		Item[] items = new Item[]{
				new Item("Aged Brie", -1, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(12, items[0].quality);
		assertEquals(-2, items[0].sellIn);
	}

	@Test
	public void agedBrieMaxQuality(){
		Item[] items = new Item[]{
				new Item("Aged Brie", 0, 50)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(50, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}

	@Test
	public void ticketSellInOverTenDaysNotMaxQuality(){
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(11, items[0].quality);
		assertEquals(10, items[0].sellIn);
	}

	@Test
	public void ticketSellInOverTenDaysMaxQuality(){
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 11, 50)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(50, items[0].quality);
		assertEquals(10, items[0].sellIn);
	}

	@Test
	public void ticketSellInBetweenSixToTenDaysNotMaxQuality(){
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(12, items[0].quality);
		assertEquals(9, items[0].sellIn);
	}

	@Test
	public void ticketSellInBetweenSixToTenDaysMaxQuality(){
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(50, items[0].quality);
		assertEquals(9, items[0].sellIn);
	}

	@Test
	public void ticketSellInBetweenOneToFiveDaysNotMaxQuality(){
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(13, items[0].quality);
		assertEquals(4, items[0].sellIn);
	}

	@Test
	public void ticketSellInBetweenOneToFiveDaysMaxQuality(){
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(50, items[0].quality);
		assertEquals(4, items[0].sellIn);
	}

	@Test
	public void ticketZeroSellIn(){
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 0, 45)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(0, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}

	@Test
	public void sulfurasPositiveSellIn(){
		Item[] items = new Item[]{
				new Item("Sulfuras, Hand of Ragnaros", 1, 80)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(80, items[0].quality);
		assertEquals(1, items[0].sellIn);
	}

	@Test
	public void sulfurasNegativeSellIn(){
		Item[] items = new Item[]{
				new Item("Sulfuras, Hand of Ragnaros", -1, 80)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(80, items[0].quality);
		assertEquals(-1, items[0].sellIn);
	}

}
