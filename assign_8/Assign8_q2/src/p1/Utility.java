package p1;

public class Utility {
	
	
	double averageSalLabors(Employee[] arr) {
		double avg = 0;
		double total = 0;
		int cnt = 0;
		
		for(Employee e: arr) {
			if(e instanceof Labor) {
				cnt++;
				total+= e.getSalary();	
			}
		}
		return avg;
		
	}
	
	
	double averageSalSalesmans(Employee[] arr) {
		double avg = 0;
		double total = 0;
		int cnt = 0;
		
		for(Employee e: arr) {
			if(e instanceof Salesman) {
				cnt++;
				total+= e.getSalary();	
			}
		}
		return avg;
	}
	
	
	double averageSalClerks(Employee[] arr) {
		
		double avg = 0;
		double total = 0;
		int cnt = 0;
		
		for(Employee e: arr) {
			if(e instanceof Clerk) {
				cnt++;
				total+= e.getSalary();	
			}
		}
		return avg;
	}
	
	

}
