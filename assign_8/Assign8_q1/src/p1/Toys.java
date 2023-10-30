//Toy information includes title, price, age group (string), type. 


package p1;

import java.util.Scanner;

public class Toys extends Shop {
	

	String ageGroup;
	
	

//	public Toys(String title, int price, String ageGroup) {
//		super(title, price);
//		this.ageGroup = ageGroup;
//	}



	public String getAgeGroup() {
		return ageGroup;
	}



	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}
	
	
	@Override
	public void acceptData() {
		super.acceptData();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter ageGroup : ");
			ageGroup = sc.next();	
			
		}
	}


	@Override
	public double productPrice() {
		// TODO Auto-generated method stub
		return price + price*0.05;
	}
	

}
