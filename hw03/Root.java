// Damir Borovac
// HW #03 - Program #2
// Cubic Root Java Program
// 
// This program enables the user to enter a double and outputs the cube root
// of that number as well as the cubed value of the final, crude guess. Enjoy ! 
//
////////////////////////////////////////////////////////////////////////////////


    import java.util.Scanner;
    
    public class Root {
        // main method
        public static void main(String [] args){
            
        Scanner myScanner; 
            
        myScanner = new Scanner (System.in);  // Enables user input. 
             
        System.out.print(" Enter a double and I will print it's cube root: ");  // Ask the user for input. 
                                                                        
        double inputData = myScanner.nextDouble(); // Saves the input as a double.
        
        double guess, guessOne, guess2, guess3;
        double cubed, guess4, guess5;
        
        guess = inputData/3; // Makes a guess of the cube root
        guessOne = (2*guess*guess*guess+inputData)/(3*guess*guess); // Following lines make
        guess2 = (2*guessOne*guessOne*guessOne+inputData)/(3*guessOne*guessOne); // the guess
        guess3 = (2*guess2*guess2*guess2+inputData)/(3*guess2*guess2); // more accurate.
        guess4 = (2*guess3*guess3*guess3+inputData)/(3*guess3*guess3);
        guess5 = (2*guess4*guess4*guess4+inputData)/(3*guess4*guess4);
        cubed = guess5*guess5*guess5; // Cubes the best crude guess. 
        
        System.out.println(" The cube root is : "+guess5); // prints the cube root
        System.out.println(" The cube value of " + guess5 + "  is  " +cubed); // prints the cubed value
             
        }
    } // end of main method