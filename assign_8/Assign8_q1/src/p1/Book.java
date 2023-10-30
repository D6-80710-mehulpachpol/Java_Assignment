
// Book information includes ISBN, title, price, author, and subject. Album


package p1;

import java.util.Scanner;

public class Book extends Shop {
	


	String ISBN ;
	String author;
	String subject;
	
	
	
	
//	public Book(String title, int price, String iSBN, String author, String subject) {
//		super(title, price);
//		ISBN = iSBN;
//		this.author = author;
//		this.subject = subject;
//	}




	public String getISBN() {
		return ISBN;
	}




	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public String getSubject() {
		return subject;
	}




	public void setSubject(String subject) {
		this.subject = subject;
	}
	






//	@Override
//	public void acceptData() {
//		super.acceptData();
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter ISBN : ");
//			title = sc.next();
//			System.out.println("Enter Author : ");
//			title = sc.next();
//			System.out.println("Enter Subject: ");
//			title = sc.next();
//		}
//	}
	
	@Override
	public void acceptData() {
	    super.acceptData();
	    try (Scanner sc = new Scanner(System.in)) {
	        System.out.println("Enter ISBN: ");
	        ISBN = sc.next();
	        sc.nextLine(); // Consume the newline character

	        System.out.println("Enter Author: ");
	        author = sc.nextLine(); // Read the entire line, including spaces

	        System.out.println("Enter Subject: ");
	        subject = sc.nextLine(); // Read the entire line, including spaces
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}




	@Override
	public double productPrice() {
		
		return price;
	}
	

}
