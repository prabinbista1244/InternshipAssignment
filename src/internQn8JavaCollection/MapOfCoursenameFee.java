package internQn8JavaCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfCoursenameFee {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Java", 10000);
		map.put(".Net",8000);
		map.put("PHP", 7000);
		map.put("Python", 6000);
		
		for(String key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
	}

}
