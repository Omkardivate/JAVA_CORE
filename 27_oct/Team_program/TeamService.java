package trial;

import java.util.Scanner;

public class TeamService {
	static Team[] tarr;
	static int cnt;
	
	static {
		tarr=new Team[2];
		cnt=0;
	}
	
	public static void addNewTeam() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter team no: ");
		int tno=sc.nextInt();
		System.out.println("Enter team name: ");
		String tname=sc.next();
		
		System.out.println("Enter player no: ");
		int pno= sc.nextInt();
		System.out.println("Enter player name: ");
		String pname= sc.next();
		System.out.println("Enter skill: ");
		String skill= sc.next();
		
		Player c= new Player(pno,pname,skill);
		
		Player[] plist=new Player[3];
		for(int i=0; i<plist.length ;i++)
		{
			System.out.println("Enter player no: ");
			pno= sc.nextInt();
			System.out.println("Enter player name: ");
			pname= sc.next();
			System.out.println("Enter skill: ");
			skill= sc.next();
			plist[i]=new Player(pno,pname,skill);
			
		}
		tarr[cnt]=new Team(tno,tname,c,plist);
		cnt++;
	}
	
	public static Team serachByCName(String nm)
	{
		for(int i=0;i<cnt ; i++)
		{
			if(tarr[i].getCaptain().getPname().equals(nm)) {
				return tarr[i];
			}
		}
		return null;
	}
	
	public static Team searchByPName(String nm) {
		for (int i = 0; i < tarr.length; i++) {
			Player[] parr= tarr[i].getPlist();
			for (int j = 0; j < parr.length; j++) {
				if(parr[i].getPname().equals(nm)) {
					return tarr[i];
				}
			}
		}
		return null;
	}
	
	//public static void menu()
	
	
	public static void display()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(tarr[i]);
		}
	}
}
