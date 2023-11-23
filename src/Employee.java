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
	public int wageComputation(String type, int hoursWorked) {
		int wage = 0;
		switch(type) {
		case "full-time":
			if(hoursWorked >= 0 && hoursWorked <= 8) {
				wage = hoursWorked * 20;
			}
			break;
		case "part-time":
			if(hoursWorked >= 0 && hoursWorked <= 4) {
				wage = hoursWorked * 20;
			}
			break;
		default :
			System.out.println("Invalid Work Type");
		}
		return wage;
	}
	public int totalMontlyWage(int noOfDays, int noOfHours) {
		if(noOfDays > 0 && noOfDays <= 20) {
			return noOfDays * this.wageComputation("full-time", noOfHours);
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
}
