package p3;
import java.util.Scanner;
public class Q52 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
	    int count=0;
		for(int i=0;i<len-1;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='i' ||str.charAt(i)=='o'|| str.charAt(i)=='e'||str.charAt(i)=='u') {
				count++;
			}
		}
    System.out.println("Vowels in name is "+count);
    sc.close();
	}

}
