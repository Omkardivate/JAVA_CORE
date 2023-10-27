package com.student;

public class Student {
	private String sid;
	private String sname;
	private String sphone;
	
	static int cnt=100;
	public Student( )
	{
		this.sid=null;
		this.sname=null;
		this.sphone=null;
	}

	public Student(String sname, String sphone) {
		this.sname = sname;
		this.sid = generateId();
		this.sphone = sphone;
	}
	
	public String generateId() {
		cnt++;
		return this.sname.substring(0, 3)+ cnt;
	}
	///setter function
		public void setSid(String sid) {
			this.sid=sid;
		}
		
		public void setSname(String sname) {
			this.sname=sname;
		}
		
		public void setSphone(String sphone) {
			this.sphone=sphone;
		}
		
		// Getter Function
		public String getSid() {
			return this.sid;
		}
		
		public String getSname() {
			return sname;
		}
		
		public String getSphone() {
			return sphone;
		}
		
		public String toString()
		{
			return "id:"+ sid +"\nname:"+ sname +"\nphone:" + sphone;
		}
}

