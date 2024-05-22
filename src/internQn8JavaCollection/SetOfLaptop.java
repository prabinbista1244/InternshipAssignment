package internQn8JavaCollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetOfLaptop {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("lenovo");
		set.add("HP");
		set.add("Dell");
		set.add("Asush");
		
		for(String laptops : set) {
			System.out.println(laptops);
		}
	}

}
