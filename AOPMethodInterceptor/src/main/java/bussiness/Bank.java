package bussiness;

public class Bank {
	public int amount=15000000;
	String acnum="SBI1108";
	
	public int deposit(int amount) {
		if(acnum=="SBI1108")
		{
			this.amount+=amount;
			System.out.println("successfully deposited");
			return this.amount;
			}
		else {
			return this.amount;
			
		}
		
	}

}
