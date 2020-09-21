import java.util.*;
public class Q34Radius{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.init();
        c1.calculateArea();
        c1.display();
    }
}

class Circle{
    private double radius;
    private double area;

    public void init(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius ");
        this.radius=sc.nextDouble();
    }
    public void calculateArea(){
        this.area=3.14*this.radius*this.radius;
    }
    public void display(){
        System.out.printf("Area is: %.3f  \n", this.area);
    }
}