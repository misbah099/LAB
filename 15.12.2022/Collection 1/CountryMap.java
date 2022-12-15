package assignments;
//Problem 3
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {
	private HashMap<String, String> M1;//instance of country
	
	public CountryMap() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> storeCountryCapital(String CountryName, String capital) {//method 1 
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String retrieveCapital(String CountryName) {//method 2
		return M1.get(CountryName);
	}
	
	public String retrieveCountry(String capitalName) {//method 3
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {//method 4
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {//Array to Map
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
	public static void main(String[] args) {//Main
		CountryMap countryMap = new CountryMap();

		countryMap.storeCountryCapital("India", "Delhi");
		countryMap.storeCountryCapital("Japan", "Tokyo");		
		System.out.println(countryMap.retrieveCapital("India"));
		System.out.println(countryMap.retrieveCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}
}
