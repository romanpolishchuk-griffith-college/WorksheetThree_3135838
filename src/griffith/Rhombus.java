package griffith;

public class Rhombus extends Shape {

	private double firstDiagonal;
	private double secondDiagonal;
	
	private double firstSide;
	private double secondSide;
	private double thirdSide;
	private double fourthSide;
	
	Rhombus(String name,
			double firstDiagonal,
			double secondDiagonal,
			double firstSide,
			double secondSide,
			double thirdSide,
			double fourthSide){
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
