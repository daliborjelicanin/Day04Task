package task02;

public class Rectangle {

	private double sideA;
	private double sideB;

	public Rectangle() {
	}

	public Rectangle(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public double calculateVolume(double sideA, double sideB) {
		return sideA * 2 + sideB * 2;
	}

	public double calculateSurfaceArea(double sideA, double sideB) {
		return sideA * sideB;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	@Override
	public String toString() {
		return "Rectangle \t" + sideA + ", " + sideB + "\t\t" + calculateVolume(sideA, sideB) + "\t\t" + calculateSurfaceArea(sideA, sideB);
	}

}
