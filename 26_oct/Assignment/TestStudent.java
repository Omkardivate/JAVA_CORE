package com.student;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Add new Student\n2. display all\n3. display by id\n4. update mobile by id");
			System.out.println("5. display by name\n6. exit\n choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				StudentService.addNewStudent();
				break;
			case 2:
				StudentService.displayAll();
				break;
			case 3:
				System.out.println("enter id");
				sc.nextLine();
				String id = sc.nextLine();
				Student ob = StudentService.searchById(id);
				if (ob != null) {
					System.out.println(ob);
				} else {
					System.out.println("not found " + id);
				}
				break;
			case 4:
				sc.nextLine();
				System.out.print("Enter id: ");
				id = sc.nextLine();
				StudentService.updatePnone(id);
				break;
			case 5:
				System.out.println("enter name");
				sc.nextLine();
				String nm = sc.nextLine();
				Student[] slist = StudentService.getByName(nm);
				if (slist != null) {
					for (Student s : slist) {
						System.out.println(s);
					}
				} else {
					System.out.println("not found");
				}
				break;
			case 6:
				System.out.println("Thank you...");
				break;
			default:
				System.out.println("wrong choice");
			}

		} while (choice != 6);

		sc.close();
	}
	

}
