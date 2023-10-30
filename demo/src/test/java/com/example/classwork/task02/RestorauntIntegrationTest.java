package com.example.classwork.task02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RestorauntIntegrationTest {

	@Test
	public void testRestorauntIntegration() {
		MenuItem burger = new MenuItem("Burger", 5.99);
		MenuItem pizza = new MenuItem("Pizza", 7.99);

		Order order = new Order();
		order.addItem(burger);
		order.addItem(pizza);

		Kitchen kitchen = new Kitchen();

		kitchen.prepareOrder(order);

		List<MenuItem> preparedItems = order.getItems();

		assertEquals(2, preparedItems.size());
		assertEquals("Burger", preparedItems.get(0).getName());
		assertEquals(5.99, preparedItems.get(0).getPrice(), 0.001);
		assertEquals("Pizza", preparedItems.get(1).getName());
		assertEquals(7.99, preparedItems.get(1).getPrice(), 0.001);
	}

}
