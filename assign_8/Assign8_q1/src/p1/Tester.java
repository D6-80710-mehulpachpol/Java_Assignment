package p1;

import java.util.Scanner;

public class Tester {
	
	
		static int menu() {
		
		int option;
		
		System.out.println("0. Exit");
    	System.out.println("1.Add Book");
    	System.out.println("2.Add Album");
    	System.out.println("3.Add Toy");
    	System.out.println("4.Display All Products.");
    	System.out.println("5.Display Bill");
    	System.out.println("6.Display Revenue Generated");

		System.out.println("Select an option : ");
		Scanner sc  = new Scanner(System.in);
		option =  sc.nextInt();
		
		
		return option;
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

    	int choice;
    	int bSize;
    	int counter=0;
    	System.out.print("Enter Number of Products : ");
    	bSize = new Scanner(System.in).nextInt();
    	Shop[] basket=new Shop[bSize];
    	

    	while ((choice = menu()) != 0) {

        	switch(choice){
            	case 1:
	           		  Book bk=new Book();
	                 	bk.acceptData();
	            	if(counter<bSize){
	                	basket[counter]=bk;
	                	counter++;
	            	}
	            	else
	            	{
	                	System.out.println("Basket is FUll!");
	            	}           	 
	            	break;

            	case 2:
           		 Album ab =new Album();
                	ab.acceptData();
	            	if(counter<bSize){
	               	 
	                	basket[counter]=ab;
	                	counter++;
	            	}
	            	else
	            	{
	                	System.out.println("Basket is FUll!");
	            	}           	 
	            	break;

            	case 3:
           		 Toys t =new Toys();
                	t.acceptData();
	            	if(counter<bSize){ 	 
	                	basket[counter]=t;
	                	counter++;
	            	}
	            	else
	            	{
	                	System.out.println("Basket is FUll!");
	            	}           	 
	            	break;

            	case 4:
            		
            		Utilitys.displayData(basket);
            		break;
            	
            	case 5:
            		Utilitys.totalBill(basket);
            		
            		break;
            		
            	case 6:
            		Utilitys.totalRevenue(basket);
            		
            		break;
            	
            	default:
            		System.out.println("Enter Valid Choice : ");
            		break;

		

	}

}
	}
	}
