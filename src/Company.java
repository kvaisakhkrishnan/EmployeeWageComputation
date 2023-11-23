import java.util.*;
public class Company {
	private int fullTimeWage;
	private int partTimeWage;
	private int fullTimeWorkingHours;
	private int partTimeWorkingHours;
	private int noOfDays;
	private int noOfHours;
	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}


	private Employee employee;
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getFullTimeWage() {
		return fullTimeWage;
	}

	public void setFullTimeWage(int fullTimeWage) {
		this.fullTimeWage = fullTimeWage;
	}

	public int getPartTimeWage() {
		return partTimeWage;
	}

	public void setPartTimeWage(int partTimeWage) {
		this.partTimeWage = partTimeWage;
	}

	public int getFullTimeWorkingHours() {
		return fullTimeWorkingHours;
	}

	public void setFullTimeWorkingHours(int fullTimeWorkingHours) {
		this.fullTimeWorkingHours = fullTimeWorkingHours;
	}

	public int getPartTimeWorkingHours() {
		return partTimeWorkingHours;
	}

	public void setPartTimeWorkingHours(int partTimeWorkingHours) {
		this.partTimeWorkingHours = partTimeWorkingHours;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	
	public Company(int fullTimeWage, int partTimeWage, int fullTimeWorkingHours, int partTimeWorkingHours, int noOfDays, int noOfHours, Employee employee){
		this.fullTimeWage = fullTimeWage;
		this.partTimeWage = partTimeWage;
		this.fullTimeWorkingHours = fullTimeWorkingHours;
		this.partTimeWorkingHours = partTimeWorkingHours;
		this.noOfDays = noOfDays;
		this.noOfHours = noOfHours;
		this.employee = employee;
	}
	
	

	void wageComputation() {
		Scanner scanner = new Scanner(System.in);
		boolean checkAttendance = employee.checkAttendance();
		System.out.println("Employee Attendance: "+checkAttendance);
		if(checkAttendance == true) {
			System.out.println("Enter no of hours worked");
			int noOfHours = scanner.nextInt();
			System.out.println("Daily Wage is : "+ employee.wageComputation("full-time", noOfHours, this.fullTimeWage, this.partTimeWage, this.fullTimeWorkingHours, this.partTimeWorkingHours));
		}
		Employee e2 = new Employee();
		System.out.println("Enter no of part time hours worked");
		int noOfHours = scanner.nextInt();
		System.out.println("Part Time Wage is : "+ employee.wageComputation("part-time", noOfHours, this.fullTimeWage, this.partTimeWage, this.fullTimeWorkingHours, this.partTimeWorkingHours));
		
		System.out.println("Enter no of days worked: ");
		int noOfDays = scanner.nextInt();
		System.out.println("Enter no of hours worked per day");
		noOfHours = scanner.nextInt();
		System.out.println("Total Montly Wage: "+ employee.totalMontlyWage(noOfDays, noOfHours, this.noOfDays, this.fullTimeWage, this.partTimeWage, this.fullTimeWorkingHours, this.partTimeWorkingHours));
		System.out.println("Total Montly Wage Limited Upto 20 days and 100 hours: "+ employee.totalWageLimited(noOfDays, noOfHours, this.noOfDays, this.fullTimeWage, this.partTimeWage, this.fullTimeWorkingHours, this.partTimeWorkingHours));
	}
	
	
}
