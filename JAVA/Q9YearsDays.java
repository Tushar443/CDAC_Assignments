import java.util.*;
public class Q9YearsDays{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Days : ");
        int days=sc.nextInt(); //740
        int year=0,month=0;
        while(days > 0){
            if(days < 365){
                break;
            }
            days=days-365; //375 // 10
            year++;     //2 
        }
        while(days > 0){
            if(days <30 ){
                break;
            }
            days =days-30;
            month++;
        }

        System.out.println( year +" years  "+month + " Months " + days +" Days");
    }
}