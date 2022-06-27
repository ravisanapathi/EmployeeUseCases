package employeeMonthlyWage;
//use case 5 : employee Monthly wage

public class employeeMonthlyWage{
    public static final	int ISPRESENTFullTime=1;
	public static final	int ISPRESENTPartTime=2;
	public static final	int wagePerHour=20;
	public static final	int noOfWorkingdays=20;
	public static final	int workingHrsFullTime=8;
	public static final	int workingHrsPartTime=4;
	public static void main(String[] args) {
                // Variables 
	    int	empWage=0; 
	    int	totalEmpWage=0;
		//computation
		
		for (int day = 1; day <= noOfWorkingdays; day++) {
		     int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		
		if(empCheck==ISPRESENTFullTime) {
			 empWage=wagePerHour*workingHrsFullTime;
			
			System.out.println("Employee is present FullTime");
			System.out.println("Employee Wage = "+empWage);
		}
		else if(empCheck==ISPRESENTPartTime) {
			empWage=wagePerHour*workingHrsPartTime;
			
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
}
