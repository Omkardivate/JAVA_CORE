package trial;

import java.util.Scanner;

public class TestTeam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			//TeamService.menu();
			System.out.print("Enter choice: ");
			choice= sc.nextInt();
			switch(choice) {
			case 1: 
				TeamService.addNewTeam();
				break;
				
			case 2:
				TeamService.display();
				break;
				
			case 3:
				Team t=TeamService.serachByCName("virat");
				if(t!=null)
					System.out.println(t);
				else
					System.out.println("Not found...");
				break;
				
			case 4:
				t=TeamService.searchByPName("Raina");
				if(t!=null)
					System.out.println(t);
				else
					System.out.println("Not found...");
				break;
				
			case 5:
				System.out.println("Thank you...\n🙏 Visit Again 🙏");
				sc.close();
				break;
				
			default:
				System.out.println("Wrong choice !!!");
				
			}
		} while (choice != 5);
	}
}
