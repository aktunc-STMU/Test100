
public class Shape {
	
	String color;
	
	boolean filled;
	int sides;
	public Shape(String color, boolean filled, int sides) {
		super();
		this.color = color;
		this.filled = filled;
		this.sides = sides;
	}
	
	public Shape() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	

}
