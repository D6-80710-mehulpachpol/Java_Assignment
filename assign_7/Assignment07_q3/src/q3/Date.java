package q3;

import java.util.Scanner;

public class Date {
	int day;
	int month;
	int year;
	
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	void acceptDate() {

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter Day : ");

		this.day=sc.nextInt();

		System.out.println("Enter Month : ");

		this.month=sc.nextInt();

		System.out.println("Enter Year : ");

		this.year=sc.nextInt();

	}
	
	
	
	

}
