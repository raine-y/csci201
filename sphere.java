public class Sphere extends SolidCircularObject {

    // attribute(s)

    private double volume;
    private double surfaceArea;

    // constructor
    
    public Sphere(double radius) {
        super(radius);
    }

    // operations

    public double volume() {
        volume = (4.0/3.0) * pi() * Math.pow(radius(), 3);
        return volume;
    }

    public double surfaceArea() {
        surfaceArea = 4 * pi() * Math.pow(radius(), 2);
        return surfaceArea;
    }

    // toString() override

    public String toString() {
        return "[Sph] " + super.toString() + ", Vol.: " + volume() + ", Surf. Area: " + surfaceArea();
    }
}