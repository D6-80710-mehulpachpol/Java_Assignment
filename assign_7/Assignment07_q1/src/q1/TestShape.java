package q1;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BoundedShape bs;
		System.out.println("Enter Number of Sides : ");
		int sd = sc.nextInt();
		
//			
//		bs = new Square(1,1,4,5);
//		System.out.println(bs.toString());
		
		
		bs = new Triangle(1,1,1,1,2,4);
		System.out.println(bs.toString());
		
		
			

	}

}
