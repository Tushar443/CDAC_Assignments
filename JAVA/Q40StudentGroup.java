import java.util.*;
public class Q40StudentGroup{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student arr[] =new Student[4];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+ "th student");
            int rno =sc.nextInt();
            String name =sc.next();
            int age =sc.nextInt();
            int score=sc.nextInt();
            Student s =new Student(rno,name,age,score);
            arr[i]=s;
        }
         System.out.print("0 to 50 : ");
            for(Student s : arr){
                if(s.getScore() <= 50 && s.getScore() > 0){
                System.out.println(s.getScore());
            }
        }
        System.out.println();
         System.out.print("50 to 65 : ");
        for(Student s : arr){
           
            if(s.getScore() <= 65 && s.getScore() > 50){
                System.out.println(s.getScore());
            }
        }
        System.out.println();
         System.out.print("65 to 80 : ");
        for(Student s : arr){
           
            if(s.getScore() <=80 && s.getScore() > 65){
                System.out.println(s.getScore());
            }
        }
        System.out.println();
         System.out.print("80 to 100 : ");
        for(Student s : arr){
           
            if(s.getScore() <= 100 && s.getScore() > 80){
                System.out.println(s.getScore());
            }
        }
        System.out.println();
    }
}

class Student{
    private int rno;
    private String name;
    private int age;
    private int score;

    Student(int rno,String name,int age,int score){
        this.rno=rno;
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public int getScore(){
        return this.score;
    }
    public void show(){
        System.out.println("Roll no : "+ rno + " name is : " + name);
    }
}