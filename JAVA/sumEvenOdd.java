import java.util.*;
public class sumEvenOdd{
    public static void main(String[] args) {
        int arr[] ={34,57,89,24,56,23};
        int sumEven=0;
        int sumOdd=0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]%2 == 0){
                sumEven =sumEven+arr[i];
            }else{
                sumOdd=sumOdd+arr[i];
            }
        }
        System.out.println("Sum of Even Numbers "+sumEven + " Sum of Odd Numbers " + sumOdd);
    }
}