public class SphereObj {
	final static double PI = Math.PI;
	private double r; // instance attribute

	public SphereObj(double radius) {
		r = radius;
	}

	public double radius() {
		return r;
	}

	public double surfaceArea() {
		double s = 4.0 * PI * Math.pow(r, 2);
		return s;
	}

	public double volume() {
		double v = (4.0 / 3.0) * PI * Math.pow(r, 3);
		return v;
	}

}