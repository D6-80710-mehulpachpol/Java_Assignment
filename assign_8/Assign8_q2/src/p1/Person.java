//Write a Person class with fields (name, age) and appropriate constructors + getter/setters + equals(). 
//Write an Employee class inherited from Person class
//with additional fields (id and salary). Add abstract method double calcSalary(). 
//Write a Labor class inherited from Employee class with additional fields
//(rate and hours). Override calcSalary() as hours * rate. 
//Write a Salesman class inherited from Employee class with additional fields (target and
//commission). Override calcSalary() as salary + commission. 
//Write a Clerk class with no additional fields and calcSalary() returns basic salary only. The
//setter methods of all classes should throw a custom exception EmployeeException (with additional field - invalidValue), 
//if invalid values are set. 
//Create Employees helper class helper methods as follows. 
//In main(), create array of Employees and initialize with appropriate objects. Call these Employees
//helper methods and display results.
//double averageSalManagers(Employee[] arr);
//double averageSalSalesmans(Employee[] arr);
//double averageSalClerks(Employee[] arr);


package p1;

public class Person {
	
	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			throw new EmployeeException("Age",age);
		}
		else {
		this.age = age;
		}
	}
		
	
	

}
