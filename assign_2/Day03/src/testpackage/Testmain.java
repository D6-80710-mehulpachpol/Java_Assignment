package testpackage;

import Assignment2.Employee;

public class Testmain {

	public static void main(String[] args) {
		
		Employee e2 = new Employee("Chitransh" ,"Rai" , 1800000);
		Employee e1 = new Employee("ansh" ,"Raichand" , 2000);
		e1.displaySalary();
		e2.raise();
		e2.displaySalary();
		e1.raise();
		e1.displaySalary();

		
	}

}
