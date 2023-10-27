package cricket;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Enter the Number of Players : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Player[] arr = new Player[4];
		arr[0] = new Cricketer(1001, "Joe", 34, 100, 10500, 218, 16, 980);
		arr[1] = new Cricketer(1002, "root", 34, 10, 11500, 38, 62, 580);
		arr[2] = new Cricketer(1003, "Rohit", 34, 200, 19500, 818, 76, 5400);
		
		Batter b = new Cricketer(1001, "Joe", 34, 100, 10500, 218, 16, 980);
		Cricketer c = (Cricketer) b;
		
		
//		Batter b = new Cricketer(1003, "Rohit", 34, 200, 19500, 818, 76, 5400);
		

		
		System.out.println("The Number of Players are : " +  Utility.countBatters(arr));
		System.out.println("The Maximum Runs are : " +  Utility.totalRuns(arr));
		System.out.println("The Maximum Wickets are : " +  Utility.maxWickets(arr));
		

		
	}

}
