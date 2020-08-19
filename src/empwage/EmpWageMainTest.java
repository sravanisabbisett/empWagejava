package empwage;

public class EmpWageMainTest {
	
	public static void main(String[] args) {
		EmployeeWageOops empWageBuilder=new EmployeeWageOops();
		empWageBuilder.addCompanyEmpWage("Dmart",50,6,100);
		empWageBuilder.addCompanyEmpWage("Tech M",60,4,100);
		empWageBuilder.addCompanyEmpWage("TCS",80,7,90);
		empWageBuilder.addCompanyEmpWage("Infosys",70,8,80);
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage of quired company:" +empWageBuilder.getTotalEmpWage("Infosys"));
		System.out.println();
}

}
