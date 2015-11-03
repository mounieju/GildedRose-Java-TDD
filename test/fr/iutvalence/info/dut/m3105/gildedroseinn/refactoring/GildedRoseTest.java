package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{	
	
	@Test
	public void testBothValuesOfItemsLowerAtTheEndOfEachDay()
	{
		Item itemTest = new Item("Conjured Mana Cake", 3, 6);
		GildedRose.updateItem(itemTest);
		assertEquals(itemTest.getSellIn(),2);
		assertEquals(itemTest.getQuality(),5);
	}
 
}