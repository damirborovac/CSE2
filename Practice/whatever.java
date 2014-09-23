// Damir Borovac HW #04
// Time Padding Java Program
// Due 9/23/14
//
// This program allows the user to input the number of seconds that have passed
// in the day and will output the time as a result, making sure not to omit 
// the 'padded' zeros. Enjoy!
//
//////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;
// defining main method
    public class whatever{
    
       public static void main(String [] args){
        
           Scanner myScanner;
           myScanner = new Scanner(System.in); // Enables user input.
        
           System.out.print("Enter an integer of seconds: "); // Prompts user to enter number of seconds
            int seconds = 0; // assigning variables for seconds
            int timeHrs = 0; // hours
            int minutes = 0; // and minutes
        
            if(myScanner.hasNextInt()){ // making sure it is an integer
        
            seconds=myScanner.nextInt();
            timeHrs = seconds/3600; // amount of hours as an integer
            minutes = (seconds%3600)/60; // converting remainder from step above to minutes
            seconds = seconds % 60; // assigning remainder to seconds
            }
            else {
                System.out.println("The number you entered is not an integer."); // error message 
                return;                                                         // if input not integer
            }
        if(seconds < 10 && minutes < 10){  // add zero when seconds and minutes are less than 10
            System.out.println(" The time is: " +timeHrs+":0"+minutes+":0"+seconds);
            return;
        }
        else if(seconds >= 10 && minutes <10){  // add zero to minutes when less than 10
             System.out.println(" The time is: " +timeHrs+":0"+minutes+":"+seconds);
             return;
        }
        else if(seconds<10 && minutes >= 10){ // add 0 to seconds when seconds less than 10
             System.out.println(" The time is: " +timeHrs+":"+minutes+":0"+seconds);
             return;
        }
        else if(seconds>=10 && minutes >= 10){ // don't add zeros if seconds and minutes are greater than 10
            System.out.println(" The time is: " +timeHrs+":"+minutes+":"+seconds);
            return;
        }
        }
} // end of program 