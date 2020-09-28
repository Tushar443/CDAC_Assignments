import java.util.Scanner;


class Bank {
    private String accType;
    private int CusAccNumber;
    private String name;
    private double balance;
    private String branch;
    
    Bank(){}
    Bank(String accType,int CusAccNumber,String name,double balance,String branch){
        this.accType =accType;
        this.CusAccNumber=CusAccNumber;
        this.name = name;
        this.balance =balance;
        this.branch = branch;
    }

    public void show(){
        System.out.println("Account Type : "+ this.accType);
        System.out.println("Account Number : "+this.CusAccNumber);
        System.out.println("Name : "+this.name);
        System.out.println("Balance : "+ this.balance);
        System.out.println("Branch Name : "+ this.branch);
    }
}
class CurrentAccount extends Bank{
    
    CurrentAccount(){}
        CurrentAccount(int CusAccNumber,String name,double balance,String branch){
            super("Current Account" ,CusAccNumber, name, balance, branch);
        }
}
class SavingAccount extends Bank{
    
    SavingAccount(){}
        SavingAccount(int CusAccNumber,String name,double balance,String branch){
            super("Saving Account" ,CusAccNumber, name, balance, branch);
        }
}
public class Q51BankManagement{
    private static int BankAccount=0;
    private static Bank arr[] =new Bank[10];
    private static boolean SavingBalance(double balance){
        boolean flag = true;
        if(balance >= 5000){
            return flag;
        }else{
            flag=false;
        }
        return flag;
    }
    private static boolean CurrentBalance(double balance){
        boolean flag = true;
        if(balance >= 1000){
            return flag;
        }else{
            flag=false;
        }
        return flag;
    }
    private static void CustomerData(Bank s){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==null){
                arr[i]=s;
            }else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /**  Bank b= new SavingAccount(123,"Tushar",300.5,"Kurla");
        // Bank b1= new SavingAccount(124,"pravin",5467.5,"nasik");
        // Bank b2= new CurrentAccount(125,"rohit",12346.5,"satara");
        // Bank b3= new CurrentAccount(126,"Kishore",7896.5,"igatpuri");
        // b.show();
        // b1.show();
        // b2.show();
        // b3.show();
        */
        boolean flag = true;
        while(flag){
            System.out.println("!!!!!! Bank Management !!!!!!");
            System.out.println("###################################");
            System.out.println(
             "1 : Create new account\n"
            +"2 : Display Account Details\n"
            +"3 : Money Details\n" 
            +"4 : To Deposit and Withdrawal\n");
            System.out.println("###################################");
            System.out.print("Enter your choice : ");
            int n =sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("1: For Saving Account\n"+
                                       "2: For Current Acount\n");
                    System.out.print("Enter your choice : ");
                    int x =sc.nextInt();
                    if(x ==1){
                        BankAccount++;
                        System.out.print("Enter Name :");
                        String name =sc.next();
                        System.out.print("Enter Balance :");
                        double balance =sc.nextDouble();
                        if(SavingBalance(balance)){

                        }else{
                            System.out.println("Balance Should be more than 5000");
                            break;
                        }
                        System.out.print("Enter Branch Name : ");
                        String branch =sc.next();
                        Bank s =new SavingAccount(BankAccount,name,balance,branch);
                        CustomerData(s);
                        s.show();
                    }else if (x ==2){
                        BankAccount++;
                        System.out.print("Enter Name :");
                        String name =sc.next();
                        System.out.print("Enter Balance :");
                        double balance =sc.nextDouble();
                        if(CurrentBalance(balance)){

                        }else{
                            System.out.println("Balance Should be more than 1000");
                            break;
                        }
                        System.out.print("Enter Branch Name : ");
                        String branch =sc.next();
                        Bank s =new CurrentAccount(BankAccount,name,balance,branch);
                        CustomerData(s);
                        s.show();
                    }else{
                        System.out.println("Invalid Choice");
                    }
                    break; 
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    // sc.close();
}