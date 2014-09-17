// Damir Borovac
// HW #03 - Program #3
// Four Digits Java Program
// 
// This program allows the user to input a double with 4 decimal places and 
// outputs the decimal part (even if it is 0045 for example, it will print the zeros)
// as an integer in the same sequence as it was entered. Enjoy ! 
// 
///////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class FourDigits {
    //main method
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);  // Enables user input. 
             
        System.out.print("Enter a double and I will display the four digits the right of the decimal point:  ");  // Asks the user for input. 
        
        double input = myScanner.nextDouble(); // makes the input a double 
        int inputInt = (int) input; // converts the input to an integer
        double inputNo1 = input - inputInt; // subtracts input from converted value 
        int inputNo2 = (int)(inputNo1*10000); // turns the decimal points into an integer
        
        int digit4 = (inputNo2/1)%10; // separating the fourth digit
        int digit3= (inputNo2/10)%10; // separating the third digit
        int digit2= (inputNo2/100)%10; // separating the second digit
        int digit1= (inputNo2/1000)%10; // separating the first digit
        
        System.out.println(" The four digits are : " + digit1 + digit2 + digit3 + digit4); // printing the desired output/decimal digits
        
            }
} // end of main method