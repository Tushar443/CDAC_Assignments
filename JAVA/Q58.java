//58.	Store name of weekdays in an array (starting from “Sunday” at 0 index). 
//Ask day position from user and print day name. Handle array index out of bound exception
//and give proper message if user enter day index outside range (0-6). 

package Exception;
import java.util.Scanner;
public class ArrayException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a[]= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		System.out.println("Enter day index");
		int index=sc.nextInt();
		
		if(index<7) {
			System.out.println(a[index]);
		}else {
			throw new ArrayIndexOutOfBoundsException("Enter day index range (0-6)");
		}
		

	}

}
