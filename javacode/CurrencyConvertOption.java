
package javacode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConvertOption {

    public static void main(String[] args) {

        double euro_convert, inr_convert;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner input = new Scanner(System.in);

        // Choose the money converstion option
        System.out.println("1\t INR to Euro");
        System.out.println("2\t Euro to INR");
        int menu = input.nextInt();
        System.out.println("Enter the amount you want to convert");
        float amount = input.nextFloat();

        // Series of execution path
        switch (menu) {

        case 1:
            euro_convert = amount / 88.40;
            System.out.println(+amount + " Indian rupee equals " + f.format(euro_convert) + " Euro");
            // break statement missing 
        case 2:
            inr_convert = amount * 88.40;
            System.out.println(+amount + " Euro " + f.format(inr_convert) + " INR");
            break;         
        default:
            System.out.println("Invalid, you have only 2 options to switch");
            break;
        }
        if (amount <= 0) {
            System.out.print("Sorry.zero? ");
        }
    }
}
