package sample1;

public class Employee {
			    static int number = 100; 
			    static String companyName = "Anudip Foundation"; 
			    // Instance variables
			    int eid;
			    String ename;

			    Employee(String ename) {
			        this.eid = number;
			        this.ename = ename;
			    }
			    // Static method to display employee details
			    static void displayEmployeeDetails(Employee emp) {
			        System.out.println("Employee ID: " + emp.eid);
			        System.out.println("Employee Name: " + emp.ename);
			        System.out.println("Company Name: " + companyName);
			    }
			    public static void main(String[] args) {
			        Employee emp = new Employee("Raju");
			        displayEmployeeDetails(emp);
			    }
}


	

