package MethodCreate;

        /*
         * Homework:
         * Create a system that checks valid username and password
         * And if they both are valid then only system displays homepage
         * User can only try upto 5 times with invalid login details
         * if it reaches 5 times then system should be locked for 10 min
         */

import java.util.Scanner;

public class UserPW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Create Scanner variable/function

        String UM;
        String PW;


        System.out.println("Log in:");
        System.out.println("Username:");
        UM = input.nextLine();

        System.out.println("Password: ");
        PW = input.nextLine();

        String expectedUserNames = "yes";
        String expectedPassWords = "Yes";


        //users check = new users(username, password);
        for (int i = 0; i < 4; i++) {

            if (!UM.equals(expectedUserNames) || !PW.equals(expectedPassWords)) {
                int count = 4 - i;
                //console message to user to enter valid password
                System.out.println("Please enter the valid credentials");
                //console message to let user know how many more tries he has left with
                System.out.println("You have " + count + " more tries");
                System.out.println("Username: ");
                //letting user to update the actualPassword value with new input from console
                // UM = input.nextLine();
                UM = input.nextLine();

                System.out.println("Password: ");
                PW = input.nextLine();
                //if count equals to 4, then notifying user with custom message
                if (i == 3) {
                    System.out.println("You account will be locked for 10 minuets.");
                }
                // if any point in the loop user enters correct password then system let user into home page
            } else {
                System.out.println("You Have succesfully entered into your account");
                System.out.println("Welcome to Home Page");
                //this keyword will break the loop and continue with program
                break;
            }
        }

    }
}

