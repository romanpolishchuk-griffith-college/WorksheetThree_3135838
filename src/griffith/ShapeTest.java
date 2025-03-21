package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

class ShapeTest {

	double roundToTwoDecimals(double num) {
		return Math.round(num * 100.0) / 100.0;
	}
	
	//Unit tests
	
	//Test circle area method
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
	
	//Test circle perimeter method
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
	
	//Test circle toString method
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
	
	//Test rhombus area method
	@Test
	void testRhombusArea() {
		Rhombus rhombus = new Rhombus("Test rhombus", 2, 3, 4, 5, 6, 10);
		assertEquals(3, roundToTwoDecimals(rhombus.area()));
		Rhombus rhombus2 = new Rhombus("Test rhombus", 5, 6, 7, 8, 9, 20);
		assertEquals(15, roundToTwoDecimals(rhombus2.area()));
		Rhombus rhombus3 = new Rhombus("Test rhombus", -5, -6, -7, -8, -9, -20);
		assertEquals(0, roundToTwoDecimals(rhombus3.area()));
	}
	
	//Test rhombus perimeter method
	@Test
	void testRhombusPerimeter() {
		Rhombus rhombus = new Rhombus("Test rhombus", 2, 3, 4, 5, 6, 10);
		assertEquals(25, roundToTwoDecimals(rhombus.perimeter()));
		Rhombus rhombus2 = new Rhombus("Test rhombus", 5, 6, 7, 8, 9, 20);
		assertEquals(44, roundToTwoDecimals(rhombus2.perimeter()));
		Rhombus rhombus3 = new Rhombus("Test rhombus", -5, -6, -7, -8, -9, -20);
		assertEquals(0, roundToTwoDecimals(rhombus3.perimeter()));
	}
	
	//Test rhombus toString method
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
	
	//Test right angled triangle area method
	@Test
	void testRightAngledTriangleArea() {
		RightAngledTriangle rightAngledTriangle = new RightAngledTriangle("Test triangle", 5, 10, 15);
		assertEquals(25, roundToTwoDecimals(rightAngledTriangle.area()));
		RightAngledTriangle rightAngledTriangle2 = new RightAngledTriangle("Test triangle", 2, 3, 4);
		assertEquals(3, roundToTwoDecimals(rightAngledTriangle2.area()));
		RightAngledTriangle rightAngledTriangle3 = new RightAngledTriangle("Test triangle", -5, -10, -15);
		assertEquals(0, roundToTwoDecimals(rightAngledTriangle3.area()));
	}
	
	//Test right angled triangle perimeter method
	@Test
	void testRightAngledTrianglePerimeter() {
		RightAngledTriangle rightAngledTriangle = new RightAngledTriangle("Test triangle", 5, 10, 15);
		assertEquals(30, roundToTwoDecimals(rightAngledTriangle.perimeter()));
		RightAngledTriangle rightAngledTriangle2 = new RightAngledTriangle("Test triangle", 2, 3, 4);
		assertEquals(9, roundToTwoDecimals(rightAngledTriangle2.perimeter()));
		RightAngledTriangle rightAngledTriangle3 = new RightAngledTriangle("Test triangle", -5, -10, -15);
		assertEquals(0, roundToTwoDecimals(rightAngledTriangle3.perimeter()));
	}
	
	//Test right angled triangle toString method
	@Test
	void testRightAngledTriangleToString() {
		RightAngledTriangle rightAngledTriangle = new RightAngledTriangle("Test triangle 1", 5, 10, 15);
		assertEquals("Right Angled Triangle has name: Test triangle 1, and firstSide: 5.0, secondSide: 10.0, hypothenuse: 15.0", rightAngledTriangle.toString());
		RightAngledTriangle rightAngledTriangle2 = new RightAngledTriangle("Test triangle 2", 2, 3, 4);
		assertEquals("Right Angled Triangle has name: Test triangle 2, and firstSide: 2.0, secondSide: 3.0, hypothenuse: 4.0", rightAngledTriangle2.toString());
		RightAngledTriangle rightAngledTriangle3 = new RightAngledTriangle("Test triangle 3", -5, -10, -15);
		assertEquals("Right Angled Triangle has name: Test triangle 3, and firstSide: -5.0, secondSide: -10.0, hypothenuse: -15.0", rightAngledTriangle3.toString());
	}

	// Integration tests
	
	@Test
	void testArrayListOfShapes() {
		//List of correct areas and perimetes for testing
		double[][] correctAnswers = {
				{78.54, 31.42}, {0, 0},
				{9, 53}, {1134, 97},
				{0, 0}, {1, 6}
		};
		
		//Create list of 2 of each shapes
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle("Circle 1", 5));
		shapes.add(new Circle("Circle 2", -3));
		
		shapes.add(new Rhombus("Rhombus 1", 3, 6, 9, 12, 15, 17));
		shapes.add(new Rhombus("Rhombus 2", 54, 42, 32, 27, 21, 17));
		
		shapes.add(new RightAngledTriangle("Right Angled Triangle 1", -3, -5, -7));
		shapes.add(new RightAngledTriangle("Right Angled Triangle 2", 1, 2, 3));
		
		//Loop over all shapes and check result with correctAnswerArray
		for(int i = 0; i < shapes.size(); i++) {
			assertEquals(correctAnswers[i][0], roundToTwoDecimals(shapes.get(i).area()));
			assertEquals(correctAnswers[i][1], roundToTwoDecimals(shapes.get(i).perimeter()));
		}
	}
}
