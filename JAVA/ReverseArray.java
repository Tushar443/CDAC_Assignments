import java.util.*;
public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter 5 digit");
        int arr[]={2,3,5,7,9,10};
        int m = arr.length;
        int arr1[] = new int[m]; 
        for(int i = 0 ;i <arr.length;i++){
               arr1[--m] =arr[i];         
        } 
        for (int i : arr1) {
            System.out.println(i+" ");
        }   
    }
}