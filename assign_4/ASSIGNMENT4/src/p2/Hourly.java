package p2;

public class Hourly extends Employee {
	
	double hourlyWage;
	int hoursWorked;
	
	
	
	public Hourly(String securityNumber, String firstName, String lastName, double hourlyWage, int hoursWorked) {
		super(securityNumber, firstName, lastName);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
	@Override
	public String toString() {
		return "Hourly [hourlyWage=" + hourlyWage + ", hoursWorked=" + hoursWorked + ", securityNumber="
				+ securityNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", getHourlyWage()="
				+ getHourlyWage() + ", getHoursWorked()=" + getHoursWorked() + ", earnings()=" + earnings()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getSecurityNumber()="
				+ getSecurityNumber() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	@Override
	public double earnings() {
		double temp = 0;
		if(this.hoursWorked>40) {
			return this.hourlyWage*this.hoursWorked;
		}
		else {
			return 40*this.hourlyWage + (this.hoursWorked-40)*this.hourlyWage*1.5;
		}

	}
	
	
	

}
