import java.io.*;
import java.util.Scanner;

public class problem1 {

	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);

		// Display message only
		System.out.print("Enter the year : ");

		// Reading integer input value
		int yearInput = scan.nextInt();

		System.out.print("Enter month : ");

		// Reading integer input value
		int monthInput = scan.nextInt();

		//logic for month
		do{
            System.out.println("wrong month value enter again");
            monthInput = scan.nextInt();
        }while(monthInput < 0 || monthInput > 12);
		

		int days = 1;
		int months = 1;
		int years = 1;
		int daysYears = 1;

		// Days and months
		String dayList[] = { "Robi", "Shom", "Mongol", "Budh","Brihospoti", "Shukro", "Shoni" };
		String monthList[]= { "BOISHAKH", "JOISHTHO", "ASHAR","SRABON", "BHADRO", "ASHWIN","KARTIK", "OGROHAYON", "POUSH", "MAGH", "FALGUN", "CHOITRO" };

		// Array for days in the bengali months
		int daysInMonths[] = { 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 30, 30 };

		//Looping through while the condition is true
		while (true) {

			if (days == 1 && months == monthInput && years == yearInput) {
				break;
			}

			if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {			
					daysInMonths[10] = 30;
			}

			else {
				daysInMonths[10] = 31;
			}
			daysYears++;
			days++;

			if (days > daysInMonths[months - 1]) {
				months++;
				days = 1;
			}

			if (months > 12) {
				months = 1;
				years++;
			}

			if (daysYears == 7) {
				daysYears = 0;
			}
		}

		int c = daysYears;

		if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {   //falgun is leapyear
			daysInMonths[10] = 30;
		}
		else {
			daysInMonths[10] = 31;
		}

		// Print the desired month of input year
		System.out.println("MONTH:" + monthList[monthInput - 1]);

		for (int k = 0; k < 7; k++) {
			System.out.print(" " + dayList[k]);
		}

		System.out.println();

		for (int j = 1; j <= (daysInMonths[monthInput - 1] + daysYears); j++) {
			if (j > 6) {
				daysYears = daysYears % 6;
			}
		}

		int spacing = daysYears;
		if (spacing < 0)
			spacing = 6;

		// Printing the calendar
		for (int i = 0; i < spacing; i++)
			System.out.print("	 ");
		for (int i = 1; i <= daysInMonths[monthInput - 1]; i++) {
			System.out.printf(" %3d ", i);

			if (((i + spacing) % 7 == 0)
				|| (i == daysInMonths[monthInput - 1]))
				System.out.println();
		}
	}
}
