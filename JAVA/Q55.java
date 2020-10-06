package p3;

public class StringDemo2 {

	public static void main(String[] args) {
       String str= "One two       three\n four\tfive jeur rrrr rq		r E  "; 
       int n=str.length();
       int count=1;
       int i=0;
       int flag=0;
       while(i<n) {
    	   if(str.charAt(i)==' ' || str.charAt(i)=='\n' || str.charAt(i)=='\t') {
    		     flag=1;
    	   }else if(flag==1) {
    		   count++;
    		   flag=0;
    	   }
    	  i++;
       }
       System.out.println("No. of words is "+count);
	}

}
