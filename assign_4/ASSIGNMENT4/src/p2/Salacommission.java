package p2;

public class Salacommission extends Employee {
	
	double baseSalary;
	double grossSalary;
	double comm;
	
	
	
	public Salacommission(String securityNumber, String firstName, String lastName, double baseSalary,
			double grossSalary, double comm) {
		super(securityNumber, firstName, lastName);
		this.baseSalary = baseSalary;
		this.grossSalary = grossSalary;
		this.comm = comm;
	}

	

	public double getBaseSalary() {
		return baseSalary;
	}



	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}



	public double getGrossSalary() {
		return grossSalary;
	}



	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}



	public double getComm() {
		return comm;
	}



	public void setComm(double comm) {
		this.comm = comm;
	}



	@Override
	public String toString() {
		return "Salacommission [baseSalary=" + baseSalary + ", grossSalary=" + grossSalary + ", comm=" + comm
				+ ", securityNumber=" + securityNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", getBaseSalary()=" + getBaseSalary() + ", getGrossSalary()=" + getGrossSalary() + ", getComm()="
				+ getComm() + ", earnings()=" + earnings() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getSecurityNumber()=" + getSecurityNumber() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	@Override
	public double earnings() {
		
		return this.comm*this.grossSalary + this.baseSalary  + this.baseSalary*0.10;
	}

}
