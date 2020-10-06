//
//59.	Create a class Voter(voterId, name, age) with parameterized constructor.
//The parameterized constructor should throw a checked exception
//if age is less than 18. The message of exception is “invalid age for voter ” 
package Exception;

class Voter extends Exception{
	private int voterId;
	private String name;
	private int age;
	
	Voter(int voterId,String name,int age) throws Exception{
		this.voterId=voterId;
		this.name=name;
		if(age>18) {
			this.age=age;
		}else {
			throw new Exception("invalid age for voter");
		}
	}
    void Display() {
    	System.out.println(" voterId = "+voterId+" : Name = "+name+" : Age = "+age);
    }
}

public class VoterException {

	public static void main(String[] args) throws Exception {
		Voter v = new Voter(12345678,"Pravin",25);
		v.Display();

	}

}
