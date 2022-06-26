package employeePartTimeWage;
//use case 3 : employee PartTime wage

public class employeePartTimeWage{
	public static void main(String[] args) {
		int ISPRESENTFullTime=1;
		int ISPRESENTPartTime=2;
		int wagePerHour=20;
		int workingHrsFullTime=8;
		int workingHrsPartTime=4;
		double empCheck=Math.floor(Math.random()*10)%2;
		
		
		if(empCheck==ISPRESENTFullTime) {
			int empWage=wagePerHour*workingHrsFullTime;
			
			System.out.println("Employee is present FullTime");
			System.out.println("Employee Wage = "+empWage);
		}
		else if(empCheck==ISPRESENTPartTime) {
			int empWage=wagePerHour*workingHrsPartTime;
			
			System.out.println("Employee is present PartTime");
			System.out.println("Employee Wage = "+empWage);
		}
		else {
			System.out.println("Employee is absent");
		}
	}
}