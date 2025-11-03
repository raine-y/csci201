public class Bulb {
    private boolean isOn;

    // Constructor initializes the bulb to be off
    public Bulb() {
        isOn = false;
    }

    // Method to turn the bulb on
    public void turnOn() {
        isOn = true;
        System.out.println("The bulb is now ON.");
    }

    // Method to turn the bulb off
    public void turnOff() {
        isOn = false;
        System.out.println("The bulb is now OFF.");
    }

    // Method to check if the bulb is on
    public boolean isBulbOn() {
        return isOn;
    }
}