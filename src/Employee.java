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
		if(hoursWorked > 0 && hoursWorked <= 8) {
			return hoursWorked * 20;
		}
		else {
			System.out.println("Invalid Hours Worked Value");
			return 0;
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
		
	}
}
