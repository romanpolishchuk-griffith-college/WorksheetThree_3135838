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
		Circle circle = new Circle("Test circle", 10);
		assertEquals(62.83, roundToTwoDecimals(circle.perimeter()));
		Circle circle2 = new Circle("Test circle", -10);
		assertEquals(0, roundToTwoDecimals(circle2.perimeter()));
		Circle circle3 = new Circle("Test circle", 0);
		assertEquals(0, roundToTwoDecimals(circle3.perimeter()));
		Circle circle4 = new Circle("Test circle", 123.45);
		assertEquals(775.66, roundToTwoDecimals(circle4.perimeter()));
	}
	
	@Test
	void testCircleToString() {
		Circle circle = new Circle("Test circle 1", 10);
		assertEquals("Circle has name: Test circle 1, and radius 10.0", circle.toString());
		Circle circle2 = new Circle("Test circle 2", -10);
		assertEquals("Circle has name: Test circle 2, and radius -10.0", circle2.toString());
		Circle circle3 = new Circle("Test circle 3", 0);
		assertEquals("Circle has name: Test circle 3, and radius 0.0", circle3.toString());
		Circle circle4 = new Circle("Test circle 4", 123.45);
		assertEquals("Circle has name: Test circle 4, and radius 123.45", circle4.toString());
	}
	
	@Test
	void testRhombusArea() {
		Rhombus rhombus = new Rhombus("Test rhombus", 2, 3, 4, 5, 6, 10);
		assertEquals(3, roundToTwoDecimals(rhombus.area()));
		Rhombus rhombus2 = new Rhombus("Test rhombus", 5, 6, 7, 8, 9, 20);
		assertEquals(15, roundToTwoDecimals(rhombus2.area()));
		Rhombus rhombus3 = new Rhombus("Test rhombus", -5, -6, -7, -8, -9, -20);
		assertEquals(0, roundToTwoDecimals(rhombus3.area()));
	}
	
	@Test
	void testRhombusPerimeter() {
		Rhombus rhombus = new Rhombus("Test rhombus", 2, 3, 4, 5, 6, 10);
		assertEquals(25, roundToTwoDecimals(rhombus.perimeter()));
		Rhombus rhombus2 = new Rhombus("Test rhombus", 5, 6, 7, 8, 9, 20);
		assertEquals(44, roundToTwoDecimals(rhombus2.perimeter()));
		Rhombus rhombus3 = new Rhombus("Test rhombus", -5, -6, -7, -8, -9, -20);
		assertEquals(0, roundToTwoDecimals(rhombus3.perimeter()));
	}
	
	@Test
	void testRhombusToString() {
		Rhombus rhombus = new Rhombus("Test rhombus 1", 2, 3, 4, 5, 6, 10);
		assertEquals(
				"Rhombus has name: Test rhombus 1, and firstDiagonal: 2.0, secondDiagonal: 3.0, firstSide: 4.0, secondSide: 5.0, thirdSide: 6.0, fourthSide: 10.0"
				, rhombus.toString());
		Rhombus rhombus2 = new Rhombus("Test rhombus 2", 5, 6, 7, 8, 9, 20);
		assertEquals(
				"Rhombus has name: Test rhombus 2, and firstDiagonal: 5.0, secondDiagonal: 6.0, firstSide: 7.0, secondSide: 8.0, thirdSide: 9.0, fourthSide: 20.0"
				, rhombus2.toString());
		Rhombus rhombus3 = new Rhombus("Test rhombus 3", -5, -6, -7, -8, -9, -20);
		assertEquals(
				"Rhombus has name: Test rhombus 3, and firstDiagonal: -5.0, secondDiagonal: -6.0, firstSide: -7.0, secondSide: -8.0, thirdSide: -9.0, fourthSide: -20.0"
				, rhombus3.toString());
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
