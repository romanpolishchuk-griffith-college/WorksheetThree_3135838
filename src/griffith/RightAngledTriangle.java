package griffith;

public class RightAngledTriangle extends Shape {

	private double firstSide;
	private double secondSide;
	private double hypothenuse;
	
	//Init variables
	RightAngledTriangle(String name,
			double firstSide,
			double secondSide,
			double hypothenuse){
		super(name);
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.hypothenuse = hypothenuse;
	}
	
	//Find right angled triangle area
	@Override
	double area() {
		if(firstSide <= 0 || secondSide <= 0) {
			return 0;
		}
		return (firstSide * secondSide) / 2;
	}

	//Find right angled triangle perimeter
	@Override
	double perimeter() {
		if(firstSide <= 0 || secondSide <= 0) {
			return 0;
		}
		return firstSide + secondSide + hypothenuse;
	}

	//Override toString method
	@Override
	public String toString() {
		return "Right Angled Triangle has name: " + getName() +
				", and firstSide: " + firstSide +
				", secondSide: " + secondSide + 
				", hypothenuse: " + hypothenuse;
	}
}
