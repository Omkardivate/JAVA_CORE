package oct_27_inheritence;

import java.time.LocalDate;

public class TestEmployee {
	

	public static void main(String[] args) {
		
		Employee e=new Employee(12,"xxx","3333","asd@gmail.com","Hr","mgr",LocalDate.of(2001,11,23));
        System.out.println(e);

        SalariedEmp semp=new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		System.out.println(semp);
		
		ContractEmp cemp=new ContractEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),30,4000);
		System.out.println(cemp);
		
		Employee e1=new SalariedEmp();
		((SalariedEmp)e1).getBonus();
		
		Employee e2=new SalariedEmp();
		SalariedEmp s=(SalariedEmp)e2;
        
		VendorEmp vemp= new VendorEmp();
		System.out.println(vemp);
		
		
		Member mem=new Member(12,"xxx","3333","asd@gmail.com","Premium",5000);
		System.out.println(mem);
	}

}
