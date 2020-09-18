import java.util.*;
public class SearchArr{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] = {34,67,89,23,56};
        System.out.println("Enter Search number");
        int ser =sc.nextInt();
        boolean flag=false;
        for (int a : arr){
            if(a==ser){
                System.out.println(a + " is Found");
                flag=false;
                break;
            }else{
                flag =true;
            }
        }
        if(flag){
            System.out.println("Not Found");
        }

    }
}