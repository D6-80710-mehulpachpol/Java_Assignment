//Create a new (utilility) class Players that contains
//static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, 
//return a batter with maximum runs, and return a bowler with maximum wickets


package cricket;

public class Utility {
	
	
	public static int countBatters(Player arr[]) {
		int count = 0;
		for(Player p:arr) {
			count++;	
		}
		
		return count;
	}
	public static int countBowlers(Player arr[]) {
		int count = 0;
		for(Player p:arr) {
			count++;	
		}
				
		return count;
	}
	
	public static int totalRuns(Player arr[]) {
		int total = 0;
		for(Player p:arr) {
			Cricketer c = (Cricketer) p;
			total+=c.getRunsmade();
		}
		
		return total;
	}
	
	public static int totalWickets(Player arr[]) {
		int total = 0;
		for(Player p:arr) {
			Cricketer c = (Cricketer) p;
			total+=c.getWickets();
		}
		
		return total;
	}
	
	public static int maxRuns(Player arr[]) {
		
		int max = Integer.MIN_VALUE;
		for(Player p:arr) {
			Cricketer c = (Cricketer) p;
			max = Math.max(max, c.getRuns());	
		}
		return max;
	}
	
	
	public static int maxWickets(Player arr[]) {
		int max = Integer.MIN_VALUE;
		for(Player p:arr) {
			Cricketer c = (Cricketer) p;
			max = Math.max(max, c.getWickets());	
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
