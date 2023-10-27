package com.student;

import java.util.Scanner;

public class StudentService {

	static Student[] sarr;
	static int cnt=0;
	
	static {                     //object array 
		sarr= new Student[100];
		sarr[0]=new Student("Ritesh","1234");
		cnt=1;
	}
	
	public static void addNewStudent() {
		Scanner sc=new Scanner(System.in);
//		System.out.print("enter id: ");
//		int id=sc.nextInt();
		
		//sc.nextLine();
		System.out.print("enter name: ");
		String nm=sc.nextLine();
		
		System.out.print("enter mobile: ");
		String mob=sc.next();
		
		//validate the existence of id
		sarr[cnt]=new Student(nm,mob);
		cnt++;
	}
	
	public static Student searchById(String id) {
		/*for(int i=0;i<cnt;i++) {
			if(parr[i].getPid()==id)
				return parr[i];
		}
		return null;*/
		for(Student s:sarr) {
			if(s!=null) {
				if(s.getSid().equals(id)) {
					return s;
				}
			}
			else {
				return null;
			}
		}
		return null;
		
	}
	public static Student[] getByName(String nm) {
		//assumption maximum 10 perople will be ther with same name, other wise create array of size 100
		Student[] arr=new Student[10];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(sarr[i].getSname().equals(nm)) {
				System.out.println("at position: "+ (i+1));
				arr[count]=sarr[i];
			    count++;
			}
		}
		if(cnt>0) {
			return arr;
	    }
		return null;
	}
	
	public static void updatePnone(String id) {
		Scanner sc = new Scanner(System.in);
		for (Student s : sarr) {
			if (s != null) {
				if (s.getSid().equals(id)) {
					System.out.println("Update phone: ");
					String phone = sc.nextLine();
					s.setSphone(phone);
				}
			}
		}
	}

	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(sarr[i]);
		}
		
	}
}
