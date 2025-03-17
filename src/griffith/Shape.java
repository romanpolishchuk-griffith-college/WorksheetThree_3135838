package griffith;

public abstract class Shape {
	private String name;

	Shape(String name){
		this.name = name;
	}
	
	//Getter
	public String getName() {
		return name;
	}

	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	//Abstract methods
	abstract double area(); 
	abstract double perimeter();
	
	@Override
	public String toString() {
		//stab
		return "";
	}
}
