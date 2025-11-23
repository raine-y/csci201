public class Cylinder extends SolidCircularObject {
    
    // attributes 

    private double volume;
    private double surfaceArea;
    
    // constructor

    public Cylinder(double radius, double height) {
        super(radius, height);

    }

    // operations

    public double volume() {
        volume = pi() * Math.pow(radius(), 2) * height();
        return volume;
    }

     public double surfaceArea() {
        double base, top, lateral;
        top = base = pi() * Math.pow(radius(), 2);
        lateral = 2 * pi() * radius() * height();
        surfaceArea = base + top + lateral;
        return surfaceArea;
    }

    // toString() override

    public String toString() {
        return "[Cyl] " + "Rad.: " + radius() + ", Hei:" + height() + ", Vol.: " + volume() + ", S. Area: " + surfaceArea();
    }
}