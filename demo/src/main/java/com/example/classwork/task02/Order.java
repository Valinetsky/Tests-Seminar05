package com.example.classwork.task02;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<MenuItem> items = new ArrayList<>();

	public void addItem(MenuItem item) {
		items.add(item);
	}

	public List<MenuItem> getItems() {
		return items;
	}
}