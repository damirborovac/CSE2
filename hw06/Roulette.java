// Damir Borovac HW #06
// Roulette Java Program
// Due 10/14/14
//
// This program is a MonteCarlo simulation for the gambling game roulette. 
// The program will simulate the system where a player bets on one random number
// for 100 spins, and the program records the results of those 100 spins and 
// moves on to simulate the 100 spins a total of 1000 times. Thus, it will record
// the number of times the player never got the right number in 100 spins as well as 
// add up all the winnings he takes away from each of the 100k spins. Hence, it
// prints out the number of times the player walks away with profit, meaning having 
// his number chosen at least three times in 100 spins. Enjoy ! 
//
/////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; // enabling scanner and random methods
import java.util.Random;

public class Roulette{
    // defining main method
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); // enables user input
        
        final int number_of_trials = 1000; // set number of trials to 1000
        final int number_of_spins = 100; // set number of spins to 100
        int countOfSpins = 0; // setting the counters for spins
        int countOfTrials = 0;// and for trials
        int losses = 0; // variable for counting number of times a player never wins 
        int lossWinnings = 0; // variable for counting number of times a player has 1 winning
        int lossWinningsTwo = 0; // or two winnings
        int timesOfProfiting = 0; // or three or more winnigs 
        int winnings = 0; // counts winnings
        
        while(countOfTrials < number_of_trials){ // while loop for number of trials ( outer loop )
        
                int randomChoice = (int)(Math.random()*38); // get a random roulette number 
                System.out.println("The randomly chosen number is: " +randomChoice); // print what number it is
                
            while(countOfSpins < number_of_spins){ // while loop for number of spins (inner loop)
            
                int outcome = (int)(Math.random()*38); // generate a random outcome
                
                if(outcome == randomChoice){ // if the outcome is the same as the random roulette number, 
                        winnings ++;         // then increment winnings 
                }
            countOfSpins ++;    // end of a given spin and start new
            } // end of inner while loop
            
            if(winnings >= 3){  
                            timesOfProfiting ++; } // if player walks away with profit 
                        else if(winnings == 0){
                            losses ++;           } // if the players number never comes out in 100 spins
                        else if(winnings == 1){
                            lossWinnings ++;     } // if number comes up once
                        else if(winnings == 2){
                            lossWinningsTwo ++; } // if number comes up twice
                            
        winnings = 0; // now this sets the values back to zero 
        countOfSpins =0; // as we need to record the values again 
        countOfTrials ++; // for the remaining 999 trials 
            } // end of outer while loop 
            
            System.out.println("Your total winnings are : " +((lossWinnings*36)+(lossWinningsTwo*36*2)+(winnings*36))); // printing total winnings for the 100k spins
            System.out.println("Total number of losses is : " +losses); // printing losses
            System.out.println("The number of times you walked away with profit is : " +timesOfProfiting);
            
        }
    } // end of program
    
    
    
    
    