package griffith;

public class Circle extends Shape {

	private float radius;
	
	Circle(String name, float radius){
		super(name);
		this.radius = radius;
	}
	
	@Override
	double area() {
		//stab
		return 0.0;
	}

	@Override
	double perimeter() {
		//stab
		return 0.0;
	}

	@Override
	public String toString() {
		//stab
		return "";
	}
}
