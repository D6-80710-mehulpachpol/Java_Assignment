package p1;

public class Clerk extends Employee {

	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	

}
