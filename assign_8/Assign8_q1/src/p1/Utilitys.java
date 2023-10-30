package p1;

public class Utilitys {
	
	
	public static double totalBill(Shop arr[]) {
		
		int total = 0;
		
		for(Shop s : arr) {
			if(s instanceof Book) {
				total += s.getPrice();
			}
			else if(s instanceof Toys) {
				total += s.getPrice() + s.getPrice()*0.05;	
			}
			else {
				total += s.getPrice() + s.getPrice()*0.10;
			}
		}
		return total;
		
	}
	
	public static void displayData(Shop arr[]) {
		System.out.println("The Products present are : ");
		for(Shop s : arr) {
			System.out.println("1. " + s.getTitle() );
		}
	}
	
	public static double totalRevenue(Shop arr[]) {
		
		int total = 0;
		
		for(Shop s : arr) {
			total += s.getPrice();
		}
		return total;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
