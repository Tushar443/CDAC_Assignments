import java.util.*;
public class Q37Person{
    public static void main(String[] args) {
        Person p1 =new Person(13,"Tushar");
        p1.show();
        Person p2 =new Person("Thunder");
        p2.show();
    }
}
class Person{
    private int age;
    private String name;
    Person(String name){
        this.name=name;
        this.age=18;
    }
    Person(int age,String name){
        this.age =age;
        this.name= name;
    }
    public void show(){
        System.out.println("Name :" + this.name+ " Age : "+ this.age);
    }
}