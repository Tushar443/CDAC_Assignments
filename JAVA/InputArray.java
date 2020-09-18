import java.util.*;
public class InputArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        int []arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum =0;
        for (int i= 0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        double avg =sum/10.0;
        System.out.println(avg);
    }
}