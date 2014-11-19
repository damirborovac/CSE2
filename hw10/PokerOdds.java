// Damir Borovac HW #09
// PokerOdds Java Program
// Due 11/18/14
//
// This program will simulate a random poker hand at first, and then proceed to
// prompt the user whether or not he/she wishes to simulate another poker round,
// until whenever they feel like doing so. Then, if the user decides to quit the
// "hand simulator", the program will print out the results of a simulation 
// that runs 10,000 times and records the number of pairs of each rank occuring
// in the 10,000 poker hands and prints the amount of occurences. In addition,
// it will calculate the amount of times it happens in a hand that there is no 
// pair at all. Enjoy ! 

import java.util.Random; // enabling random method
import java.util.Scanner; // enabling scanner method

// defining main class
public class PokerOdds {
    // main method
    public static void main(String[] arg) {

            showHands();
            simulateOdds();

        } // end of main method 

    public static void showHands() { // showHands method

        Scanner scan = new Scanner(System.in); // enable user input 
        String answer = ""; // set answer string 

        String[] suit = {
            "Clubs", "Diamonds", "Hearts", "Spades" 
        }; // initialize the suits in an array for display purposes
        String[] rank = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"
        }; // initialize the ranks in an array for displaying purposes
        do { // beginnign of do-while loop 

            int[] deck = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51
            }; // assign a specific number to each of the slots in the deck of cards

            int[] cards = {
                -1, -1, -1, -1, -1
            }; // initializing the cards array which will store the results of the poker hand
            String[] hands = new String[4]; // initialize hands string array

            for (int i = 0; i < 5; i++) {

                int num = (int)(Math.random() * (52 - i)); // generate a random number
                cards[i] = deck[num]; // assign the number to the proper slot in cards

                for (int j = num; j < 51; j++) { // the following is the part 
                    deck[j] = deck[j + 1];  // where the program replaces the 
                }                           // correct position of the picked card                
                                            // in the deck with the value of -1
                deck[51] = -1;
            }
            for (int j = 0; j < 4; j++) {
                hands[j] = "";
            }
            for (int i = 0; i < 5; i++) { // assigning values to hands 
                int temp = cards[i] / 13;  // in order to be able 
                int temp2 = cards[i] % 13; // to print them in an easy fashion
                hands[temp] += rank[temp2]; // below. 
                hands[temp] += " ";
            }
            System.out.println();
            System.out.println("Clubs: " + hands[0]); // printing statements
            System.out.println("Diamonds: " + hands[1]);
            System.out.println("Hearts: " + hands[2]);
            System.out.println("Spades : " + hands[3]);

            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next(); // get input from user again
        } while (answer.equals("Y") || answer.equals("y")); // until they wish to quit

    } // end of method showHands

    public static void simulateOdds() {  // simulateOdds method

            String labels[] = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A"
            }; // assigning labels 
            String header[] = {
                "rank", "freq of exactly one pair"
            }; // assigning header 
            int totalOfLabels[] = new int[labels.length]; //assigning variables
            int k = 0; 
            int noPairs = 0;

            do {    // beginning of do-while loop
        
        // firstly, generate a random poker hand using similar code from above

    int[] deck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                    21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
                    39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
                    
                int[] cards = {-1, -1, -1, -1, -1};

                String[] hands = new String[5];

                for (int i = 0; i < 5; i++) {

                    int num = (int)(Math.random() * (52 - i)); // generate a random number
                    cards[i] = deck[num]; 

                    for (int j = num; j < 51; j++) {
                        deck[j] = deck[j + 1]; // move the rest of the elements in deck 
                    } // accordingly replacing the proper indices    
                    deck[51] = -1; // assing the last slot of the array to -1 
                }

                for (int i = 0; i < 5; i++) {
                    int temp = cards[i] / 13;
                    int temp2 = cards[i] % 13;
                    hands[temp] += labels[temp2];
                }

                String[] actualHands = new String[13]; //assigning variables
                int actualCards = 0;

                if (exactlyOneDup(hands) == true) {  // check if there is a pair/duplicate
                    for (int i = 0; i < 5; i++) { // check through all the 13 cards
                        actualCards = cards[i] % 13; // 
                        actualHands[i] = actualHands[actualCards]; }
                    for(int i = 0; i<5; i++){    
                        if (actualHands[i] == labels[i]) { // if the cards matches the label,
                            totalOfLabels[i] = totalOfLabels[i++]; // then add a value to the array for the
                        } // total number of a specific pair occurences
                    }
                }
                
                else { // if there is no pairs increase the number of hands with no pair
                    noPairs++;
                }

                k++;
        } while (k < 10000); //end of do-while loop
        // following is the printing statements for the rest of the output :
            System.out.println(header[0] + "    " + header[1]); 
            for (int t = 0; t < 13; t++) { // simplified printing option
                System.out.println(labels[t] + "       " + totalOfLabels[t]);
            }
            System.out.println("----------------------");
            System.out.println("Total of not exactly one pair:  " + noPairs); 
                // print amount of times there was no pairs in the 10000 hands

        } // end of method simulateOdds

    public static boolean exactlyOneDup(String[] array) { // method for checking for a pair
        int counter = 0; // initialize counter for matches of pairs
        boolean myDup = false; // initialize myDup as boolean
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && i != j) { // if elements match, then
                    counter++; // increment the counter for matches
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

}