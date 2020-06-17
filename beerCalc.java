/* Kevin Ramos
 * COP3330
 * HW2: Beer Assignment
 * This program calculates the cost of 
 * and potential weight gain due to beer in a year
*/

package BeerCalc;

import java.util.Scanner;

public class beerCalc {

	public static void main(String[] args) {
		
		Scanner beerInfo = new Scanner(System.in);
		
		double dailyBeers, calTotal, beerTotal;
		double weightGain, beerExpense, beerCost;
		double beerCal = 150;
		
		System.out.println("On average, how many beers will you consume each day?");
		dailyBeers = beerInfo.nextDouble();
		
		System.out.println("On average, how much will you pay for each can of beer?");
		beerCost = beerInfo.nextDouble();
		
		// Calculate beers consumed in a year.
		beerTotal = dailyBeers * 365;
		
		// Output total beers consumed over the year.
		System.out.printf("This is approximately %.2f beers over the course of the year.\n", +beerTotal);
		
		// Calculate calorie intake due to beer alone and corresponding weight gain
		calTotal = beerTotal * beerCal;
		weightGain = calTotal/3500.00;
		
		// Output calories consumed and corresponding weight gain
		System.out.printf("In one year you'll consume %.2f calories due to beer alone.\n", +calTotal);
		System.out.printf("Without a change in diet or exercise, you will gain %.2f pounds from drinking that much beer this year.\n", +weightGain);
		
		// Calculate cost of beer over a year
		beerExpense = beerTotal * beerCost; 
		System.out.printf("You will pay $%.2f for beer this year.", +beerExpense);	
	}

}
