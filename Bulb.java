public class Bulb {
    private boolean isOn;

    public boolean isBulbOn() {
        System.out.println("This bulb is currently " + (isOn ? "ON" : "OFF") + ".");
        return isOn;
    }

    // Constructor initializes the bulb to be off
    public Bulb() {
        isOn = false;
    }

    // Method to turn the bulb on
    public void turnOn() {
        isOn = true;
        System.out.println("This bulb is now ON.");
    }

    // Method to turn the bulb off
    public void turnOff() {
        isOn = false;
        System.out.println("This bulb is now OFF.");
    }
}