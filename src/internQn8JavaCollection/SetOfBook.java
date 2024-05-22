package internQn8JavaCollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetOfBook {
	public static void mani(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Science");
		set.add("Math");
		set.add("Social");
		set.add("Health");
		set.add("Papulation");
		set.add("Economics");
		
		for(String books : set) {
			System.out.println(books);
		}
	}

}
