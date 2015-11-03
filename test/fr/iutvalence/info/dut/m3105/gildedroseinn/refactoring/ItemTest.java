package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {

	@Test
	public void getNameItem()
	{
		Item myItem = new Item ("Patate", 5, 10);
		assertEquals(myItem.getName(), "Patate");		
	}
	
	@Test
	public void setNameItem()
	{
		Item myItem = new Item ("Patate", 5, 10);
		myItem.setName("Sushi");
		assertEquals(myItem.getName(), "Sushi");	
	}
	
	@Test
	public void getSellInItem()
	{
		Item myItem = new Item ("Patate", 5, 10);
		assertEquals(myItem.getSellIn(), 5);		
	}
	
	@Test
	public void setSellIn()
	{
		Item myItem = new Item ("Patate", 5, 10);
		myItem.setSellIn(6);
		assertEquals(myItem.getSellIn(), 6);	
	}
	
	@Test
	public void getQualityItem()
	{
		Item myItem = new Item ("Patate", 5, 10);
		assertEquals(myItem.getQuality(), 10);		
	}
	
	@Test
	public void setQualityItem()
	{
		Item myItem = new Item ("Patate", 5, 10);
		myItem.setQuality(9);
		assertEquals(myItem.getQuality(), 9);	
	}
	
}
