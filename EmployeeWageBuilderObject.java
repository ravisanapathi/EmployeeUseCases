package svaeTotalWageOfEmployee;

public class EmployeeWageBuilderObject {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String company;
	private final int empWagePerHr;
	private final int noOfWorkingDays;
	private final int maxWorkingHrs;
	private int totalEmpWage;
	
	public EmployeeWageBuilderObject (String company, int empWagePerHr, int noOfWorkingDays, int maxWorkingHrs) {
		this.company = company;
		this.empWagePerHr = empWagePerHr;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}
      public void computeEmpWage() {
    	  int empHrs = 0, empWorkingDays = 0, empWorkingHrs = 0;
    	  // computation
    	  while (empWorkingDays < noOfWorkingDays && empWorkingHrs <= maxWorkingHrs) {
    		  empWorkingDays++;
    		  int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    		  switch (empCheck) {
    		  case IS_PART_TIME:
    			  empHrs = 4;
    			  break;
    		  case IS_FULL_TIME:
    			  empHrs = 8;
    			  break;
    		  default:
    			  empHrs = 0;
    		  }
    		  empWorkingHrs += empHrs;
    			System.out.println("Day: " +empWorkingDays+ " Emp Hr = " +empHrs+ " Total EmpHr : " +empWorkingHrs);  
    	  }
    	  totalEmpWage = empWorkingHrs * empWagePerHr;
      }
      @Override
      public String toString() {
    	  return "Total Emp Wage For " +company+ " is: " +totalEmpWage;
      }
      public static void main(String[] args) {
    	  EmployeeWageBuilderObject dMart = new EmployeeWageBuilderObject("Dmart", 20, 5, 30);
    	  EmployeeWageBuilderObject ibm = new EmployeeWageBuilderObject("IBM", 50, 10, 30);
    	  dMart.computeEmpWage();
    	  System.out.println(dMart);
    	  ibm.computeEmpWage();
    	  System.out.println(ibm);
      }
}
