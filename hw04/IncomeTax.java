// Damir Borovac HW #04
// Income Tax Java Program
// Due 9/23/14
//
// This program takes an integer as the input representing the number of 
// thousands of dollars of income and outputs the income, tax rate on the 
// given input as well as the total tax for that particular amount. Enjoy!
//
//////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
// defining main method
public class IncomeTax {
    
    public static void main(String[] args){
        
        
        Scanner myScanner; 
        myScanner = new Scanner (System.in); // Enables user input.
        
        System.out.print("Enter an int giving the number of thousands: "); // prompts for user input
        
        int nThousands = 0; // assigning variable for number of thousands of dollars
        
        if(myScanner.hasNextInt()){
        nThousands = myScanner.nextInt(); //checking that the input is an integer
        
        }
        else{
            System.out.println(" You did not enter an integer. "); // Error message if input 
            return;                                                 // different from an integer.
        }
       if(nThousands < 0){ 
            System.out.println(" You did not enter a positive integer. "); // Error message if not a 
           return;                                                    // positive integer.
       }
       else{
       }
         if(nThousands<20){ // if income is less than $20k
            double temp = nThousands*1000*.05;
         temp = temp/100;
         temp = (double)((int)temp); // rounding the tax amount to a double
         temp = temp*100;
         
         System.out.println("The tax rate on $"+nThousands+",000 is 5% and the tax is: $" +temp );
         return;
       }
         else if(nThousands>=20 && nThousands<40){ // income between $20k and $40k
            double temp1 = nThousands*1000*.07;
         temp1 = temp1/100;
         temp1 = (double)((int)temp1); // rounding the tax amount to a double 
         temp1 = temp1*100;
             
            System.out.println("The tax rate on $"+nThousands+",000 is 7% and the tax is: $" +temp1);
            return;
         }
        else if(nThousands>=40 && nThousands <78){ // income between $40k and $78k
              double temp2 = nThousands*1000*.12;
        temp2 = temp2/100;
        temp2 = (double)((int)temp2); // rounding the tax amount to a double 
        temp2 = temp2*100;
            System.out.println("The tax rate on $"+nThousands+",000 is 12% and the tax is: $" +temp2);
            return;
       }
        else if (nThousands>=78){
           double temp3 = nThousands*1000*.14;
        temp3 = temp3/100;
        temp3 = (double)((int)temp3); // rounding the tax amount to a double 
        temp3 = temp3*100;
            System.out.println("The tax rate on $" +nThousands+",000 is 14% and the tax is: $" +temp3);
            return;
                     }
        }
      } // end of program 