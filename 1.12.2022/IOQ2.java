package assignment;
//Question 2:
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOQ2 {
public static void main(String[] args) {
System.out.println("Enter the choice 1 for write and 2 for read");
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
try {
	if(i==1) {
		FileOutputStream f= new FileOutputStream("E:\\test.txt");
		String s="Welcome to Anudip Foundation Example";
		byte b[]=s.getBytes();//changing string to bye array
		f.write(b);//write() is used to write write in file
		f.close();
	}else if(i==2) {
		FileInputStream f=new FileInputStream("E:\\test1.txt");

		int i1=0;
		while((i1=f.read())!=-1) {
			System.out.print((char)i1);
		}
		f.close();
	}else {
		System.out.println("Invalid input");
	}
	System.out.println("Done");
}catch(Exception e) {
System.out.println(e);	
}
}}
