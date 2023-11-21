import java.lang.Math;
import java.util.Scanner;
public class Employee {
	public boolean checkAttendance() {
		double attendance = Math.random();
		if(attendance < 0.5) {
			return false;
		}
		return true;
	}
	public int fullDayWage(int hoursWorked) {
		int dailyWage = 0;
		switch(hoursWorked) {
		case 1:
			dailyWage = 1 * 20;
			break;
		case 2:
			dailyWage = 2 * 20;
			break;
		case 3:
			dailyWage = 3 * 20;
			break;
		case 4:
			dailyWage = 4 * 20;
			break;
		case 5:
			dailyWage = 5 * 20;
			break;
		case 6:
			dailyWage = 6 * 20;
			break;
		case 7:
			dailyWage = 7 * 20;
			break;
		case 8:
			dailyWage = 8 * 20;
			break;
		default :
			System.out.println("Invalid Hours Worked");
		}
		return dailyWage;
	}
	public int partTimeWage(int hoursWorked) {
		int partTimeWage = 0;
		switch(hoursWorked) {
		case 1:
			partTimeWage = 1 * 20;
			break;
		case 2:
			partTimeWage = 2 * 20;
			break;
		case 3:
			partTimeWage = 3 * 20;
			break;
		case 4:
			partTimeWage = 4 * 20;
			break;
		default :
			System.out.println("Invalid Hours Worked");
		}
		return partTimeWage;
	}
	public int totalMontlyWage(int noOfDays, int noOfHours) {
		if(noOfDays > 0 && noOfDays <= 20) {
			return noOfDays * this.fullDayWage(noOfHours);
		}
		else {
			System.out.println("Invalid No of days");
			return 0;
		}
	}
	public int totalWageLimited(int noOfDays, int noOfHours) {
		if (noOfDays < 0 || noOfDays > 20){
			System.out.println("Invalid No of days");
			return 0;
		}
		else if(noOfHours < 0 || noOfHours > 8) {
			System.out.println("Invalid Hours per day");
			return 0;
		}
		else {
			int totalHoursWorked = noOfDays * noOfHours;
			if(totalHoursWorked > 100) {
				totalHoursWorked = 100;
			}
			return 20 * totalHoursWorked;
			
		}
		
		
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
		Employee e1 = new Employee();
		boolean checkAttendance = e1.checkAttendance();
		System.out.println("Employee Attendance: "+checkAttendance);
		if(checkAttendance == true) {
			System.out.println("Enter no of hours worked");
			int noOfHours = scanner.nextInt();
			System.out.println("Daily Wage is : "+ e1.fullDayWage(noOfHours));
		}
		Employee e2 = new Employee();
		System.out.println("Enter no of part time hours worked");
		int noOfHours = scanner.nextInt();
		System.out.println("Part Time Wage is : "+ e1.partTimeWage(noOfHours));
		
		System.out.println("Enter no of days worked: ");
		int noOfDays = scanner.nextInt();
		System.out.println("Enter no of hours worked per day");
		noOfHours = scanner.nextInt();
		System.out.println("Total Montly Wage: "+ e1.totalMontlyWage(noOfDays, noOfHours));
		System.out.println("Total Montly Wage Limited Upto 20 days and 100 hours: "+ e1.totalWageLimited(noOfDays, noOfHours));
		
		
	}
}
