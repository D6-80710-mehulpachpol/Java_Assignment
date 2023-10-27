
//Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work: 
//a) Total miles driven per day. 
//b) Cost per gallon of gasoline. 
//c) Average miles per gallon. 
//d) Parking fees per day. 
//e) Tolls per day. 


package day04;

import java.util.Scanner;

public class VehicelCost {
	
		int totalMiles;
		double costPerGallon;
		double average;
		int parkingFees;
		int toll;
		
		
		
		
	

	public VehicelCost(int totalMiles, double costPerGallon, double average, int parkingFees, int toll) {
			this.totalMiles = totalMiles;
			this.costPerGallon = costPerGallon;
			this.average = average;
			this.parkingFees = parkingFees;
			this.toll = toll;
		}




	public int getTotalMiles() {
			return totalMiles;
		}




		public void setTotalMiles(int totalMiles) {
			this.totalMiles = totalMiles;
		}




		public double getCostPerGallon() {
			return costPerGallon;
		}




		public void setCostPerGallon(double costPerGallon) {
			this.costPerGallon = costPerGallon;
		}




		public double getAverage() {
			return average;
		}




		public void setAverage(double average) {
			this.average = average;
		}




		public int getParkingFees() {
			return parkingFees;
		}




		public void setParkingFees(int parkingFees) {
			this.parkingFees = parkingFees;
		}




		public int getToll() {
			return toll;
		}




		public void setToll(int toll) {
			this.toll = toll;
		}
		
		public void calculateCost() {
			double cost = (this.totalMiles/this.average)*this.costPerGallon + this.parkingFees + this.toll;
			System.out.println("The total cost of the vehicle per day is : "+cost);
			
		}
		
		
		




	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data : ");
		System.out.println("Enter Total Miles : ");
		int miles = sc.nextInt();
		System.out.println("Enter Vehicle Average : ");
		double average = sc.nextDouble();
		System.out.println("Enter Cost per Gallon : ");
		double costper = sc.nextDouble();
		System.out.println("Enter Parking Fees : ");
		int parking = sc.nextInt();
		System.out.println("Enter Total Toll : ");
		int toll = sc.nextInt();
		
		
		VehicelCost vc1 = new VehicelCost(miles,costper,average,parking,toll);
		vc1.calculateCost();
		
		
		
		
		
		
		

	}

}
