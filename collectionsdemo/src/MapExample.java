import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<String, String> countryMap = new HashMap<>();
		
		countryMap.put("US", "United States");
		countryMap.put("UK", "United Kingdom");
		countryMap.put("NZ", "Newzealand");
		countryMap.put("UAE","United Arab Emirates");
		System.out.println(countryMap);
		
	}
		
}	
		
	