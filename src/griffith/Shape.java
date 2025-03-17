package griffith;

public abstract class Shape {
	private String name;

	Shape(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract double area(); 
	abstract double perimeter();
	
	@Override
	public String toString() {
		//stab
		return "";
	}
}
