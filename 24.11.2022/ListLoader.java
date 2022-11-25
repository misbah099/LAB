package lab;
//Problem 1:
import java.util.ArrayList;

public class ListLoader {
ArrayList<Integer>L=new ArrayList<Integer>();
void loadList(Integer startNumber,Integer lastNumber) {
	for(Integer i=startNumber;i<=lastNumber;i++) {
		L.add(i);
	}
}
}
