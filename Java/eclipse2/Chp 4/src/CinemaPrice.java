	/* Program Name: CinemaPrice.java
	//
	// Author : Wyatt Colyn
	// Date Written : Feb 12, 2018
	//
	//  Brief Description:
	//  Displays cinema ticket price for a random age value
	*/  
import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;

public class CinemaPrice
{
	public static void main(String[] args)
	{
		int age = 0;
		double price = 0.0;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		NumberFormat nFmt = NumberFormat.getCurrencyInstance();
		
		System.out.print( "Please enter the cinema ticket price: ");
	   price = scan.nextDouble();
	   
	   age = generator.nextInt(101) +1;
	   System.out.println("Your age: " + age);

		if(age <= 5) {
			
			price = 0.0;
			System.out.println("Your ticket price is " + nFmt.format(price) + " which is free.");
			
		} else if (age >=5 && age <= 12) {
			
			price /= 2;
			System.out.println("You pay half the ticket price which is " + nFmt.format(price));
			
		} else if (age >12 && age <= 54) {
			
			price = price;
			System.out.println("Your ticket price is " + nFmt.format(price) + " which is full price");
			
		} else {
			price = 0.0;
			System.out.println("Your ticket price is " + nFmt.format(price) + " which is free.");
		}
			}
		
	}

/*Output 1:
 * Please enter the cinema ticket price: 88.88
	Your age: 51
	Your ticket price is $88.88 which is full price
  */
