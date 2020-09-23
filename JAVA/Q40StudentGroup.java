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

        for(Student x : arr){
           x.ScoreGroup(x.getScore());
        }
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
    void ScoreGroup(int Score){ 
        System.out.println("@@@@@@@@@@@@@@@@");
        if(Score<50){ 
            System.out.println("Grade F"); 
        }else if(Score>=50 && Score<65 ){
            System.out.println("Grade C"); 
        }else if(Score>=65 && Score<80 ){ 
            System.out.println("Grade B"); 
        }else if(Score>=80 && Score<=100){ 
            System.out.println("Grade A"); 
        } 
    }
    // public void show(){
    //     System.out.println("Roll no : "+ rno + " name is : " + name);
    // }
}