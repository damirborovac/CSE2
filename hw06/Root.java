// Damir Borovac HW #06
// Roulette Java Program
// Due 10/14/14
//
// This program uses the bisection algorithm method for computing the
// square root of a given double. The user will be prompted to enter 
// the double and the program will use the bisection method until the
// "tolerance" of 0.0000001 is reached. It also only accepts positive
// doubles. Enjoy !
//
//////////////////////////////////////////////////////////////////////

import java.util.Scanner; // enabling scanner method

public class Root{
    // defining main method
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); // enables user input
        System.out.print("Please enter a positive double: " ); // prompts user for input
        double x = input.nextDouble(); // the program obtains the inputed value
        
        if(x < 0){ // in case the user inputs a negative double, print error message
            System.out.println("You did not enter a positive double.");
            return;
        }
        double middle =0.0; // setting middle, low and high as variables 
        double low = 0.0;
        double high = (1.0+x); // high is 1 plus the input value 
        double sqrdMiddle = 0.0; 
        int count = 0; // initialize counter as variable
                    
       while(count<100){ // while loop beginning
            middle = (low+high)/2.0; // set new middle value 
            sqrdMiddle = (middle*middle); // square the new middle value
            
            if(sqrdMiddle > x){ // if the halved number is greater than the input
            high = middle;      // then set high as middle.
            }
            else{               // otherwise set low as the new middle value. 
            low = middle;
            } 
            if((high-low) < 0.0000001*(1+x)){ // when the "tolerance" is reached,
            break;                            // exit the program
            }
            count ++;           // increment counter 
        }
        System.out.println("The square root of "+x+ " is: " +middle );
        } // printing the square root value at the end 
    } // end of program
    
    
    
    
    