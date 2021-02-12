/*
 * MIT java assignment  
 * Gravity calculator 
 * Compute the position of an object after falling for 
 * 10 seconds,outputting the position in meters. 
 * 
 *  x(t) = 0.5 × at(power two)+ vit + xi
 *  Variable      Meaning                    Value
 *  a             Acceleration(m/s square)   -9.81
 *  t             Time (s)                    10
 *  vi            Initial velocity            0
 *  xi            Initial position            0 
 */
package javacode;

public class GravityCalculator {

    public static void main(String[] args) {
       
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        System.out.println("\n (____Gravity calculator___)\n");
        System.out.println(" Gravity=-9.81 ");
        System.out.println(" Initial velocity of object " +initialVelocity);
        System.out.println(" Falling time of object " +fallingTime);
        System.out.println(" Initial position of object " +initialPosition);
        double finalPosition = 0.5*(-9.81)*10.0*10.0+0.0*10.0+0.0; 
         System.out.println(+ finalPosition + " m ");

    }
 
}   
