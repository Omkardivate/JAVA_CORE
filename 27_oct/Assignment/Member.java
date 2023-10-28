package oct_27_inheritence;

public class Member extends Person{
	private String typeofmem_ship;
	private int amount;

	public Member() {
		this.typeofmem_ship = null;
		this.amount = 0;
	}
	public Member(int pid, String pname, String mobile, String email,String typeofmem_ship, int amount) {
		super(pid, pname, mobile, email);
		this.typeofmem_ship = typeofmem_ship;
		this.amount = amount;
	}
	public String getTypeofmem_ship() {
		return typeofmem_ship;
	}
	public void setTypeofmem_ship(String typeofmem_ship) {
		this.typeofmem_ship = typeofmem_ship;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString() + "Member [typeofmem_ship=" + typeofmem_ship + ", amount=" + amount + "]";
	}

	
	
}
