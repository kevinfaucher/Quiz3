package Quiz3;

import Quiz3.TriangleException;

import java.lang.Math;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// returns side 1
	public double getSide1() {
		return side1;
	}
	// returns side 2

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	// returns side 3

	public double getArea() {
		double s = this.getPerimeter() / 2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}

	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}

	public void acceptableTriangle() throws TriangleException {
		double area = this.getArea();
		if (area > 0) {
			Double.toString(getArea());
		} else {
			throw new TriangleException(area);
		}
	}

	// returns str of results
	public String toString() {
		double area = this.getArea();
		double perimeter = this.getPerimeter();
		return ("The Area of the Triangle is: " + String.valueOf(area) + "\nThe Perimeter of the Triangle is: "
				+ String.valueOf(perimeter));
	}

}