package internQn8JavaCollection;

import java.util.LinkedList;
import java.util.List;

public class ListOfEmployee {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Maya KC");
		list.add("Simran KC");
		list.add("Bisnu Mabar");
		list.add("Kamal Rana");
		
		for(String employees : list) {
			System.out.println(employees);
		}
	}

}
