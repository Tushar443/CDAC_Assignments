package p3;

public class Q53 {

	public static void main(String[] args) {
		String str="67, 89, 23, 67, 12, 55, 66,";
		String s[]=str.split(" ");
		int sum=0;
		for(String s1 :  s) {
			int i=Integer.parseInt(s1.substring(0,2));
			sum+=i;
		}
      System.out.println(sum );
	}
}
