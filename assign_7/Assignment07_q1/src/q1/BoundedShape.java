
//1. Create an abstract class BoundedShape with fields x, y. Provide abstract method calcArea(). 
//Inherit it into a Circle class with additional fields radius and
//override calcArea() method. Inherit BoundedShape into another abstract class Polygon with additional field number of sides. 
//Inherit BoundedShape into
//classes Triangle (fields: side1, side2, side3), Square (fields: side), and Rectangle (fields: length, breadth). 
//Override calcArea() method in them.



package q1;

public  abstract class BoundedShape {
	
	int x ;
	int y ;
	
	public BoundedShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract double calcArea();
	
	
	
	

}
