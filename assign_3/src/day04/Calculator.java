
//Q1. (Credit Limit Calculator)
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.



//For each customer,the following facts are available:

//a) account number
//b) pending balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit. 



//The program should input all these facts as integers, calculate the new balance (= beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded".
//For eg -
//Allowed Credit = 50000
//total items charged = 25000
//total all credit applied in this month = 10000
//pending balance at the begining of the month = 5000
//new balance for next month = 5000+25000-10000 => 20000 < Allowed Limit
//Allowed Credit = 20000
//total items charged = 20000
//total all credit applied in this month = 5000
//pending balance at the begining of the month = 10000
//new balance for next month = 10000+20000-5000 => 25000 > Allowed Limit

package day04;

import java.util.Scanner;

public class Calculator {
	int accountno;
	int itemsCharged;
	int totalCreditForMonth ;
	int pendingBalance;
	int limit;

	public Calculator(int accountno, int itemsCharged, int totalCreditForMonth, int pendingBalance, int limit) {
		this.accountno = accountno;
		this.itemsCharged = itemsCharged;
		this.totalCreditForMonth = totalCreditForMonth;
		this.pendingBalance = pendingBalance;
	}

	public int getAccountno() {
		return accountno;
	}
	
	public int getLimit() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public int getItemsCharged() {
		return itemsCharged;
	}

	public void setItemsCharged(int itemsCharged) {
		this.itemsCharged = itemsCharged;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getTotalCreditForMonth() {
		return totalCreditForMonth;
	}

	public void setTotalCreditForMonth(int totalCreditForMonth) {
		this.totalCreditForMonth = totalCreditForMonth;
	}

	public int getPendingBalance() {
		return pendingBalance;
	}

	public void setPendingBalance(int pendingBalance) {
		this.pendingBalance = pendingBalance;
	}
	
	public void checkLimit() {
		int total = this.itemsCharged + this.pendingBalance - this.totalCreditForMonth ;
		if(total<this.limit) {
			System.out.println("Credit limit ok!");
			System.out.println("Your balance is : "+total);
		}
		else {
			System.out.println("Credit limit Exceeded!");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data:");
		System.out.println("Enter Limit:");
		int b = sc.nextInt();
		System.out.println("Enter PendingBalance:");
		int c = sc.nextInt();

		System.out.println("Enter Total Credit For Month:");
		int d = sc.nextInt();

		System.out.println("Enter ItemCharged:");
		int e = sc.nextInt();
		
		Calculator c1 =  new Calculator(1,e,d,c,b);
		c1.checkLimit();

		

		
		
		

	}

}
