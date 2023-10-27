package q1;

public class Circle extends BoundedShape{
	


	double radius;
	public static final double Pi = 3.14;
	

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}


	@Override
	public double calcArea() {
		
		return Pi*(radius*radius);
	}

}
