// Damir Borovac HW #07
// NumberStack Java Program
// Due 10/14/14
//
// This program will take an input from the user in the form of an integer and 
// will then display a pyramid - like shape image, depending on how large the
// inputed integer is. The program runs the same operation for three times, 
// using for, while and do-while loops. Enjoy ! 

import java.util.Scanner; // enables scanner method

public class NumberStack{
    //defining main method
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in); // enables user input
        System.out.print("Please enter an integer 1 - 9 : "); // prompts user for input
        
        int number = 0; // set number as a variable

        while(!input.hasNextInt()){ // while loop in case not an integer 
	    input.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter a proper int; try again- ");
	            }

        number = input.nextInt(); // set number as the inputed variable
		number ++;
        
		System.out.println("Using for loops:");
		
	for(int j = 1 ; j < number ; j++ ){ // main for loop 
	    

    	for(int y = 0; y < j ; y++){ // for loop for "stacks"
    		for (int p = 0; p < (number-j-1); p++){ // for loop for spaces 
        		System.out.print(" "); // as we need n-output-1 spaces to start with
    				}
    		for(int k = 0; k < 2*j-1 ; k++){ // loop for displaying the 
				System.out.print(+(j)); 	// right numbers consistently.
	    			}			// the number is displayed 2*output-1 times
	    	System.out.println(); // goes to next line in order to continue 
    	}							// building the "pyramid"
	    	
	    for (int p = 0; p < (number-j-1); p++){ // for loop for spaces 
        	System.out.print(" ");
    			}
	    for (int t = 0 ; t < 2*j-1 ; t++){ // for loop for dashes, as there are
	    								// 2*output-1 dashes (same as numbers)		
		    	System.out.print('-'); 
				 }
	    	System.out.println(); // goes to the next line 
	    }
	    
	    System.out.println("Using While Loops: " );
	    int output = 1; // defining necessary variables
	    int spaces1 = 0; 
	    int spaces2 = 0;
	    int line = 0;
	    int stacks = 0;
	    int theNumber = 0;
	    int number1 = number;
	    
	    while(output<number1){ // main while loop 
	    	int prac = number1 - output - 1; // variable for (n-output-1) 
	    	int prac2 = 2*output-1;			// variable for 2*output-1 
	    	stacks = 0; 
	    	while(stacks<output){ // while loop for repeating the stacks of numbers
	    		spaces1 = 0;
	    		theNumber =0;
	    		while(spaces1 < (prac)){ // while loop for spacings
	    			System.out.print(" "); 
	    			spaces1 ++;  }
	    		while(theNumber < (prac2)){ // while loop for printing the numbers
	    			System.out.print(+output);
	    			theNumber ++;  }
	    			stacks ++;
	    		System.out.println(); } // goes to next line 
	    		spaces2 = 0;
	    		line = 0;
	    	while(spaces2 < (prac)){  // while loop for spaces for dashes
	    		System.out.print(" "); 
	    		spaces2 ++;  }
	    	while(line < prac2){	// while loop for dashes 
	    		System.out.print('-');
	    		line ++; } 
	    		output ++;
	    	System.out.println();    } // end of main while loop
	    
	    System.out.println("Using do-while Loops: " );
	    int output1 = 1; // assigning variables 
	    int spaces3 = 0;
	    int spaces4 = 0;
	    int line1 = 0;
	    int stacks1 = 0;
	    int theNumber1 = 0;
	    int number2 = number;
	    
	    do{ // main do-while loop 
	    	int prac3 = number2 - output1 - 1; // n-out-1 variable
	    	int prac4 = 2*output1-1;			// 2*output-1 variable
	    	stacks1 = 0;

	    	do{ // do-while loop for number of stacks 
	    	 	spaces3 = -1;
	    	 	theNumber1 = 0;
	    	 	do{  // do-while loop for printing spaces for number stacks
	    	 		System.out.print(" "); 
	    			spaces3 ++;    }while(spaces3<prac3); 
	    		do{	// do-while loop for printing stacks of numbers
	    			System.out.print(+output1);
	    			theNumber1 ++; }while(theNumber1<prac4);
	    		stacks1 ++; 
	    		System.out.println(); // goes to next line
	    		  	}while(stacks1<output1);
	    		  	
	    	spaces4 = -1;
	    	line1 = 0;	
	    	do{ // do -while loop for printing spaces for dashes
	    		System.out.print(" ");
	    		spaces4 ++;  }while(spaces4<prac3);
	    		
	    	do{   // do-while loop for printing the dashes 
	    		System.out.print('-');
	    		line1 ++;    }while(line1<prac4);
	    	
	    	output1 ++; 
	    	System.out.println();  // goes to next line
	    	
	    }while(output1<number2); // end of main do-while
		
    }
} // end of program