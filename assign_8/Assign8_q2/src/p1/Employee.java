package p1;

public abstract class Employee extends Person{
	
	int id;
	double salary;
	
	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<0) {
			throw new EmployeeException("Salary" , salary);
		}
		else {
		this.salary = salary;
		}
	}
	
	public abstract double calcSalary();
	
	

}
