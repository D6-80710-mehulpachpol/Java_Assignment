package p2;

public abstract class Employee {
	
	String securityNumber;
	String firstName;
	String lastName;
	
	
	public Employee(String securityNumber, String firstName, String lastName) {
		super();
		this.securityNumber = securityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
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


	


	public String getSecurityNumber() {
		return securityNumber;
	}


	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}


	@Override
	public String toString() {
		return "Employee [securityNumber=" + securityNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getSecurityNumber()="
				+ getSecurityNumber() + ", earnings()=" + earnings() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	public abstract double earnings();
	
	
	

}
