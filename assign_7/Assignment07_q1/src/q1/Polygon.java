package q1;

public abstract class Polygon extends BoundedShape {
	
	int npOfSides;

	public Polygon(int x, int y, int npOfSides) {
		super(x, y);
		this.npOfSides = npOfSides;
	}

	public int getNpOfSides() {
		return npOfSides;
	}

	public void setNpOfSides(int npOfSides) {
		this.npOfSides = npOfSides;
	}
	

}
