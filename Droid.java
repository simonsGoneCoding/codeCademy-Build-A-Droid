public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I’m the droid: " + name;
    }

    public void checkBattery() {
        System.out.print(batteryLevel);
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public static void main(String[] args) {

        Droid codey = new Droid("Codey");

        System.out.print(codey.toString());
        codey.performTask("hoovering");
        codey.checkBattery();
    }
}