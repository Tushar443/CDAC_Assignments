package p3;

public class StringDemo3 {

	public static void main(String[] args) {
       String str= "This is a test string"; 
       String ch[]=str.split(" ");
//       for(String i : ch) {
//    	   System.out.print(i+" ");
//       }
       for(int i=0;i<ch.length;i++) {
          String str1=(String)ch[i];
          for(int j=(str1.length()-1);j>=0;j--) {
        	  System.out.print(str1.charAt(j));
          }
          System.out.print(" ");
       }
	}
}
