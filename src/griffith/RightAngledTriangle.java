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
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.hypothenuse = hypothenuse;
	}
	
	@Override
	double area() {
		if(firstSide <= 0 || secondSide <= 0) {
			return 0;
		}
		return (firstSide * secondSide) / 2;
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
