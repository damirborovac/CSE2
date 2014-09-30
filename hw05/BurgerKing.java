// Damir Borovac HW #05
// Burger King Java Program
// Due 9/30/14
//
// This program will prompt the user to choose between buying a burger, soda 
// or fries. If the user wishes a burger, he will be asked to choose the fixins.
// If the user wishes to purchase soda, he will choose between 4 different types
// and finally, if he wants to buy fries, he can choose between a large and 
// small option. The program will only accept single character inputs. Enjoy !
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; // enabling scanner method

public class BurgerKing{
    // defining main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); // enables user input
        
        System.out.println("Enter a letter to indicate a choice of: ");
        System.out.println("Burger (B or b)"); // user is prompted to choose
        System.out.println("Soda (S or s)"); // between the three options
        System.out.print("Fries (F or f)");
        
        String answer1=myScanner.next(); // program reads the input 
        char answerOne = answer1.charAt(0); // single character 
        int notSingleChar = answer1.length(); 
        
        if(notSingleChar > 1){ // in case it is not a single character 
            System.out.println("Please enter a single character."); // the program
            return;  // will output an error message
                }
                
        switch(answerOne){ // switch statement depending on the user input
            
            case 'B': case 'b': // if the user wants a burger, he may choose the fixins
                System.out.println("Enter A or a for ''all the fixins''");
                System.out.println("C or c for cheese.");
                System.out.print("N or n for none of the above.");


                String answerOneTwo = myScanner.next();  // reads the second user input 
                char burgerFix = answerOneTwo.charAt(0);
                    switch(burgerFix){
                     case 'A': case 'a':  // case with all the fixins 
                       System.out.println("You ordered a burger with all the fixins.");
                       break;
                    case 'C': case 'c': // case with cheese 
                        System.out.println("You ordered a burger with cheese.");
                       break;
                    case 'N': case 'n': // case with no fixins 
                       System.out.println("You ordered a burger with no fixins.");
                        break;
                    default:        // if not one of the choices, display error message
                       System.out.println("Please enter one of the choices.");
                       break;
                                }
                            return;
            case 'S': case 's':   // if the user picks to purchase a soda 
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
                String answerTwo = myScanner.next(); // reads user input 
                char sodaFix = answerTwo.charAt(0); 
                
                    switch(sodaFix){  
                        case 'p': case 'P':  // if the user wants a pepsi
                            System.out.println("You ordered a Pepsi.");
                            break;
                        case 'c': case 'C': // if the user wants a coke 
                            System.out.println("You ordered a Coke.");
                            break;
                        case 's': case 'S':  // if the user wants a sprite
                            System.out.println("You ordered a Sprite.");
                            break; 
                        case 'M': case 'm': // if the user wants a mountain dew
                            System.out.println("You ordered a Mountain Dew.");
                            break;
                        default:            // if input not correct, display error
                            System.out.println("Please enter one of the choices.");
                            break;
                                 }
                                return;
            case 'F': case 'f':  // if the user picks fries 
                System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
                String answerThree = myScanner.next();
                char friesFix = answerThree.charAt(0);
                
                    switch(friesFix){
                        case 'l': case 'L': // large fries option
                            System.out.println("You ordered large fries.");
                            break;
                        case 's': case 'S': // small fries option 
                            System.out.println("You ordered small fries.");
                            break;
                        default:            // if incorrect input, display error message
                            System.out.println("Please enter one of the choices.");
                            break;
                    }
                    return;
            default:  // if the user is different from any of the given choices, display error message
                System.out.println("You did not enter any of B, b, S, s, F, or f.");
                break;
            }
    }
}  // end of program 