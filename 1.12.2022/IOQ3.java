package assignment;
//Question 3:WAP to read contents from a file into byte array
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOQ3 {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin=new FileInputStream("E:\\test.txt");
			byte filout[]=new byte[1024];
			int i=0;
			while((i=fin.read(filout))>0) {
				System.out.println(new String(filout,0,i));
			}
		}catch(Exception e) {
			System.out.println(e);
		}}}
