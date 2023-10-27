package p2;

public class Commission  extends Employee{
	
	
	double grossSalary;
	double comm;
	
	public Commission(String securityNumber, String firstName, String lastName, double grossSalary, double comm) {
		super(securityNumber, firstName, lastName);
		this.grossSalary = grossSalary;
		this.comm = comm;
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
		return "Commission [grossSalary=" + grossSalary + ", comm=" + comm + ", securityNumber=" + securityNumber
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", getGrossSalary()=" + getGrossSalary()
				+ ", getComm()=" + getComm() + ", earnings()=" + earnings() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getSecurityNumber()=" + getSecurityNumber() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return this.comm*this.grossSalary;
	}

}
