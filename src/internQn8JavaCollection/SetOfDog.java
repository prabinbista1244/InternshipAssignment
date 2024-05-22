package internQn8JavaCollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetOfDog {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("tomy");
		set.add("rukky");
		set.add("belly");
		set.add("jony");
		
		
		for(String dogs : set) {
			System.out.println(dogs);
		}
	}

}
