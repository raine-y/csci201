public class SolidCircularObject {
 
    // attribute(s)

    private final double PI = Math.PI;
    private double radius;

    // getter(s) 

    public double pi() {
        return PI;
    }

    public double radius() {
        return radius;
    }

    //constructor

    public SolidCircularObject(double radius) {
        this.radius = radius;
    }

    // toString() override

    public String toString() {
        return "Rad.: " + radius();
    }

}