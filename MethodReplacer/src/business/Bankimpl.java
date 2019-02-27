package business;

import beans.Bank;

public class Bankimpl  extends Bank{

	@Override
	public void withDraw(float amtToWithDraw) {
		float temp=getBal()-amtToWithDraw;
		setBal(temp);
		System.out.println("Balacne Amount:"+getBal());
		
	}

	@Override
	public void deposit(float depositAmt) {
		float temp=getBal()+depositAmt;
		setBal(temp);
		System.out.println("Balacne Amount:"+getBal());
	}

	@Override
	public void intrestCal() {
		float intrestedAmt=getBal()*(10/100);
		setBal(getBal()+intrestedAmt);
		System.out.println("after calculating intrest, Balacne Amount:"+getBal());
		
	}

	@Override
	public void customerDtls() {
		System.out.println("Customer Name:"+getCusName());
		System.out.println("Acount Number:"+getAccntno());
		System.out.println("Balance:"+getBal());
	}

}
