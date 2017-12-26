package method;

import java.util.Scanner;

//Create a simple calculator which allows user to add, subtract, multiply
// and divide any two numbers and prints the results
public class calculator {

    public static void main(String[] args) {
        double n1, n2;  //Decimal values for the
        String operation;  //The premise for calculating(+/-/*//)
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter first number"); //Enter a value
        n1 = scannerObject. nextDouble();

        System.out.println("Enter second number");  //Enter a value
        n2 = scannerObject. nextDouble();

        Scanner op = new Scanner(System.in);  //Calculator functions
        System.out.println("Enter your operation");  //Enter calculator functions
        operation = op.next();

        //switch feature to do the calculations
        switch (operation)  {
            case "+":
                System.out.println("Your answer is " + (n1 + n2));
                break;

            case "-":
                System.out.println("Your answer is " + (n1 - n2));
                break;

            case "/":
                System.out.println("Your answer is " + (n1 / n2));
                break;

            case "*":
                System.out.println("Your asnwer is " + (n1 * n2));
                break;

            default:
                System.out.println("Enter a correct value");

        }
    }
}
