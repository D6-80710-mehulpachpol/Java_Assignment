package p1;


class EmployeeException extends RuntimeException {
	private String field; 
	private int value;
	private double value2;
	public EmployeeException() {
		super("Invalid time");
	}
	public EmployeeException(String field, int value) {
		super("Invalid " + field + ": " + value);
		this.field = field;
		this.value = value;
	}
	
	public EmployeeException(String field, double value2) {
		super("Invalid " + field + ": " + value2);
		this.field = field;
		this.value2 = value2;
	}
	public String getField() {
		return field;
	}
	public int getValue() {
		return value;
	}
	public double getValue2() {
		return value2;
	}
	
}
