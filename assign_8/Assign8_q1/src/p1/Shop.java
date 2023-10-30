// A shop sells different types of products like books, music albums, and toys. 
// Book information includes ISBN, title, price, author, and subject. Album
//information includes title, price, singer, and musician. 
//Toy information includes title, price, age group (string), type. 
//Though books are tax free, music
//albums have GST tax of 10% and toys have VAT tax of 5%.
//Sometimes shop keeper announce a sell, where he apply same percentage discount to every purchased products. 
//Assuming that each customer can purchase maximum 5 products at a time, write a menu driven program so that each user can
//purchase products of his choice. 
//At the end display total bill (including tax) to be paid by customer and total revenue of shop (excluding tax). 
//Design appropriate classes and their relations


package p1;

import java.util.Scanner;

public abstract class Shop {
	String title;
	int price;
	
//	public Shop(String title, int price) {
//		super();
//		this.title = title;
//		this.price = price;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void acceptData() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Title : ");
			title = sc.next();
			System.out.println("Enter the Price : ");
			price = sc.nextInt();
		}
		
	}

	public abstract double productPrice() ;
	

}
