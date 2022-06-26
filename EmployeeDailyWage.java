package employeeDailywage;
//use case 2 : employee Daily wage
public class EmployeeDailyWage{
	public static void main(String[] args) {
		int ISPRESENT=1;
		int wagePerHour=20;
		int workingHrs=8;
		double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck==ISPRESENT) {
			int empWage=wagePerHour*workingHrs;
			
			System.out.println("Employee is present");
			System.out.println("Employee Wage = "+empWage);
		}
		else {
			System.out.println("Employee is absent");
		}
	}
}