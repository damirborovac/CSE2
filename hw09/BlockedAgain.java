// Damir Borovac HW #09
// BlockedAgain Java Program
// Due 11/4/14
//
// This program will take user input in the range [1,9] and will force the user
// to input the correct input until done so. Then, the program will proceed to 
// print out a 'pyramid' of stacks of numbers, or blocks, whose shape depends
// on the number entered by the user. The program also makes sure the spacing 
// of the dashes and the number blocks in the pyramid is correct. Enjoy ! 
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; // enables scanner method

public class BlockedAgain { // defining main class

    public static int checkInt(Scanner scan) { // checkInt method 
        int output = 0;
        boolean flag = true; // set boolean for the following while loop
        while (flag) { // while this is true.. 
            if (scan.hasNextInt()) { // check if the input is an integer
                output = scan.nextInt(); // and assign it to output
                flag = false; // hence exit the while loop
            }
            else { // or in case the input is incorrect, display the error 
                System.out.println("You did not enter an int. Try again: ");
                scan.next();
            } // and obtain the next value 
        }
        return output; // return the value obtained

    }

    public static int checkRange(int choice, Scanner scan) { // checkRange method
        while (true) {
            if (choice <= 0 || choice >= 10) { // check if the input is in the specified range
                System.out.println("You did not enter an int in [1,9]; try again: ");
                choice = checkInt(scan); // after displaying the error, make sure the 
                continue; // input is an integer again...
            }
            return choice; // return the value once input is correct
        }
    }

    public static int getInt() { // getInt method 
        int choice; // initialize choice as variable
        Scanner scan = new Scanner(System.in); // enables user input 
        System.out.println("Please enter an integer in the range [1,9]: "); // prompt message
        choice = checkInt(scan); // check if input is integer,
        choice = checkRange(choice, scan); // if so, check if its in the range 
        return choice; // and then return the value if it passes as acceptable
    }
    public static void block(int p, int choice) { // block method 
        for (int j = 0; j < p; j++) { // for loop for printing 
            line(2 * p - 1, choice, p); // the blocks of numbers
            System.out.println(); // go to next line after each block
        }
        dashes(2 * p - 1, choice, p); // now after each block, print the dashes
        System.out.println(); // and go to nextline again

    }
    public static void dashes(int num, int choice, int p) { // dashes method
        for (int k = 0; k < choice - p; k++) { // for loop for printing 
            System.out.print(" "); // the correct amount of spaces
        }
        for (int n = 0; n < num; n++) { // for loop for the number of dashes 
            System.out.print("-");
        }

    }
    public static void line(int num, int choice, int p) { // line method 
        for (int k = 0; k < choice - p; k++) { // for loop for spaces 
            System.out.print(" ");
        }
        for (int n = 0; n < num; n++) { // for loop for printing the numbers
            System.out.print(p);
        }
    }

    public static void allBlocks(int choice) { // allBlocks method 
        for (int i = 1; i <= choice; i++) { // continue building the pyramid
            block(i, choice); // until the wanted size is reached
        }
    }

    public static void main(String[] s) { // main method 
        int m;
        m = getInt(); // force user to enter an integer in the specified range
        allBlocks(m); // print the pyramid
    }
}