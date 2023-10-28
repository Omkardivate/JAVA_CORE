package oct_27_inheritence;

import java.time.LocalDate;

public class VendorEmp extends Employee{
	private int numberofemp;
	private int amount;
	public VendorEmp() {
		this.numberofemp = 0;
		this.amount = 0;
	}
	public VendorEmp(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,int numberofemp,int amount) {
		super(pid,pname,mobile,email,dept,desg,doj);
		this.numberofemp = numberofemp;
		this.amount = amount;
	}
	public int getNumberofemp() {
		return numberofemp;
	}
	public void setNumberofemp(int numberofemp) {
		this.numberofemp = numberofemp;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString() +"VendorEmp [numberofemp=" + numberofemp + ", amount=" + amount + "]";
	}
	
}
