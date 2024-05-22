package internQn8JavaCollection;

import java.util.LinkedList;
import java.util.List;

public class ListOfStudent {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Prabin");
		list.add("Bishnu");
		list.add("Himal");
		list.add("Puran");
		
		for(String students : list) {
			System.out.println(students);
		}
	}

}
