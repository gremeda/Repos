/**
 *@author Abdulbasit Ali
 *email: gremeda@hotmail.com
 *date: 2021-05-21
 *purpose: The Adder Version 1 will just add two variables
 * and print the results to the screen.
 */
// AA
package aa.adder;

public class AdderVersion_1 {
    public static void main(String[] args){
        
    int sum=0; // declare sum and initialize it to 0
    // declare and initialize our operands
    int operand1 = -5;
    int operand2 = 7;

    //assign the sum of operand1 and operand2 to sum
    sum += operand1 + operand2;

    // In Java, we use
    // the plus (+) operator to concatentate (or glue together
    // string values.
    System.out.println("Sum is: " + sum);
    }
}