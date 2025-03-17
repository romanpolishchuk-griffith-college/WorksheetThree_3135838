package griffith;

public class RightAngledTriangle extends Shape {

	private double firstSide;
	private double secondSide;
	private double hypothenuse;
	
	RightAngledTriangle(String name,
			double firstSide,
			double secondSide,
			double hypothenuse){
		super(name);
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
