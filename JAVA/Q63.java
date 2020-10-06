package p3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Q63 {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("E:\\core java\\dir\\abc.txt");
		DataInputStream f2=new DataInputStream(f);
		int count=0;
		while(f2.available()>0) {
			if((char)f2.read()=='T' || (char)f2.read()=='t') {
				count++;
			}
		}
      System.out.println("Number of T or t in file is "+count);
	}

}
