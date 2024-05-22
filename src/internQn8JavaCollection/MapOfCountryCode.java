package internQn8JavaCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfCountryCode {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Nepal", 2001);
		map.put("Indea", 2002);
		map.put("China", 2003);
		map.put("Pakistan", 2004);
		map.put("Bangaldesh", 2005);
		map.put("Shrilanka", 2006);
		map.put("Bhutan", 2007);
		map.put("Afganstan", 2008);
		
		//System.out.println(map.keySet());
		
		for(String key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
	}

}
