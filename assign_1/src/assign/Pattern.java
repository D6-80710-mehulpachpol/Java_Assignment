package assign;

import java.util.Scanner;

public class Pattern {
	
	Integer num;
	
	public void setValue(int num) {
		this.num = num;
	}
	
	public void Pattern1() {
		for(int i=0;i<num;i++) {
			for(int j = num-i-1;j<num;j++) {
				System.out.print("*");
				
			}
			System.out.println();		
		}
	}
	
	public void Pattern2() {
		for(int i=0;i<num;i++) {
			for(int j = 0;j<num-i-1;j++) {
				System.out.print(" ");	
			}
			
			for(int j = num-i-1;j<num;j++) {
				System.out.print("*");	
			}
			System.out.println();		
		}
	}
	
	public void Pattern3() {
		for (int i = 0; i <=num; i++) { 
			  
            for (int j = num; j >= i; j--) { 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
	}
	
	public void Pattern4() {
		for (int i = 0; i <=num; i++) { 
			  
            for (int j = num; j >= i; j--) { 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
	}
	
	
	
	
	public static void main(String[] args) {
		
		Pattern p1 = new Pattern();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Pattern");
		int a = sc.nextInt();
		p1.setValue(a);
		p1.Pattern3();
		
	}

}
