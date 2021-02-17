package task02;

public class Square {

	private double side;

	public Square() {
	}

	public Square(double side) {
		this.side = side;
	}

	public double calculateVolume(double side) {
		return side * 4;
	}

	public double calculateSurfaceArea(double side) {
		return side * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square \t\t" + side + "\t\t\t" + calculateVolume(side) + "\t\t" + calculateSurfaceArea(side);
	}

}
