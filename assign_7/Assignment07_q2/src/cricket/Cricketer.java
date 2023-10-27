package cricket;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
	

	int runsmade;
	int runsgiven;
	int wickets;
	int ballsfaced;
	int oversBowled;
	
	



	public int getOversBowled() {
		return oversBowled;
	}


	public void setOversBowled(int oversBowled) {
		this.oversBowled = oversBowled;
	}


	public int getRunsmade() {
		return runsmade;
	}


	public void setRunsmade(int runsmade) {
		this.runsmade = runsmade;
	}


	public int getRunsgiven() {
		return runsgiven;
	}


	public void setRunsgiven(int runsgiven) {
		this.runsgiven = runsgiven;
	}


	public int getBallsfaced() {
		return ballsfaced;
	}


	public void setBallsfaced(int ballsfaced) {
		this.ballsfaced = ballsfaced;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public Cricketer(int id, String name, int age, int matchesPlayed, int runsmade, int runsgiven, int wickets,
			int ballsfaced) {
		super(id, name, age, matchesPlayed);
		this.runsmade = runsmade;
		this.runsgiven = runsgiven;
		this.wickets = wickets;
		this.ballsfaced = ballsfaced;
	}


	public Cricketer(int id, String name, int age, int matchesPlayed) {
		super(id, name, age, matchesPlayed);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int getWickets() {
		
		return wickets;
	}
	
	@Override
	public double getEconomy() {
		double eco = runsgiven/oversBowled;
		return eco;
	}
	@Override
	public int getRuns() {
		
		return this.runsmade;
	}
	@Override
	public double getAverage() {
		double avg = this.runsmade/matchesPlayed;
		return avg;
	}
	@Override
	public double getStrikeRate() {
		double sr = runsmade/ballsfaced;
		return sr;
	}
	
	public void acceptCricketer() {
		super.acceptPlayer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Runsmade :");
		id = sc.nextInt();
		System.out.println("Enter RunsGiven :");
		name = sc.next();
		System.out.println("Enter Wickets :");
		age = sc.nextInt();
		System.out.println("Enter Ball Faced :");
		matchesPlayed = sc.nextInt();	
		System.out.println("Enter Over Bowled :");
		matchesPlayed = sc.nextInt();
	}


	@Override
	public String toString() {
		return "Cricketer [runsmade=" + runsmade + ", runsgiven=" + runsgiven + ", wickets=" + wickets + ", id=" + id
				+ ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}
	
	
	

}
