import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
       int s = x ;
       int y=0;
       int z=0;
       while(s > 0 ){
           y= s%10;
            z=z*10 + y;
            s=s/10;
       }
       System.out.println(z);
}
}