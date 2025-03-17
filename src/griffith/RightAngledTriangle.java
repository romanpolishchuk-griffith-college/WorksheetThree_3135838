package griffith;

public class RightAngledTriangle extends Shape {

	private float firstSide;
	private float secondSide;
	private float hypothenuse;
	
	RightAngledTriangle(String name,
			float firstSide,
			float secondSide,
			float hypothenuse){
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
