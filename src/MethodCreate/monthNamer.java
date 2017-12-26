package MethodCreate;

import java.util.Calendar;

public class monthNamer {


    public static void main(String[] args) {

        //int month = (Calendar.getInstance().get(Calendar.MONTH)) + 1;
        //System.out.println(month + " month of the year");
        System.out.println("***** The Current Season *****");
        System.out.println("It is the " + month1() + "th month of the year");
    }

    public static int month1() {
        String monthName2[] = {"Jan", "Feb", "March", "April", "May", "June", "July", "August", "Sept", "Oct", "Nov", "Dec"};
        int month = (Calendar.getInstance().get(Calendar.MONTH)) + 1;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter.  The month is " + monthName2[11]);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring.  The month is " + monthName2[11]);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer.  The month is " + monthName2[11]);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is fall.  The month is " + monthName2[11]);
                break;

            default:
                System.out.println("Something wrong");
                break;
        }
        return month;
    }
}



