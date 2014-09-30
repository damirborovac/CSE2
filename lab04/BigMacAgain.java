// Damir Borovac 
// Lab # 04
// The Big Mac Again Java Program
//
// This program let's the user input an integer > 0 for the number of Big Macs 
// he/she wants to purchase and displays an error message if otherwise. Then,
// if the input is OK, the user is asked whether he wants fries in addition to
// the Big Macs, letting the user type Y, y, n or N, and the program prints an 
// error message if something else was typed. Hence, it prints out the cost of 
// the total meal cost. Enjoy! 
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class BigMacAgain { // defining main method
    
    public static void main(String [] args){
        
    Scanner myScanner;
    myScanner = new Scanner (System.in); // Enables user input.

       
    System.out.print("Please enter the number of Big Macs you wish to purchase (integer > 0): "); // User input.
    int nBigMacs = 0;
  
    if(myScanner.hasNextInt()){
       nBigMacs = myScanner.nextInt();
       
       if( nBigMacs <= 0 || (!nBigMacs.hasNextInt()) ){
       System.out.println("The value you entered is not an integer > 0."); // If input different from 0, display error message.
               return;
       }
        else{
            System.out.println("You ordered " +nBigMacs+" Big Macs for a cost of "+nBigMacs+ "x2.22 = $" +(nBigMacs*2.22)+ ".");//display cost of big macs
        }
            System.out.print(" Do you want an order of fries (Y/y/N/n)?:"); // does the user want fries?
            String answer = myScanner.next();
            char fries = answer.charAt(0);
            
            switch(fries){
                case 'y': case 'Y':
                    System.out.println(" You ordered fries at a cost of $2.15.");
                    System.out.println("The total cost of the meal is" +((nBigMacs*2.22)+2.15));
                    break;
                case 'n': case 'N':
                    System.out.println("The total cost of the meal is: " +(nBigMacs*2.22));
                    break;
                default:
                    System.out.println("You did not enter y/Y nor n/N.");
                    break;
            }
         }
  }
}