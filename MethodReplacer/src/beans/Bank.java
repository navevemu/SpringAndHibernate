package beans;

public  abstract class Bank {

	private String cusName;
	private int accntno;
	private float bal;
	private float amtToDeposit;
	private float amtToWithdraw;
	private float intrest;
	public float getIntrest() {
		return intrest;
	}
	public void setIntrest(float intrest) {
		this.intrest = intrest;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getAccntno() {
		return accntno;
	}
	public void setAccntno(int accntno) {
		this.accntno = accntno;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	public float getAmtToDeposit() {
		return amtToDeposit;
	}
	public void setAmtToDeposit(float amtToDeposit) {
		this.amtToDeposit = amtToDeposit;
	}
	public float getAmtToWithdraw() {
		return amtToWithdraw;
	}
	public void setAmtToWithdraw(float amtToWithdraw) {
		this.amtToWithdraw = amtToWithdraw;
	}
	
public abstract void withDraw(float amtToWithDraw);
public abstract void deposit(float depositAmt);
public abstract void intrestCal();
public abstract void customerDtls();

	
}
