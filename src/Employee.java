import java.lang.Math;
import java.util.Scanner;
public class Employee {
	
	Employee(){
		System.out.println("Employee Created");
	}
	
	public boolean checkAttendance() {
		double attendance = Math.random();
		if(attendance < 0.5) {
			return false;
		}
		return true;
	}
	public int wageComputation(String type, int hoursWorked, int fullTimeWage, int partTimeWage, int maxFullTime, int maxPartTime) {
		int wage = 0;
		switch(type) {
		case "full-time":
			if(hoursWorked >= 0 && hoursWorked <= maxFullTime) {
				wage = hoursWorked * fullTimeWage;
			}
			break;
		case "part-time":
			if(hoursWorked >= 0 && hoursWorked <= maxPartTime) {
				wage = hoursWorked * partTimeWage;
			}
			break;
		default :
			System.out.println("Invalid Work Type");
		}
		return wage;
	}
	public int totalMontlyWage(int noOfDays, int noOfHours, int maxDays, int fullTimeWage, int partTimeWage, int maxFullTime, int maxPartTime) {
		if(noOfDays > 0 && noOfDays <= maxDays) {
			return noOfDays * this.wageComputation("full-time", noOfHours, fullTimeWage, partTimeWage, maxFullTime, maxPartTime);
		}
		else {
			System.out.println("Invalid No of days");
			return 0;
		}
	}
	public int totalWageLimited(int noOfDays, int noOfHours, int maxDays, int fullTimeWage, int partTimeWage, int maxFullTime, int maxPartTime) {
		if (noOfDays < 0 || noOfDays > maxDays){
			System.out.println("Invalid No of days");
			return 0;
		}
		else if(noOfHours < 0 || noOfHours > maxFullTime) {
			System.out.println("Invalid Hours per day");
			return 0;
		}
		else {
			int totalHoursWorked = noOfDays * noOfHours;
			if(totalHoursWorked > noOfHours) {
				totalHoursWorked = noOfHours;
			}
			return fullTimeWage * totalHoursWorked;
			
		}
		
		
	}


}
