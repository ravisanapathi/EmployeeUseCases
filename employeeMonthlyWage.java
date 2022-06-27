package employeeMonthlyWage;
//use case 5 : employee Monthly wage

public class employeeMonthlyWage{
	int ISPRESENTFullTime=1;
		int ISPRESENTPartTime=2;
		int wagePerHour=20;
		int noOfWorkingdays=20;
		int workingHrsFullTime=8;
		int workingHrsPartTime=4;
	public static void main(String[] args) {
                // Variables
		int empHrs=0; empWage=0; totalEmpWage=0;
		//computation
		
		for (int day = 1; day <= noOfWorkingdays; day++) {
		     int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		
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
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);
	}
		       System.out.println("Total Emp Wage: " + totalEmpWage);
}
