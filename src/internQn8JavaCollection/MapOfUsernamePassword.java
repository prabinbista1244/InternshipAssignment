package internQn8JavaCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfUsernamePassword {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("Prabinbista", "prabin@1234");
		map.put("Bishnumagar", "bishnu@1123");
		map.put("Kamalrana", "kamal@1134");
		map.put("Chudamani", "chudamania@1224");
		
		for(String key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
			
		}
	}

}
