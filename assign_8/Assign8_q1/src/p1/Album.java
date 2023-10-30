//information includes title, price, singer, and musician. 


package p1;

import java.util.Scanner;

public class Album extends Shop {
	

	String singer;
	String musician;
	
	
	
	
	
	
	
//	public Album(String title, int price, String singer, String musician) {
//		super(title, price);
//		this.singer = singer;
//		this.musician = musician;
//	}







	public String getSinger() {
		return singer;
	}







	public void setSinger(String singer) {
		this.singer = singer;
	}







	public String getMusician() {
		return musician;
	}







	public void setMusician(String musician) {
		this.musician = musician;
	}



	@Override
	public void acceptData() {
		super.acceptData();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Singer : ");
			singer = sc.next();
			System.out.println("Enter Musician : ");
			musician = sc.next();
			
		}
	}



	@Override
	public double productPrice() {
		// TODO Auto-generated method stub
		return price+price*0.10;
	}
	

}
