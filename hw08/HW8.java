// Damir Borovac HW #08
// HW8 Java Program
// Due 10/28/14
//
// This program represents a way to use overloading methods in a slighlty different
// manner for each of the wanted outputs. Each of the different methods are called
// at different instants in the main method. 
// Then, after the methods are called,
// they properly display errors in case the user input is incorrect and force
// the user the reenter the input until it is correct or until he runs out of 
// trials. Enjoy ! 
////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner; // enables scanner method

public class HW8 { // main class
    char input; // have this variable as a char for the remainder of the program

    public static char getInput(Scanner scan, String words) {
        while (true) {   
            String choice = scan.next();  // assign choice as the input string 
            if (choice.length() > 1) { // check if the lenght is greater than one
                System.out.println("You should enter exactly one character. Try again: ");
                continue; // if so, display error message and continue until correct
            }
            char choiceTwo = choice.charAt(0); // cast the string (input) to a character 
            for (int i = 0; i < words.length(); i++) { // check if the char matches the 
                                                    // specified string we are checking for
                if (choiceTwo == words.charAt(i)) { // make sure the characters match 
                    return choiceTwo;               // hence return the character 
                }
            }
            System.out.println("You did not enter a character from the list" + words + "; try again");
        } // the above print statement is in case the inout is different from the list
    }
    public static char getInput(Scanner scan, String words, int times) {
        int counter = 0;  // set counter 
        while (counter < times) { // while loop for given number of trials (times)
            String choice = scan.next(); // assign string to choice 
            if (choice.length() > 1) {  // check for the length 
                System.out.println("You should enter exactly one character. Try again: ");
                continue; // print error message and continue 
            }
            char choiceTwo = choice.charAt(0); // cast input to a charc
            for (int i = 0; i < words.length(); i++) {
                if (choiceTwo == words.charAt(i)) { // make sure it matches 
                    return choiceTwo; // hence return it
                }
            }
            counter++; // increment counter 
            System.out.println("You did not enter a character from the list" + words + "; try again");
        }
        System.out.println("You failed after 5 tries."); // error message after failing for 5 times
        return ' ';  // to enter the right input 
    }

    public static char getInput(Scanner scan, String output, String words) {
        while (true) {
            System.out.println(output); // print the Choose a digit statement. 
            String choice = scan.next(); // assign string
            if (choice.length() > 1) { // check if length is not 1 
                System.out.println("You should enter exactly one character. Try again: ");
                continue;  // error message and continue 
            }
            char choiceTwo = choice.charAt(0); 
            for (int i = 0; i < words.length(); i++) {

                if (choiceTwo == words.charAt(i)) { // make sure the length matches
                    return choiceTwo; // return the output 
                }
            }
            System.out.println("You did not enter an appropriate character.");
        } // print the error message (above)
    }

    public static void main(String[] arg) {

        char input; // assign input as char
        Scanner scan = new Scanner(System.in); // enables user input 
        
            // following are the main methods operations 
            // as defined by the homework assignment. 
            
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");

        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); 
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }

        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");

    }
} // end of program 