package griffith;

public class Rhombus extends Shape {

	private double firstDiagonal;
	private double secondDiagonal;
	
	private double firstSide;
	private double secondSide;
	private double thirdSide;
	private double fourthSide;
	
	//Init variables
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
	
	//Find rhombus area
	@Override
	double area() {
		if(firstDiagonal <= 0 || secondDiagonal <= 0) {
			return 0;
		}
		return (firstDiagonal * secondDiagonal) / 2.0;
	}
	
	//Find rhombus perimeter
	@Override
	double perimeter() {
		if(firstSide <= 0 || secondSide <= 0 || thirdSide <= 0 || fourthSide <= 0) {
			return 0;
		}
		return firstSide + secondSide + thirdSide + fourthSide;
	}

	//Override toString method
	@Override
	public String toString() {
		return "Rhombus has name: " + getName() +
				", and firstDiagonal: " + firstDiagonal +
				", secondDiagonal: " + secondDiagonal + 
				", firstSide: " + firstSide +
				", secondSide: " + secondSide +
				", thirdSide: " + thirdSide +
				", fourthSide: " + fourthSide;
	}
}
