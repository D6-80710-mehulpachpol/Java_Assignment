package p1;

public class Labor extends Employee {
	
	
	
	int hour;
	int rate;

	public Labor(String name, int age, int id, double salary, int hour, int rate) {
		super(name, age, id, salary);
		this.hour = hour;
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		if(rate<0) {
			throw new EmployeeException("Salary" , salary);
		}
		else {
			this.rate = rate;
		}
		
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return hour*rate;
	}

	public void acceptData() {
		// TODO Auto-generated method stub
		
	}

}
