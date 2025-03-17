package griffith;

public abstract class Shape {
	private String name;

	Shape(String name){
		
	}
	
	public String getName() {
		//stab
		return "";
	}

	public void setName(String name) {
		//stab
	}
	
	abstract double area(); 
	abstract double perimeter();
	
	@Override
	public String toString() {
		//stab
		return "";
	}
}
