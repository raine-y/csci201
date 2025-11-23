public class SolidCircularObject {
 
    // attribute(s)

    private final double PI = Math.PI;
    private double radius;
    private double height;

    // getter(s) 

    public double pi() {
        return PI;
    }

    public double radius() {
        return radius;
    }

    public double height() {
        return height;
    }

    //constructor

    public SolidCircularObject(double radius) {
        this.radius = radius;
    }

    public SolidCircularObject(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // operations

    //...

}