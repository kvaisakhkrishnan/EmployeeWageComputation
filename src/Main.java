import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Company> companyList = new ArrayList<Company>();
		System.out.println("Welcome to Employee Wage Computation");
		System.out.println("1.Add Company\n");
		
		while(true) {
			System.out.println("1. Add Company\n2. Employee Wage\n3. Exit");
			int option = scanner.nextInt();
			if(option == 1) {
				System.out.println("Enter Full Time Working Wage: ");
				int fullTimeWage = scanner.nextInt();
				System.out.println("Enter Part Time Working Wage: ");
				int partTimeWage = scanner.nextInt();
				System.out.println("Enter No of Full Time Working Hours: ");
				int fullTimeHours = scanner.nextInt();
				System.out.println("Enter No of Part Time Working Hours: ");
				int partTimeHours = scanner.nextInt();
				System.out.println("Enter No of Working Days: ");
				int workingdays = scanner.nextInt();
				System.out.println("Enter No of Working Hours Total: ");
				int workinghours = scanner.nextInt();
				Company company = new Company(fullTimeWage, partTimeWage, fullTimeHours, partTimeHours, workingdays, workinghours);
				Employee e1 = new Employee();
				Employee e2 = new Employee();
				company.addEmployee(e1);
				company.addEmployee(e2);
				companyList.add(company);
				System.out.println("Added Company and employee");
			}
			else if(option == 2) {
				for(int i = 0; i < companyList.size(); i++) {
					System.out.println("-------------------------------------");
					System.out.println("Company "+i);
					companyList.get(i).totalWage();
				}
			}
			else if(option == 3) {
				break;
			}
		}
	}
}
