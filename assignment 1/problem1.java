import java.util.Scanner;

public class problem1{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a temperature and a wind speed
		System.out.print("Enter the temperature in Fahrenheit " +
			"between -58F and 41F: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = input.nextDouble();

		if (temperature <= -58 || temperature >= 41 || speed < 2)
		{
			System.out.print("The ");
			if (temperature <= -58 || temperature >= 41)
				System.out.print("temperature ");
			if ((temperature <= -58 || temperature >= 41) && speed < 2)
				System.out.print("and ");
			if (speed < 2)
				System.out.print("wind speed ");
			System.out.println("is invalid");
			System.exit(1);
		}

		// Compute the wind chill index
		double windChill = 35.74 + 0.6215 * temperature -
								 35.75 * Math.pow(speed, 0.16) +
								 0.4275 * temperature * Math.pow(speed, 0.16);

		// Display result
		System.out.println("The wind chill index is " + windChill);
	}
}