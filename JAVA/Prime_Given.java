import java.util.*;
public class Prime_Given{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        int z;
        flag=true;
        for(int i=x;i<=y;i++){
            z=i/2;
            for(int j=2;j<=z;j++){
                if (i%j == 0){
                    continue;
                }else{
                    flag=false;
                }
            }
            if(flag){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
}