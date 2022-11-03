/*  Q:3 */

package lab;

public class CharOddArray {

	public static void main(String[] args) {
    char ch[]= {'a','b','c','d','e'};
    System.out.println("The elements on odd position are");
    for(int i=0;i<ch.length;i+=2) {
    	System.out.print(ch[i]+" ,");
    }
	}

}
