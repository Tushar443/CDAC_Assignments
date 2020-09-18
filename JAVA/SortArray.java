import java.util.*;
public class SortArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit");
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }        
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
        }

    }
}