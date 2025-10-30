public class Cylinder {
    final static double PI = Math.PI;
    private double r; // instance attribute for radius
    private double h; // instance attribute for height

    public Cylinder(double radius, double height) {
        r = radius;
        h = height;
    }

    public double radius() {
        return r;
    }

    public double height() {
        return h;
    }

    public double surfaceArea() {
        double s = 2.0 * PI * r * (r + h);
        return s;
    }

    public double volume() {
        double v = PI * Math.pow(r, 2) * h;
        return v;
    }
}