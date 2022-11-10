/* Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE
 */
package lab;
import java.util.StringTokenizer;

public class StringP3 {

	public static void main(String[] args) {
		String str=("C://IBM//DB2//PROGRAM//DB2COPY1.EXE");
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())  //boolean method, it checks if there is more token available or not
		{
			System.out.println();
			System.out.print(st.nextToken("/")); //String method, it returns the next token from string tokenizer object
		}
	}
	}


