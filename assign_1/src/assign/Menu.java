//3. Display food menu to user. User will select items from menu along with the quantity. 
//(eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) 
//Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.


package assign;

import java.util.Scanner;

public class Menu {
	
	
	
	
	public static void main(String[] args) {
		
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int choice;
		choice =1;
		while(choice!=0) {
			System.out.println("1.Buy Dosa - 20");
			System.out.println("2.Buy Samosa - 30");
			System.out.println("3.Buy Idli - 40");
			System.out.println("0.Bill");
			System.out.println("Enter Choice");

			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				total = total + 20;
				break;
			case 2:
				total = total + 30;
				break;
			case 3:
				total = total + 40;
				break;
			case 0:
				System.out.println("Total Bill is : " + total);
				
				System.out.println("Thank You For visiting");

				break;

			default:
				System.out.println("Not Valid");
				break;
			}

			
		}

		System.out.println("Thank You");
		
		
	}


}
