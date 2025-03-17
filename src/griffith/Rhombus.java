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
		this.firstDiagonal = firstDiagonal;
		this.secondDiagonal = secondDiagonal;
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
		this.fourthSide = fourthSide;
	}
	
	@Override
	double area() {
		if(firstDiagonal <= 0 || secondDiagonal <= 0) {
			return 0;
		}
		return (firstDiagonal * secondDiagonal) / 2.0;
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
