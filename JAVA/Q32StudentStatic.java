import java.util.*;
public class Q32StudentStatic{
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setData(1,"Thunder");
        s1.show();
        Student s2 =new Student();
        s2.setData(2,"Hulk Buster");
        s2.show();
        s2.ShowCount();
    }
}

class Student{
    private int rno;
    private String name;
    private static int count=0;

    public void setData(int srno,String sname){
        count++;
        rno=srno;
        name=sname;
    }
    public void show(){
        System.out.println("Roll no : "+ rno + " name is : " + name);
    }
    public void ShowCount(){
        System.out.println("Count is "+ count);
    }
}