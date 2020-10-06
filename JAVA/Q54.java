package p3;

public class StringDemo4 {

	public static void main(String[] args) {
       String str= "    One two three four"; 
       int n=str.length();
       for(int i=(n-1);i>=0;i--) {
    	   System.out.print(str.charAt(i));
       }
     
	}
}
