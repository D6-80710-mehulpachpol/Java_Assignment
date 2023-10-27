//Create a class called Employee that includes three fields—a first name (type String), a last 
//name (type String) and a monthly salary (double). Provide a constructor that initializes the three 
//instance variables. Provide a set and a get method for each instance variable.  
//is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates 
//class Employee’s capabilities. Create two Employee objects If the monthly salaryand display each object’s yearly salary. 
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.


package Assignment2;

public class Employee {
	 	
	String firstName;
	String lastName;
	double salary;
	

	public Employee(String firstName, String lastName, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		if(salary<0) {
			this.salary = 0;
		}
		else {
			this.salary = salary;
		}
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getSalary() {
		return salary;
	}
	
	public void raise() {
		this.salary = this.salary+this.salary*0.10;
		System.out.println("Salary Raised by 10%");
	}
	
	public void displaySalary() {
		System.out.println("Name : "+this.firstName + " "+this.lastName);
		System.out.println("Salary is : "+this.salary*12);
	}


	public void setSalary(double salary) {
		if(salary<0) {
			this.salary = 0;
		}
		else {
			this.salary = salary;
		}
	}


	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mehul", "Pachpol", 120000);
		e1.displaySalary();
	}

}
