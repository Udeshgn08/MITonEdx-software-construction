package javacode;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        // A text scanner parse primitive types and strings  
        Scanner input = new Scanner(System.in); // 
        System.out.println("Verify age?");
        // Return int value scanned from the input 
        int verifyage = input.nextInt(); 
        System.out.println("Age " +verifyage);
        
        /*
         * Verifies age condition of a person 
         * And display a message based on the priority 
         */
        if((verifyage==18) && (verifyage>18))
            System.out.println("Logged in, success!");
            if((verifyage!=18) || (verifyage<18))
            System.out.println("You cannot login"); 
        

    }

}
