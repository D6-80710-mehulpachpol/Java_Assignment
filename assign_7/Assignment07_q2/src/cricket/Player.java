// Create an abstract Player class with id, name, age, and matchesPlayed as fields. Create a Batter interface with methods like 
//getRuns(), getAverage(), and
//getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). 
//Create a class Cricketer (with fields like runs, wickets, etc.)
//inherited from Player as well as Batter and Bowler interfaces. 
//In all classes write appropriate constructors, getter/setters, accept(), toString(), and
//equals() methods. In main(), create a team (array) of 11 players and input their details from end user.
//Create a new (utilility) class Players that contains
//static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, 
//return a batter with maximum runs, and return a bowler with maximum wickets


package cricket;

import java.util.Scanner;

public abstract class Player {
	
	int id ;
	String name;
	int age;
	int matchesPlayed;
	
	
	
	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	public void acceptPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id :");
		id = sc.nextInt();
		System.out.println("Enter Name :");
		name = sc.next();
		System.out.println("Enter Age :");
		age = sc.nextInt();
		System.out.println("Enter Matches :");
		matchesPlayed = sc.nextInt();		
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getMatchesPlayed()=" + getMatchesPlayed() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
