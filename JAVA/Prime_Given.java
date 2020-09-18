import java.util.*;
public class Prime_Given{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        int z;
        boolean flag=true;
        if (x == 0 || x==1 || x==2){
            x=3;
        }
        for(int i=x;i<=y;i++){
            if(i==1){
                continue;
            }
            z=i/2;
            for(int j=2;j<=z;j++){
                if (i%j == 0){
                    flag=false;
                    break;
                }else{
                    flag=true;
                   continue;
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