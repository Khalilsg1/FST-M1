package Activities;

public class Activity3 {

	public static String adjustDevice(String device, int value) {

        String status = switch (device) {

            case "THERMOSTAT" -> {
                if (value >= 40) {
                    yield "[Thermostat] Warning: Temperature high.";
                } else {
                    yield "[Thermostat] Temperature is set to " + value + ".";
                }
            }

            case "LIGHT" -> "[Light] Adjusting brightness to " + value + "%.";

            case null -> "[Error] No device provided.";

            default -> "[Error] Unknown device: " + device + ".";

        };

        return status;
    }

    public static void main(String[] args) {

        // Test THERMOSTAT above 40
        System.out.println(adjustDevice("THERMOSTAT", 45));

        // Test THERMOSTAT under 40
        System.out.println(adjustDevice("THERMOSTAT", 22));

        // Test LIGHT
        System.out.println(adjustDevice("LIGHT", 75));

        // Test null
        System.out.println(adjustDevice(null, 0));

        // Test unknown device
        System.out.println(adjustDevice("FAN", 3));
	}

}
