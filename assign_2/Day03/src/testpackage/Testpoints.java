package testpackage;

import com.app.geometry.Points;

public class Testpoints {

	public static void main(String[] args) {
		
		Points p1 = new Points(2,5);
		Points p2 = new Points(2,5);
		
		if(p1.equals(p2)) {
			System.out.println("the points are equal and distance is 0");
		}
		else {
			p1.calculateDistance(p2.getX(), p2.getY());
		}
	}

}
