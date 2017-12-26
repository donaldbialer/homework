package MethodCreate;

import java.util.Scanner;

/**
 * Build a gorcery budget system using while loop
 * User can purchase as many item he wishes within the budget limit of $100.00
 * IF the purchased amount exceeds the budget amount, notify the user with appropriate message
 * you must spend all of budget amount
 * Make sure to test your code and avoid possible bugs.
 */


public class GroceryScanner {


    public static void main(String[] args) {

        // Set up grocery cart of 100
        double groceryCapacity = 100.00;
        double priceItem;
        //int end = 0;
        //Instance of scanner
        Scanner thePrice = new Scanner(System.in);  //setting up scanner function
        System.out.println("Please enter the amount of grocery item: ");

        while (groceryCapacity > 0) {
            //System.out.println("You have $ " + groceryCapacity + ".  Please enter price.");
            priceItem = thePrice.nextDouble();

            if (priceItem > 0) {

                //groceryCapacity = groceryCapacity - priceItem;

                if (groceryCapacity >= priceItem) {
                    groceryCapacity = groceryCapacity - priceItem;


                    if (groceryCapacity == 0) {
                        System.out.println("You have spent your budget.  Enjoy your food.");
                        break;
                    } else {
                        System.out.println("You have $ " + groceryCapacity + ".  Please enter price.");
                    }

                } else {
                    System.out.println("You are over budget. Please enter an amount under or equal to " + groceryCapacity);
                    //priceItem = thePrice.nextDouble();
                }
            } else {
                System.out.println("Not a valid entry.  Please enter an amount under or equal to " + groceryCapacity);
            }
        }
    }
}



