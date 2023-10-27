package q1;

public class Square extends Polygon {
	
	int side;

	public Square(int x, int y, int npOfSides, int side) {
		super(x, y, npOfSides);
		this.side = side;
	}
	

	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}


	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return side*side;
	}


	@Override
	public String toString() {
		return "Square [side=" + side + ", npOfSides=" + npOfSides + ", x=" + x + ", y=" + y + ", getSide()="
				+ getSide() + ", calcArea()=" + calcArea() + ", getNpOfSides()=" + getNpOfSides() + ", getX()=" + getX()
				+ ", getY()=" + getY() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
