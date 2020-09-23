public class Q41thisConstruct{
    public static void main(String []args){
        Person p =new Person("Tushar",300);
        p.Show();
         Person p1 =new Person("sneha",4500);
        p1.Show();
         Person p2 =new Person("thunder",45678);
        p2.Show();
         Person p3 =new Person("subham",4562);
        p3.Show();
         Person p4 =new Person("sushant",9875);
        p4.Show();
    }
}

class Person {
    private int pno;
    private String name;
    private int salary;
    private static int count =0;
    Person(String name){
        this(++count,name);
    }
    Person(int pno ,String name){
        this.pno=pno;
        this.name=name;
    }
    Person(String name ,int salary){
        this(name);
        this.salary=salary;
    }
    public void Show(){
        System.out.println("Total Count : "+this.count);
        System.out.println("Name "+ this.name + " salary "+ this.salary);
        System.out.println("@@@@@@@@@@@@");
    }
}