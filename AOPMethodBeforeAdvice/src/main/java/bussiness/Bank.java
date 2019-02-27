package bussiness;

public class Bank {
	public int amount=15000000;
	String acnum="SBI1108";
	
	public int deposit(int amount) {
		if(acnum=="SBI1108")
		{
			this.amount+=amount;
			return 1;
			}
		else {
			return 0;
			
		}
		
	}

}
