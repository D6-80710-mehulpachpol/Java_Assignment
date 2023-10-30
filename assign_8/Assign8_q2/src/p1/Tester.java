package p1;

import java.util.Scanner;

public class Tester {

	
	public static void main(String args[]) {
		
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
		
		Person[] arr = new Person[3];
		arr[0] = new Labor("a", 20, 1001, 2000, 700, 6);
		arr[1] = new Salesman("a", 20, 1001, 2000, 700, 0.6);
		arr[2] = new Labor("a", 20, 1001, 2000, 700, 9);
		
		try {
			arr[0].setAge(-87);
		}
		catch(EmployeeException e){
			System.out.println(e.getMessage());
			System.out.println("Wrong value: " + e.getValue());
			e.printStackTrace();	
		}

		
		
		
		
		
	}
}
