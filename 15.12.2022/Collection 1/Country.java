package assignments;
//Problem 2
import java.util.HashSet;
import java.util.Iterator;

public class Country {
	String country;
HashSet<String> H1 = new HashSet<>();//creating Hashset
	
	public HashSet<String> storeCountryNames(String CountryName) {//creating 1 method
		H1.add(CountryName);//Adding the values
		return H1;
	}
	
	public void retrieveCountry(String CountryName) {//creating 2nd method
		if(H1.contains(CountryName)) {
			System.out.println(CountryName+" is present in HashSet");
		}else {
			System.out.println("null");
		}}
	
	public static void main(String[] args) {
		Country countries = new Country();
		System.out.println(	"Hashset Country"+countries.storeCountryNames("India"));
		System.out.println(	"Hashset Country"+countries.storeCountryNames("Pakistan"));
		System.out.println(	"Hashset Country"+countries.storeCountryNames("Japan"));
         countries.retrieveCountry("India");
		countries.retrieveCountry("Tokyo");	
	}}

