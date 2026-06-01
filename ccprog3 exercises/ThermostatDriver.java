public class ThermostatDriver {
        public static void main (String[] args) {
            SmartThermostat thermostat = new SmartThermostat(68.0, 72.0);
            thermostat.displayStatus();
            thermostat.turnOn();
            thermostat.increaseTemp(3.5);
            thermostat.displayStatus();
            thermostat.decreaseTemp(1.5);
            thermostat.turnOff();
            thermostat.displayStatus();
        }
    }
