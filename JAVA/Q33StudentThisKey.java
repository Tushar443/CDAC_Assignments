import java.util.*;
public class Q33StudentThisKey{
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setData(1,"Thunder");
        s1.show();
        Student s2 =new Student();
        s2.setData(2,"Hulk Buster");
        s2.show();
    }
}

class Student{
    private int rno;
    private String name;


    public void setData(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    public void show(){
        System.out.println("Roll no : "+ this.rno + " name is : " + this.name);
    }
    
}