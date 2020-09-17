import java.util.*;
public class Series{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int sum=12;
        for(int i=0;i<n;i++){
            System.out.println((i+1)+" : "+sum);
            sum=sum+10;
        }
    }
}