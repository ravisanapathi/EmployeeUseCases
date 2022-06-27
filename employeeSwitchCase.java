package employeeSwitchCase;

public class employeeSwitchCase{
    public static final	int IS_FullTime=1;
	public static final	int IS_PartTime=2;
	public static final	int wagePerHour=20;
	
	public static void main(String[] args) {
                // Variables 
	            int	empWage=0; 
	            int	empHrs=0;
		       //computation
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
		       empWage = empHrs * wagePerHour;
		       System.out.println("Employee Wage: " + empWage);
	}
}