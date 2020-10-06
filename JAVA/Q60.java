//
//60.	Create Interface StudentFee and declare following method.  getFee() 
//throws InvalidFeeException. This method ask fees from user and throws exception 
//if user enters invalid or negative fees Create
//class Student with members (name, fees) and implement the StudentFee Interface.
package Exception;

import java.util.Scanner;
import java.lang.Exception;

interface StudentsFee{
	void getFee() throws InvalidFeeException;
}

class InvalidFeeException extends Exception{//user define exception
	   InvalidFeeException(){
		 //  System.out.println("InvalidFeeException");
	   }
}
class SalaryException extends InvalidFeeException implements StudentsFee{
	   private String name;
	   private int sal;
	   SalaryException(){}
	   SalaryException(String name,int sal){
		   this.name=name;
		   this.sal=sal;
	   }

	@Override
	public void getFee() throws InvalidFeeException{
		if(sal>5000) {
			System.out.println(name+" "+sal);
		}else {
			throw new InvalidFeeException();
		}
		
	}
	 
}
public class ExceptionDemo  {

	public static void main(String[] args) throws InvalidFeeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the salary");
		int sal=sc.nextInt();
	    SalaryException s= new SalaryException(name,sal);
	    s.getFee();
	 
	}

}



