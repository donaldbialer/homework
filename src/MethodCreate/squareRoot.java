package MethodCreate;

import static java.lang.Math.max;

//Create a method always returns a sqrt of any number which is passed on to method
public class squareRoot {
    public static void main(String[] args) {

        //parameter/arg to be passed
        //double x = getSqu(20);  //arguement.function is created
        double getSqu = getSqu(9);

    }
    public static double getSqu(double x){ //getSqu is the method
        double squ1 = Math.sqrt(x);//Method call
        System.out.println(squ1);
        return squ1;
    }
}
