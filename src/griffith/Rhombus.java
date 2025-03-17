package griffith;

public class Rhombus extends Shape {

	private float firstDiagonal;
	private float secondDiagonal;
	
	private float firstSide;
	private float secondSide;
	private float thirdSide;
	private float fourthSide;
	
	Rhombus(String name,
			float firstDiagonal,
			float secondDiagonal,
			float firstSide,
			float secondSide,
			float thirdSide,
			float fourthSide){
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
