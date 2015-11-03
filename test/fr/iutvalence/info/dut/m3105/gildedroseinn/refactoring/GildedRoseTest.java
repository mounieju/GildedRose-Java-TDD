package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GildedRoseTest
{	
	
	@Test
	public void testBothValuesOfOneItemInCollectionLowerAtTheEndOfEachDay()
	{
		Item itemTest = new Item("Conjured Mana Cake", 3, 6);
		GildedRose.updateItem(itemTest);
		assertEquals(itemTest.getSellIn(),2);
		assertEquals(itemTest.getQuality(),5);
	}
	
	
	@Test
	public void testBothValuesOfMoreThanOneIteminCollectionLowerAtTheEndOfEachDay()
	{
		ArrayList<Item> listOfItemsTest = new ArrayList<>();
		listOfItemsTest.add(new Item("Conjured Mana Cake", 3, 6));
		listOfItemsTest.add(new Item("SUSHI", 3, 6));
		listOfItemsTest.add(new Item("SHIBA", 3, 6));
		GildedRose.updateItems(listOfItemsTest);
		for (int indexInItemList = 0; indexInItemList < listOfItemsTest.size(); indexInItemList++)
		{
			assertEquals(listOfItemsTest.get(indexInItemList).getSellIn(), 2);
			assertEquals(listOfItemsTest.get(indexInItemList).getQuality(), 5);
		}
	}
	
	@Test
	public void testBothValuesOfEmptyCollectionLowerAtTheEndOfEachDay()
	{
		ArrayList<Item> listOfItemsTest = new ArrayList<>();
		GildedRose.updateItems(listOfItemsTest);
		for (int indexInItemList = 0; indexInItemList < listOfItemsTest.size(); indexInItemList++)
		{
			assertEquals(listOfItemsTest.get(indexInItemList).getSellIn(), null);
			assertEquals(listOfItemsTest.get(indexInItemList).getQuality(), null);
		}		
	}
 
	/*
	@Test
	public void testBothValuesOfItemsInCollectionAlreadyAt0LowerAtTheEndOfEachDay()
	{
		ArrayList<Item> listOfItemsTest = new ArrayList<>();
		listOfItemsTest.add(new Item("SUSHI", 0, 0));
		listOfItemsTest.add(new Item("SHIBA", 0, 0));
		GildedRose.updateItems(listOfItemsTest);
		for (int indexInItemList = 0; indexInItemList < listOfItemsTest.size(); indexInItemList++)
		{
			assertEquals(listOfItemsTest.get(indexInItemList).getSellIn(), null);
			assertEquals(listOfItemsTest.get(indexInItemList).getQuality(), null);
		}		
	}
	*/
}