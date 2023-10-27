package assign;

import java.util.Scanner;

public class Typecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0;
		double b = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		if(sc.hasNextDouble()) {
			a = sc.nextDouble();
			flag = false;
		}
		else {
			System.out.println("First Not a Double");
		}
		if(sc.hasNextDouble()) {
			b = sc.nextDouble();
			flag = false;
		}
		else {
			System.out.println("Not a Double");
		}
		
		if(flag) {
			System.out.println("not valid values");
		}
		else {
			System.out.println("The average is " + (a+b)/2);

		}
		
		
		

	}

}
