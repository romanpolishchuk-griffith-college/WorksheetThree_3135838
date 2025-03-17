package griffith;

public class Circle extends Shape {

	private double radius;
	
	Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}
	
	@Override
	double area() {
		if (radius <= 0) {
			return 0;
		}
		return Math.PI * (radius * radius);
	}

	@Override
	double perimeter() {
		//stab
		return 0;
	}

	@Override
	public String toString() {
		//stab
		return "";
	}
}
