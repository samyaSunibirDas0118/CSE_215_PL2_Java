import java.util.Scanner;

public class test{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a temperature and a wind speed
		System.out.println("Enter the temperature in Fahrenheit " +
			"between -58F and 41F: ");
		double temperature = input.nextDouble();

		if (temperature <= -58 || temperature >= 41)
		{
			System.out.println("Wrong condition must be within range");

        }

        else{
            System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
            double speed = input.nextDouble();
            if(speed<2)
                {
                    System.out.println("wrong");
                }
            else{
                double windChill = 35.74 + 0.6215 * temperature -
								 35.75 * Math.pow(speed, 0.16) +
								 0.4275 * temperature * Math.pow(speed, 0.16);
                System.out.println(windChill);
            }
        }
			
    }
}