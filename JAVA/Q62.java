package p3;

class MyThread implements Runnable{
	int sum;
	@Override
	public void run() {
	
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(200);
				sum=sum+i;
			//	System.out.println(i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(sum);
	}
	
}

class MySum implements Runnable{
	MyThread a;
	public MySum(MyThread a) {
	   this.a=a;
	} 
	
	@Override
	public void run() {
		System.out.println("Sum is "+a.sum);	
	}
}

public class Q62 {

	public static void main(String[] args) throws InterruptedException {
        MyThread th =new MyThread();
        MySum m=new MySum(th);
        Thread t1=new Thread(th);
        Thread t2=new Thread(m);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
     System.out.println("Finish main");
	}

}
