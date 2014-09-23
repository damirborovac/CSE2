// Damir Borovac HW #04
// Month Java Program
// Due 9/23/14
//
// This program enables the user to enter one of the 12 months represented as
// a number and the program displays the number of days of that month. If the 
// month is February, the program prompts the user to enter the year so it can
// calculate whether it is a leap year or not, hence outputting the correct 
// number of days in the month. Enjoy ! 
//
//////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;
// defining main method
public class Month{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); // enables user input
        
        System.out.print("Enter an int giving the number of the month (1-12)-"); // prompts user for input
        int month = 0; // assigning variable for month
        
        if(myScanner.hasNextInt()){ // checking that the input is an integer 
        month = myScanner.nextInt(); 
        }
        else{
            System.out.println("You did not enter an integer between 1 and 12."); // if input not integer
            return;
        }
           if(month<1 || month>12){
               System.out.println("That is not a valid number between 1 and 12."); // if integer outside range
          return;
           }
            else{
            }
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){ // months with 31 days
                System.out.println("The month has 31 days."); // if one of these, print that it has 31 days
                return;
            }
            else{
            }
            if(month==4 || month==6 || month==9 || month==11){ // months with 30 days
                System.out.println("The month has 30 days."); // if one of these, print that it has 30 days.
                return;
            }
            else{
            }
                Scanner year = new Scanner(System.in); // if 2 was entered (February)
                System.out.print("Enter an integer givng the year: "); // user prompted to enter year
                int february = year.nextInt();
                boolean LeapYearYes = (february%4 == 0 && february%100 != 0) || (february%400 == 0); // leap year determining
                if (LeapYearYes == true){ // if it is a leap year, print that it has 29 days. 
                System.out.println("The month has 29 days.");
                }
                else{ 
                System.out.println("The month has 28 days."); // if not leap year, print it has 28 days. 
                }
       }
}