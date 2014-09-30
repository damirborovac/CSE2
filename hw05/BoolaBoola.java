// Damir Borovac HW #05
// BoolaBoola Java Program
// Due 9/30/14
//
// This program will display a sequence of three boolean variables (true or
// false) and will have an AND or OR comparator between them, and the user 
// will be prompted to enter what he/she thinks is the correct answer to the
// given statement. Enjoy! 
//
///////////////////////////////////////////////////////////////////////////////


import java.util.Scanner; // enabling scanner 
import java.util.Random; // and random methods

public class BoolaBoola{
    // defining main method
    public static void main(String[] args){
        
        Scanner scanner= new Scanner(System.in); // enables user input
        
        int number1 = (int)(Math.random()*2); // assigning each variable
        int number2 = (int)(Math.random()*2); // to a random integer, either 
        int number3 = (int)(Math.random()*2); // a zero or a 1. 
        int number4 = (int)(Math.random()*2);
        int number5 = (int)(Math.random()*2);
        boolean numma1, numma2, numma3, numma4, numma5; // assigning boolean 
        boolean firstPart, answer; // variables
        
        if( number1 == 0 ){  // if first variable is 0, have its equivalent 
            numma1=false;    // boolean variable be set to false. 
            System.out.print("Does false");     } // start printing statement
        else{   
            numma1=true;    // otherwise if the first variable is 0, its 
            System.out.print("Does true");      } // equivalent boolean is true.
        if( number2 == 0 ){                         
            numma2= false;          // the variable numma 2 corresponds to the 
            System.out.print(" || ");           } // first and / or
        else{       // if the value is zero, than its an OR, otherwise its AND
            numma2=true;
            System.out.print(" && ");           }
        if( number3 == 0){
            numma3 = false;                         // assigning the                
            System.out.print(" false ");        } // second variable 
        else{
            numma3 = true;
            System.out.print( " true " );       }
        if( number4 == 0 ){
            numma4 = false;
            System.out.print(" || ");           } // second OR / AND 
        else{
            numma4 = true;
            System.out.print(" && ");           }
        if( number5 == 0){          // assigning the final variable and
            numma5 = false;     // printing the rest of the statement. 
            System.out.print( " false have the value true(t/T) or false(f/F)?:  ");    }
        else{
            numma5 = true;
            System.out.print( " true have the value true(t/T) or false(f/F)?:   ");    }        
              
        String choice = scanner.next(); // reads the user input
        
        if(!choice.equalsIgnoreCase("T") && !choice.equalsIgnoreCase("F")){
            System.out.println(" This is an incorrect input.");
        } // this is an error message if the input is different from t/T/f/F
        
        if( choice.equalsIgnoreCase("T") && (numma2 == false) && (numma4 == false) ){
            
            firstPart = (numma1 || numma3); // first combination with both 
            answer = (firstPart || numma5); // ORs
            if( answer == true ){ // evaluating if the statement is correct
            System.out.println(" That is correct.");     } // if logic correct, print
                else{ System.out.println(" That is incorrect."); // otherwise incorrect      
                return; } 
        }
            
        if( choice.equalsIgnoreCase("T") && (numma2 == true) && (numma4 == true) ){
            firstPart = numma1 && numma3; // combination with two ANDs
            answer = firstPart && numma5;
            if( answer == true){ // if the logic is true then proceed
                System.out.println(" That is correct."); } // printing results
                else{ System.out.println("That is Incorrect.");    
                return; }
        }   
        
        if( choice.equalsIgnoreCase("T") && (numma2 == false) && (numma4 == true) ){    
            firstPart = numma1 || numma3; // OR and AND
            answer = firstPart && numma5;
            if( answer == true){  // evaluating statement logic
                System.out.println(" That is correct."); }
                else{ System.out.println("That is Incorrect.");    
                return;}
        }
                
        if( choice.equalsIgnoreCase("T") && (numma2 == true) && (numma4 == false) ){
            firstPart = numma1 && numma3; // AND and OR 
            answer = firstPart || numma5;
            if( answer == true){
                 System.out.println(" That is correct."); } // print statements
                else{ System.out.println("That is Incorrect.");  
                return;}
        }

        if( choice.equalsIgnoreCase("F") && (numma2 == false) && (numma4 == false) ){ 
            firstPart = (numma1 || numma3);  // if user thinks the final output is
            answer = (firstPart || numma5); // false, with OR and OR combination
            if( answer == false ){  // if the logic corresponds to false, proceed
            System.out.println(" That is correct.");     } // print statements
                else{ System.out.println(" That is incorrect.");     
                return;}
        }

        if( choice.equalsIgnoreCase("F") && (numma2 == true) && (numma4 == true) ){
            firstPart = numma1 && numma3;  // combination with two ORs
            answer = firstPart && numma5;
            if( answer == false){ // evaluating the final output
                System.out.println(" That is correct."); }  // print statements
                else{ System.out.println("That is Incorrect.");    
                return; }
        }

        if( choice.equalsIgnoreCase("F") && (numma2 == false) && (numma4 == true) ){    
            firstPart = numma1 || numma3; // OR and an AND
            answer = firstPart && numma5;
            if( answer == false){  // evaluates the final answer
                System.out.println(" That is correct."); } // print statements
                else{ System.out.println("That is Incorrect.");     
                return; }
        }

        if( choice.equalsIgnoreCase("F") && (numma2 == true) && (numma4 == false) ){
            firstPart = numma1 && numma3; // combination with AND and OR
            answer = firstPart || numma5;
            if( answer == false){ // evaluating logic 
                 System.out.println(" That is correct."); } // print statements
                else{ System.out.println("That is Incorrect.");    
                return; }
        }
    }
} // end of program 