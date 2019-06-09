package com.nk2164.collections;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShipmentTest {
	private Shipment shipment = new Shipment();
	
	//Create 3 new products.
	Product door = new Product("Wooden Door", 35);
	Product floorPanel = new Product("Floor Panel", 25);
	Product window = new Product("Glass Window", 10);
	
	@Test
	public void shouldAddItems() throws Exception
	{
		shipment.add(door);
		shipment.add(window);
		
		assertThat(shipment, contains(door,window));
	}

	@Test
	public void shouldReplaceItems() throws Exception
	{
		shipment.add(door);
		shipment.add(window);

		shipment.replace(door,floorPanel);
		
		assertThat(shipment, contains(floorPanel,window));
	}

	@Test
	public void shouldNotReplaceMissingItems() throws Exception
	{
		shipment.add(window);
		shipment.replace(door, floorPanel);
		
		assertThat(shipment, contains(window));
		
	}
	
	@Test
	public void shouldIdentifyVanRequirements() throws Exception 
	{
		shipment.add(door);
		shipment.add(window);
		shipment.add(floorPanel);
		
		shipment.prepare();
		
		assertThat(shipment.getLightVanProducts(),contains(window));
		assertThat(shipment.getHeavyVanProducts(),contains(floorPanel,door));
		
	}
}
