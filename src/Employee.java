import java.lang.Math;
public class Employee {
	public boolean checkAttendance() {
		double attendance = Math.random();
		if(attendance < 0.5) {
			return false;
		}
		return true;
	}
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");
		Employee e1 = new Employee();
		System.out.println("Employee Attendance: "+e1.checkAttendance());
	}
}
