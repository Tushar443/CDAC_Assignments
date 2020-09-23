import java.util.*;
public class Q45Student{
    public static void main(String []args){
        Student arr[] =new Student[5];
        Student s1 =new CollegeStudent(1,45,3);
        Student s2 =new CollegeStudent(2,98,8);
        Student s3 =new SchoolStudent(3,56,"10th");
        Student s4 =new SchoolStudent(4,87,"12th");
        Student s5 =new SchoolStudent(5,35,"8th");
        arr[0]= s1;arr[1]= s2;arr[2]= s3;arr[3]= s4; arr[4]= s5;

        for(Student x : arr){
            x.show();
        }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            int countCollegeStudent=0;
            int countSchoolStudent=0;
        for(Student x : arr){
            
            if(x instanceof CollegeStudent){
                countCollegeStudent++;
            }
            if(x instanceof SchoolStudent){
                countSchoolStudent++;
            }
        }
        System.out.println("School Count "+ countSchoolStudent +" College Count "+ countCollegeStudent);

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        System.out.println("Enter the Roll No  :");
        Scanner sc =new Scanner(System.in);
        int rollNo = sc.nextInt();
        for(Student x : arr){
            if(x.getRollNo()==rollNo){
                if(x instanceof CollegeStudent){
                     System.out.println("College Student");
            }
            if(x instanceof SchoolStudent){
                System.out.println("School Student");
            }
            }
        }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        int countGrade=0;
        for(Student x : arr){
            if(x.getPercentage() > 75){
                countGrade++;
            }
        }
        System.out.println("A grade Count "+ countGrade);




    }
}
class Student{
    private int rollNo;
    private double percentage;

    Student(){}
    Student(int rollNo ,double percentage){
        this.rollNo=rollNo;
        this.percentage=percentage;
    }
    public int getRollNo(){
        return rollNo;
    }
    public double getPercentage(){
        return percentage;
    }
    public void show(){
        System.out.println("Roll No : "+this.rollNo 
        +" Percentage "+ this.percentage + "%");
    }
}
class CollegeStudent extends Student{
    private int semester;

    CollegeStudent(){}

    CollegeStudent(int rollNo ,double percentage,int semester){
        super(rollNo,percentage);
        this.semester=semester;
    }
    public void show(){
        super.show();
        System.out.println(" Semester : "+ this.semester);
    }
}
class SchoolStudent extends Student{
    private String className;

    SchoolStudent(){}

    SchoolStudent(int rollNo,double percentage,String className){
        super(rollNo,percentage);
        this.className=className;
    }
    public void show(){
        super.show();
        System.out.println("Class Name : "+ this.className);
    }
}
