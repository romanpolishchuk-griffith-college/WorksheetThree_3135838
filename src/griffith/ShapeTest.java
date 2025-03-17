package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

	double roundToTwoDecimals(double num) {
		return Math.round(num * 100.0) / 100.0;
	}
	
	//Unit tests
	
	@Test
	void testCircleArea() {
		Circle circle = new Circle("Test circle", 10);
		assertEquals(314.16, roundToTwoDecimals(circle.area()));
		Circle circle2 = new Circle("Test circle", -10);
		assertEquals(0, roundToTwoDecimals(circle2.area()));
		Circle circle3 = new Circle("Test circle", 0);
		assertEquals(0, roundToTwoDecimals(circle3.area()));
		Circle circle4 = new Circle("Test circle", 123.45);
		assertEquals(47877.57, roundToTwoDecimals(circle4.area()));
	}
	
	@Test
	void testCirclePerimeter() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCircleToString() {
		fail("Not yet implemented");
	}
	
	@Test
	void testRhombusArea() {
		fail("Not yet implemented");
	}
	
	@Test
	void testRhombusPerimeter() {
		fail("Not yet implemented");
	}
	
	@Test
	void testRhombusToString() {
		fail("Not yet implemented");
	}
	
	@Test
	void testRightAngledTriangleArea() {
		fail("Not yet implemented");
	}
	
	@Test
	void testRightAngledTrianglePerimeter() {
		fail("Not yet implemented");
	}
	
	@Test
	void testRightAngledTriangleToString() {
		fail("Not yet implemented");
	}

	// Integration tests
	
	@Test
	void testArrayListOfShapes() {
		fail("Not yet implemented");
	}
}
