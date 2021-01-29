package design_patterns.builder;

import java.util.*;

public class Meal {
	List<Item> items= new ArrayList<Item>();
	
	public void printItems() {
		for(Item item: items) {
			System.out.print("name: "+item.name()+" Packing: "+item.pack().pack()+" cost: "+item.cost());
			System.out.println("");
		}
	}
	
	public float cost() {
		float cost=0.0f;
		for(Item item: items) {
			cost+=item.cost();
		}
		return cost;
	}
	
	public void addItem(Item e) {
		items.add(e);
	}

}
