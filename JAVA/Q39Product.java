import java.util.*;
public class Q39Product{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Product arr[]= new Product[3];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+"st Product Details");
            System.out.print("Enter pid : ");
            int pid = sc.nextInt();
            System.out.print("Enter price : ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity : ");
            int quantity = sc.nextInt();
            Product p1 =new Product(pid,price,quantity);
            arr[i]=p1;
        }
        Product.TotalSpent(arr);
        Product.getMaxPrice();
    }
}
class Product{
    private int pid;
    private double price;
    private int quantity;
    private static int maxPID=0;
    private static double maxPrice=0;
    
    Product(int pid ,double price ,int quantity){
        if(price > maxPrice){
            maxPID=pid;
            maxPrice=price;
        }
        this.pid =pid;
        this.price =price;
        this.quantity=quantity;
    }
    public static void getMaxPrice(){
        System.out.println("Max Price Pid : "+ maxPID);
    }
    public int getpid(){
        return this.pid;
    }
    public double getprice(){
        return this.price;
    }
    public static void TotalSpent(Product []arr){
        double result;
        for(Product i : arr){
            result = i.price * i.quantity;
            System.out.println("Total spent on "+i.pid+" : "+result);
        }
    }
}