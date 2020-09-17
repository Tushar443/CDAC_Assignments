import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int s =x/2;
        boolean flag = true;
        for(int i =2 ;i <=s;i++){
            if(x%i == 0){
                flag= false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}