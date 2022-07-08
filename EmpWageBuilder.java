package empWageForMultipleCompanies;

public class EmpWageBuilder {
	public static final int IS_PRESENT_PARTTIME = 1;
	public static final int IS_PRESENT_FULLTIME = 2;
	   
	    public static int computeEmpWage(String companyname, int empWagePerHr, int noOfWorkingDays, int maxWorkingHrs) {
	    	// variables
	    	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	    	//computation
	    	while (totalEmpHrs <= maxWorkingHrs && totalWorkingDays < noOfWorkingDays) {
	    		totalWorkingDays++;
	    		int empCheck = (int) Math.floor (Math.random() * 10) %3;
	    		switch (empCheck) {
	    		case IS_PRESENT_PARTTIME:
	    		     empHrs = 4;
	    		     break;
	    		case IS_PRESENT_FULLTIME:
	    			 empHrs = 8;
	    			 break;
	    	    default:
	    	    	empHrs = 0;
	    		}
	    		totalEmpHrs += empHrs;
	    		System.out.println("Day : "+totalWorkingDays+  " Emp Hr: " +empHrs);
	    		}
	    	int totalEmpWage = totalEmpHrs * empWagePerHr;
	    	System.out.println("Total EmpWage for "+companyname+  " is : " +totalEmpWage);
	    	return totalEmpWage;
	    	}
	    public static void main(String[] args) {
	    	computeEmpWage("dMart", 20, 10, 50);
	    	computeEmpWage("Tata", 10, 5, 30);
	    }
}