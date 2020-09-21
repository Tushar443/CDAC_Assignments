import java.util.*;
public class Q35MathOp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Two Number");
        int x =sc.nextInt();
        int y =sc.nextInt();
       int addValue = MathOperation.add(x,y);
       int subtractValue = MathOperation.subtract(x,y);
       int multiplyValue = MathOperation.multiply(x,y);
       int powerValue = MathOperation.power(x,y);
       System.out.println("Sum is : "+addValue);
       System.out.println("Subtraction : "+subtractValue);
       System.out.println("Multiplicaion : "+multiplyValue);
       System.out.println("Power : "+powerValue);
    }
}

class MathOperation{
    public static int add(int x ,int y){
        return (x+y);
    }
    public static int subtract(int x ,int y){
        return (x-y);
    }
    public static int multiply(int x ,int y){
        return (x*y);
    }
    public static int power(int x ,int y){
        int result=1;
        for(int i=0;i<y;i++){
            result=result*x;
        }
        return result;
    }
}