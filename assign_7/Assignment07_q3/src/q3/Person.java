package q3;

import java.util.Scanner;

public class Person {
	String name;
	int weight;
	Date birth;
	
	
	
	
	public Person(String name, int weight, Date birth) {
		super();
		this.name = name;
		this.weight = weight;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);

		birth=new Date();

		System.out.println("Enter Name : ");

		this.name=sc.next();

		System.out.println("Enter Weight : ");

		this.weight=sc.nextInt();

		System.out.println("Enter Birth date : ");

		this.birth.acceptDate();

		

		System.out.println("------------------------------------");
	}
	
	
	

}
