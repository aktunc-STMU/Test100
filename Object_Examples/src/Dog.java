import java.util.Date;
public class Dog {
	
	String color;
	double weight;
	int age;
	Date date;
	
	public Dog() {
		
		date = new Date();
		
	}
	
	public Dog(String color, double weight, int age, Date date) {
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.date = date;
		date = new Date();
	}
	
	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", weight=" + weight + ", age=" + age + ", date=" + date + "]";
	}
	
	
	

}
