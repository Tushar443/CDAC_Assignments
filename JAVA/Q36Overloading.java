import java.util.*;
public class Q36Overloading{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double arr[]={2,4.5,6.7,3};
        int x1 = multiple.multiply(4,5);
        System.out.println(x1);
        double x2 = multiple.multiply(12.3f,3.4f,2f);
        System.out.println(x2);
        double x3 = multiple.multiply(arr);
        System.out.println(x3);
        double x4 = multiple.multiply(12.3,2);
        System.out.println(x4);
        byte x5 = multiple.multiply((byte)4,(byte)5);        
        System.out.println(x5);
    }
}
class multiple{
    public static int multiply(int x ,int y){
        System.out.println("int call");
        return x*y;
    }
    public static byte multiply(byte x ,byte y){
        System.out.println("byte call");
        return (byte)(x*y);
    }
    public static float multiply(float x ,float y,float z){
        System.out.println("float call");
        return x*y*z;
    }
    public static double multiply(double[] x){
        System.out.println("array call");
        double result=1.0;
        for(double y : x){
            result=result*y;
        }
        return result;
    }
    public static double multiply(double x ,int y){
        System.out.println("double int call");
        return x*y;
    }
}