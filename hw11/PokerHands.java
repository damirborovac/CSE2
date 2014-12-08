// Damir Borovac CSE 2
// hw 11 Poker Hands Java Program
//
// The program is a poker hand simulator, where the user enters the 
// actual cards being dealt and the program displays the cards entered
// as well as gives feedback on what the outcome of the hand is. The program
// forces the user not to enter the same card twice and to enter a proper
// suit choice for each card. Enjoy ! 
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
import java.util.Scanner;

public class PokerHands { // main class

    public static void enterHand() { // enter hand method 

        Scanner scan = new Scanner(System.in); // enable user input

        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand : "); // prompt user
        String response = scan.next(); // get user input

        int[] freq = new int[5]; // array for counting the suits
        int[] hand = new int[13]; // array for storing the hand
        int[] actual = new int[5]; // array for hand also
        int[] deck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
                
if(response.equals("y") || response.equals("Y")){ // exit if y is entered

    for (int i = 0; i < 5; i++) { // beginning of for loop
    
        boolean toggle = true;
        String suitC = ""; // suit choice
        
        while(toggle){
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's': ");
                suitC = scan.next();
                
            if(!suitC.equals("c") || !suitC.equals("d")|| !suitC.equals("h")|| !suitC.equals("s")){
                System.out.println("You did not enter a valid response."); }
                    
                    toggle = true;  // go back to beginning
                
                if (suitC.equals("c")) { // assigning the values of 
                    freq[i] += 1;       // the suit (1,2,3 or 4) to the frequency 
                    toggle=false;                   // array
                } 
                else if (suitC.equals("d")) { // array (n/13);
                    freq[i] += 2;
                    toggle = false;
                }
                else if (suitC.equals("h")) {
                    freq[i] += 3;
                    toggle = false;
                }
                else if (suitC.equals("s")) {
                    freq[i] += 4;
                    toggle = false;
                }

                boolean timer = false;

                do {
                    System.out.println("Enter a card 1-13 (A,K,Q,..2) : ");
                    int rankC = scan.nextInt();
                    int num = 13*freq[i]-(13-rankC);
                    actual[i] = num;
                    
                    hand[i] = rankC;
                    for (int j = 0; j < actual.length && i!=j; j++) { // check through deck to see if duplicates
                        if (actual[i]==actual[j]) {
                            System.out.println("You already entered that card.");
                           }  toggle = true;

                    } num = 0; // set num to zero again
                } while (timer == true); // end of while loop
                suitC = "";
        } //end of while loop
} // end of for loop 
} // end of if loop
        else{
            return;
        }
        
        for(int p=0; p<actual.length; p++){ // shift the numbers by 1
            int temp = actual[p]-1;         // in order to use the showHands
            actual[p]=temp;             // method provided by the professor
            temp=0;
        }

        showOneHand(actual); // display the poker hand entered
    } // end of method 
    
    
    public static boolean exactlyOneDup(int[] array) { // one pair method
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


 public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }


    public static void main(String[] args) { // main method

            enterHand();
        } // end of main method


 }// end of main class
