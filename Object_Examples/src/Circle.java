
public class Circle extends Shape {
	
	double radius;

	public Circle(String color, boolean filled, int sides, double radius) {
		super(color, filled, sides);
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	
	

}
