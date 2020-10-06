import java.util.Scanner;
class Customer{
	double accountNo;
	String Name;
	double balance;
	Customer(double accountNo,String Name,double balance){
	this.accountNo=accountNo;
	this.Name=Name;
	this.balance=balance;
	}
	@Override
	public String toString() {
	return "Account No " + accountNo + ", Name=" + Name + ", balance=" + balance;
	}
	double getaccNo() {
	return accountNo;
	}
	double getbal() {
	return balance;
	}
	void setbal(double balance) {
	this.balance=balance;
	}

}
class savingAcc extends Customer{
	savingAcc(double accountNo,String Name,double balance){
	super(accountNo,Name,balance);
	}
}
class currentAcc extends Customer{
	currentAcc(double accountNo,String Name,double balance){
	super(accountNo,Name,balance);
	}
}
public class Q51 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Customer c[]= new Customer[2];

	int i=0;
	while(true) {
	System.out.println("Enter Your Choice");
	System.out.println("1.Add Saving Account Details\n2.Add Current Account Details\n"
	+ "3.Enter Amount in Account\n4.withdraw Amount from Account\n5.Display Information Of ACcounts\n6.Display Information Of Particular ACcounts\n7.Exit");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:{
	System.out.println("Enter Saving Account details");
	double acc=sc.nextDouble();
	String name=sc.next();
	double bal=sc.nextDouble();
	
	c[i]=new savingAcc(acc,name,bal);
	i++;}
	break;
	case 2:{
	System.out.println("Enter Current Account details");
	double acc=sc.nextDouble();

	String name=sc.next();
	double bal=sc.nextDouble();
	
	c[i]=new currentAcc(acc,name,bal);
	i++;}
	break;
	case 3:
	System.out.println("Enter Account Number");
	double k2=sc.nextDouble();
	for(Customer cc: c) {
	if(cc.getaccNo()== k2) {
	System.out.println("Enter Amount You Want to deposite");
	double k3=sc.nextDouble();
	double b=cc.getbal()+k3;
	cc.setbal(b);
	}
	}
	case 4:
	System.out.println("Enter Account Number");
	double k4=sc.nextDouble();
	for(Customer cc: c) {
	if(cc.getaccNo()== k4) {
	System.out.println("Enter Amount You Want to withdraw");
	double k3=sc.nextDouble();
	if(cc instanceof savingAcc) {
	if(cc.getbal()>5000 && cc.getbal()> (5000+k3)) {
	double b=cc.getbal()-k3;
	cc.setbal(b);
	}
	else {
	System.out.println("Minimum Balance Is low.Saving Account Minimum balance should be 5000");
	}}
	else if(cc instanceof currentAcc) {
	if(cc.getbal()>1000 && cc.getbal()> (1000+k3)) {
	double b=cc.getbal()-k3;
	cc.setbal(b);
	}
	else {
	System.out.println("Minimum Balance Is low.Current Account Minimum balance should be 1000");
	}
	}
	}
	}
	break;
	case 5:
	for(Customer cc:c) {
	if(cc instanceof savingAcc) {
	System.out.println("Saving Account DEtails");
	System.out.println(cc.toString());
	}
	else if(cc instanceof currentAcc) {
	System.out.println("Current Account DEtails");
	System.out.println(cc.toString());
	}
	}
	break;
	case 6:System.out.println("Enter Accout number:\n");{
	double k1=sc.nextDouble();
	for(Customer cc:c) {
	if(cc.getaccNo()==k1) {
	System.out.println(cc.toString());
	}
	}}
	break;

	case 7 :return;
	}
	}

}
}