// Damir Borovac HW #09
// FindDuplicates Java Program
// Due 11/18/14
//
// This program will prompt the user to enter 10 integers and store them in an 
// array. Then, the elements inside of the array will be compared to each other
// in order to find any duplicate elements. If there is exactly one duplicate,
// the program will also determine that and print the correct output. Enjoy ! 
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; // enables scanner method

public class FindDuplicates { // main class


    public static boolean hasDups(int[] array) {  //hasDups method 

        boolean isDup = false;      // set variable isDup as boolean
        for (int i = 0; i < array.length; i++) { 
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && i != j) { // if the elements are the 
                    isDup = true; // same, then return true;
                }
            }
        }
        return isDup; // return answer
    }

    public static boolean exactlyOneDup(int[] array) { // exactlyOneDup method
        int counter = 0; // initialize counter for matches
        boolean myDup = false; // initialize myDup as boolean
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && i != j) { // if elements match, then
                    counter++;          // increment the counter for matches
                    if (counter == 1) { // if only one duplicate, return true
                        myDup = true;
                    }
                    else { // if more than one duplicate, return false.
                        myDup = false;
                    }
                }
            }
        }
        return myDup; // return answer
    }


    public static void main(String[] arg) { // main method 

        Scanner scan = new Scanner(System.in); // enables user input
        int num[] = new int[10]; // set num as an array of 10 integers
        String answer = ""; 

        do {
            System.out.print("Enter 10 ints- "); // prompt user for integer input
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt(); // do so until 10 numbers are reached
            }
            String out = "The array "; // printing the array
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) { // check hasDups method to look for duplicates
                out += "has "; // if there are duplicates, print has 
            }
            else {
                out += "does not have "; // otherwise, print there aren't any
            }
            out += "duplicates.";
            System.out.println(out); 
            out = "The array ";
            out += listArray(num); // printing the array 
            if (exactlyOneDup(num)) { // print that its true that the user inputted
                out += "has ";      // an array that has exactly one duplicate
            }
            else {
                out += "does not have "; // otherwise print not exactly one.
            }
            out += "exactly one duplicate.";
            System.out.println(out); 
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next(); // get input from user again
        } while (answer.equals("Y") || answer.equals("y"));  // if user enters 
    }                                   // anything else but y or Y, then leave

    public static String listArray(int num[]) { // method for printing the array
        String out = "{";                   // of inputted numbers
        for (int j = 0; j < num.length; j++) { 
            if (j > 0) {
                out += ", "; // make sure they are separated by commas
            }
            out += num[j]; // add the next value
        }
        out += "} "; // add the brackets
        return out; // return the inputted array
    }
}