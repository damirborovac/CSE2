// Damir Borovac HW #04
// Course Number Java Program
// Due 9/23/14
//
// This program will take an 6 digit input from the user, where the first four
// digits represent the year and the last two the type of the semester, and will 
// output the correct year and what semester the digit represents, while making
// sure the input is in the given range as well as an integer. Enjoy! 
//
//////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; 
// defining main method
public class CourseNumber{
    
    public static void main(String[] args){
        
        Scanner myScanner; // Enables input from user
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter a six digit number giving the course semester: "); // prompts user for input
        int courseNumber= 0; // assigning variable names
        int lastTwo = 0; 
        int courseYear$ = 0;
        
        if(myScanner.hasNextInt()){  // checking that the input is an integer
            courseNumber=myScanner.nextInt();
            courseYear$ = courseNumber/100; // separated the first four digits for the year
            lastTwo = courseNumber % 100; // separates the last two digits of the number
            
        }
        else {
            System.out.println("The number you entered is not an integer."); // error message 
            return;
        }
        if(courseNumber<186510 || courseNumber > 201440){ // specifying range for the input
             System.out.println("The number was outside the range [186510,201440]." );
             return; // return if input is outside range
         }
         else{
         }
         if(lastTwo == 10){ // if spring semester 
             System.out.println("The course was offered in the Spring semester of " + courseYear$ + ".");
             return;
         }
         else{
         }
         if(lastTwo  == 20){ // if summer 1 semester
             System.out.println("The course was offered in the Summer 1 semester of " + courseYear$ +".");
             return;
         }
         else{
         }
         if(lastTwo == 30){ // if summer 2 semester
             System.out.println("The course was offered in the Summer 2 semester of " + courseYear$ + ".");
             return;
        }
         else{
         }
         if(lastTwo == 40){ // if fall semester
             System.out.println("The course was offered in the Fall semester of " + courseYear$ + ".");
             return;
        }
         else{ // if an invalid semester is entered
         }
         if(lastTwo != 10 || lastTwo !=20 || lastTwo != 30 || lastTwo != 40){
             System.out.println("You entered an invalid semester.");
             return;
           }
         }
     } // end of program 