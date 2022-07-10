package employeeWageWhileCase;

public class employeeWageRefactor {
	public static final	int IS_FullTime=1;
	public static final	int IS_PartTime=2;
	public static final	int wagePerHour=20;
	public static final int No_Of_Working_Days=20;
	public static final int Max_Hrs_In_Month=100;

	public static void computeEmpWage() {
		  // Variables 
        int	empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
       //computation
    while (totalEmpHrs <= Max_Hrs_In_Month &&
    		totalWorkingDays < No_Of_Working_Days) {
    	totalWorkingDays++;
       int empCheck = (int) Math.floor(Math.random() * 10) % 3;
       switch (empCheck) {
       case IS_PartTime:
    	   empHrs = 4;
    	   break;
       case IS_FullTime:
    	   empHrs = 8;
    	   break;
       default:
    	   empHrs = 0;
       }
       totalEmpHrs += empHrs;
       System.out.println("Day#: " + totalWorkingDays + " Emp Hrs: " +empHrs);
    }
    int totalEmpWage = totalEmpHrs * wagePerHour;
    System.out.println("Total Emp Wage: " + totalEmpWage);		
	}
	public static void main(String[] args) {
       computeEmpWage();
	}
}

