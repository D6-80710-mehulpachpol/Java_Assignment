package p1;

public class Salesman extends Employee{
	int target;
	double commission;
	
	public Salesman(String name, int age, int id, double salary, int target, double commission) {
		super(name, age, id, salary);
		this.target = target;
		this.commission = commission;
	}
	
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		if(commission<0) {
			throw new EmployeeException("Commission" , commission);
		}
		this.commission = commission;
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return target*commission;
	}
	
	

}
