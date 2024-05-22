package internQn8JavaCollection;

import java.util.LinkedList;
import java.util.List;

public class ListOfProduct {
	public static void main(String[] args) { 
		List<String> list = new LinkedList<>();
		
		list.add("Laptop");
		list.add("Keyboard");
		list.add("Mouse");
		list.add("Pen");
		list.add("Pencile");
		list.add("Copy");
		list.add("Book");
		
		
		//list.remove(0);
		for(String products : list) {
			System.out.println(products);
		}
		
		System.out.println("\n" + list.contains("Copy"));
	}

}
