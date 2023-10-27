package q1;

public class Rectangle extends Polygon {
	
	int length;
	int breadth;
	

	public Rectangle(int x, int y, int npOfSides, int length, int breadth) {
		super(x, y, npOfSides);
		this.length = length;
		this.breadth = breadth;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", npOfSides=" + npOfSides + ", x=" + x + ", y="
				+ y + ", getLength()=" + getLength() + ", getBreadth()=" + getBreadth() + ", calcArea()=" + calcArea()
				+ ", getNpOfSides()=" + getNpOfSides() + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

}
