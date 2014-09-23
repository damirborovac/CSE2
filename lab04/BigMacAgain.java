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
       answerWrong = myScanner.next();
       
       if((nBigMacs <=0) && (!answerWrong.equals.next()));{ {
       System.out.println("The value you entered is not an integer > 0."); // If input different from 0, display error message.
               return;
              
        else{
            System.out.println("You ordered " +nBigMacs+" Big Macs for a cost of "+nBigMacs+ "x2.22 = " +(nBigMacs*2.22)+ " $.");//display cost of big macs
            if(nBigMacs > 0){
                System.out.print(" Do you want an order of fries (Y/y/N/n)?:"); // does the user want fries?
                String answer = myScanner.next();
       
            if(answer.equalsIgnoreCase("Y")){          // if yes, add $2.15 to the meal cost.
                 System.out.println("You ordered fries at a cost of $2.15");
                 System.out.println("The total cost of the meal is:" + ((nBigMacs*2.22)+2.15)+ "$");
       }    
            else if(answer.equalsIgnoreCase("N")){ // if not, just compute cost without the fries. 
                 System.out.println("The total cost of the meal is:" +(nBigMacs*2.22)+"$");
               
            }
            else if((!answer.equalsIgnoreCase("Y"))||(!answer.equalsIgnoreCase("N"))){ // display error message
                 System.out.println("Sorry,You did not enter one of 'y', 'Y', 'N', 'n'"); // if fries input different from Y/y or N/n.
                         
                     return;
            }
                }
               }
            }
          }
       }
    }
}    