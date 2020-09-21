import java.util.*;
public  class Q38Employee {
    public static void main(String[] args) {
        Employee e1 =new Employee(2000);
        Employee e2 =new Employee(3000);
        e1.show();
        e2.show();
    }
}
class Employee{
    private static int empno=0;
    private double salary;
    private static double totalSalary=0;

    Employee(double salary){
        totalSalary =totalSalary+salary;
        empno++;
        this.salary=salary;
    }
    public void show(){
        System.out.println("Total Employee :"
        +empno+" Total Salary "+totalSalary);
    }

}