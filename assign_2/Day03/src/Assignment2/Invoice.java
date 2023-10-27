
//Create a class called Invoice that a hardware store might use to represent an invoice for an item 
//sold at the store. An Invoice should include four pieces of information as fields—a part number 
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the 
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities


package Assignment2;

public class Invoice {
	String partName;
	String description;
	int quantity;
	double price;
	
	
	
	
	public Invoice(String partName, String description, int quantity, double price) {
		this.partName = partName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void invoiceAmount() {
		
		double total = 0.0;
		if(this.quantity<0 || this.price<0) {
			this.quantity = 0;
			this.price = 0;
		}
		total = this.quantity*this.price;
		System.out.println("PartName" + this.price);
		System.out.println("Description" + this.description);
		System.out.println("Total amount : " + total);
		
	}

	public static void main(String[] args) {
		
		Invoice i =new Invoice("tv" , "Led" ,-3,40000.60);
		i.invoiceAmount();
		

	}

}
