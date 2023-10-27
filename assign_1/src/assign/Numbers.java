package assign;

import java.util.Scanner;

public class Numbers {
		
		Integer num;
		
		public void getValue() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to Convert");
			num = sc.nextInt();
		}
		
		public void process() {
			System.out.println("The Binary Value of "+num +" is " + Integer.toBinaryString(num));
			System.out.println("The HexaDecimal Value of "+num +" is " + Integer.toHexString(num));
			System.out.println("The Octal Value of "+num +" is " + Integer.toOctalString(num));


		}
		
	public static void main(String[] args) {
		
			Integer a;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a choice");
			
			System.out.println("Option 1-> Enter Number");
			System.out.println("Option 2-> Process Number");
			System.out.println("Option 3-> Exit");
			a = sc.nextInt();
			Numbers c1 = new Numbers();

			
			while(a!=3) {
				System.out.println("Enter a choice");
				a = sc.nextInt();
				System.out.println("Option 1-> Enter Number");
				System.out.println("Option 2-> Process Number");
				System.out.println("Option 3-> Exit");
				
				switch (a) {
				case 1:
					c1.getValue();					
					break;
				case 2:
					c1.process();
					break;

				default:
					System.out.println("Enter correct Value");
					break;
				}
				
				
			}
			
			
			System.out.println("Hello World");
	
		}
	
	
}
