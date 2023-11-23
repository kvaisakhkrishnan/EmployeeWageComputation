import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
		Employee e1 = new Employee();
		boolean checkAttendance = e1.checkAttendance();
		System.out.println("Employee Attendance: "+checkAttendance);
		if(checkAttendance == true) {
			System.out.println("Enter no of hours worked");
			int noOfHours = scanner.nextInt();
			System.out.println("Daily Wage is : "+ e1.wageComputation("full-time", noOfHours));
		}
		Employee e2 = new Employee();
		System.out.println("Enter no of part time hours worked");
		int noOfHours = scanner.nextInt();
		System.out.println("Part Time Wage is : "+ e1.wageComputation("part-time", noOfHours));
		
		System.out.println("Enter no of days worked: ");
		int noOfDays = scanner.nextInt();
		System.out.println("Enter no of hours worked per day");
		noOfHours = scanner.nextInt();
		System.out.println("Total Montly Wage: "+ e1.totalMontlyWage(noOfDays, noOfHours));
		System.out.println("Total Montly Wage Limited Upto 20 days and 100 hours: "+ e1.totalWageLimited(noOfDays, noOfHours));
		
		
	}
}
