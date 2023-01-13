/**
 * Chapter 1 Exercise 11:
 *      (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *          - One birth every 7 seconds
 *          - One death every 13 seconds
 *          - One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years.
 *      Assume the current population is 312,032,486 and one year has 365 days.
 *
 * Created by Luiz Arantes Sa on 8/23/14.
 */
public class problem2 {

    public static void main (String [] args) {
        //Store current population
        double intPop = 167288486;
 
        // Store 365 days in seconds
        double SecondsInYear = 31536000;
 
        //Number of births per year
        double birthsPerYear = SecondsInYear / 60;
         
        //Number of deaths per year
        double deathsPerYear = SecondsInYear / 120;
         
        //Immigration per year
        double immigrantsPerYear = SecondsInYear / 480;
         
        //Rate of population change per year
        double changePerYear = birthsPerYear - deathsPerYear - immigrantsPerYear;
         
        System.out.println("After 1st year: " + (int)(intPop + (1 * changePerYear)));
        System.out.println("After 2nd year:  " + (int)(intPop + (2 * changePerYear)));
        System.out.println("After 3rd year:  " + (int)(intPop + (3 * changePerYear)));
        System.out.println("After 4th year:  " + (int)(intPop + (4 * changePerYear)));
        System.out.println("After 5th year:  " + (int)(intPop + (5 * changePerYear)));
    }


    }
