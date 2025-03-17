package griffith;

public class Circle extends Shape {

	private double radius;
	
	Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}
	
	//Find circle area
	@Override
	double area() {
		if (radius <= 0) {
			return 0;
		}
		return Math.PI * (radius * radius);
	}

	//Find circle perimeter
	@Override
	double perimeter() {
		if (radius <= 0) {
			return 0;
		}
		return 2 * Math.PI * radius;
	}

	//Override toString method
	@Override
	public String toString() {
		return "Circle has name: " + getName() + ", and radius " + radius;
	}
}
