import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
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
		company.addEmployee(e1);
		Employee e2 = new Employee();
		company.addEmployee(e2);
		company.wageComputation(e1);
		company.totalWage();
	}
}
