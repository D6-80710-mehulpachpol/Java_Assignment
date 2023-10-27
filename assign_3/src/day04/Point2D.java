//
//Q2.  Copy the  Point2D class , along with the package from previous assignment. 
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably 
//Hint : for loop

//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2)  Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit



package day04;

import java.util.Scanner;

public class Point2D {
	
	
	
	
	
	
	
	public static int menu() {
		
		int option;
		System.out.println("Choose From The Menu : ");
		System.out.println("1. Display Details of Specific Element");
		System.out.println("2. Display Details of All Element");
		System.out.println("3. Validate Specific Element");
		System.out.println("4. EXIT");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		return option;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points to store : ");
		int size = sc.nextInt();
		Points[] pt =new Points[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the X-co-ordinate for Point "+i);
			int a = sc.nextInt();
			System.out.println("Enter the Y-co-ordinate for Point "+i);
			int b = sc.nextInt();
			pt[i] = new Points(a,b);		
		}
		int choice;
		while((choice = menu())!=4) {
			
			switch (choice) {
			case 1: {
				System.out.println("Enter index of the point");
				int idx = sc.nextInt();	
				if(idx>size) {
					System.out.println("Invalid Index");
				}
				else {
					pt[idx].getDetails();

				}	
				break;
			}
			
			case 2: {	
				
				System.out.println("The Points present are : ");
				for(int i=0;i<size;i++) {
					pt[i].getDetails();
				}
				break;
					
			}
			case 3: {
				
				System.out.println("Calculate Distance : ");
				
				System.out.println("Enter Index of point1 : ");
				int idx1  = sc.nextInt();
				System.out.println("Enter Index of point2 : ");
				int idx2 = sc.nextInt();
				pt[idx1].calculateDistance(pt[idx2].getX(), pt[idx2].getY());

				break;
				
			}
			default:
				System.out.println("Enter Correct Values");
			}
			
		}
		
		
		
		Points p1 = new Points(1,2);

	}

}
