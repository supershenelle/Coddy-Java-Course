public class SmartThermostat {
    private double currentTemp;
    private double targetTemp;
    private boolean isOn;

    public SmartThermostat() {
        this.currentTemp = 70.0;
        this.targetTemp = 70.0;
        this.isOn = false;
    }

    public SmartThermostat(double currentTemp, double targetTemp) {
        this.currentTemp = currentTemp;
        this.targetTemp = targetTemp;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void increaseTemp(double amount) {
        this.targetTemp += amount;
    }

    public void decreaseTemp(double amount) {
        this.targetTemp -= amount;
    }

    public String getOn() {
        if (isOn)
            return "ON";

        else
            return "OFF";
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public double getTargetTemp() {
        return targetTemp;
    }

    public void displayStatus() {
        System.out.println("STATUS: " + getOn() + " | Current Temp: " + getCurrentTemp() + " | Target Temp: " + getTargetTemp());
    }
}