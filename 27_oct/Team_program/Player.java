package trial;

public class Player {
	private int pno;
	private String pname,skills;
	
	public Player() {
		
	}

	public Player(int pno, String pname, String skills) {
		this.pno = pno;
		this.pname = pname;
		this.skills = skills;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", skills=" + skills + "]";
	}
	
	
}
