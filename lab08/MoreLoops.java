import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;
	do{ 
		System.out.print("Enter an int- "); // print the prompting message
		if(!scan.hasNextInt()){			// if the input is not an integer
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- "); // print error mesage and ask to try again
	}
	}while(!scan.hasNextInt()); // all until the user inputs an integer

        n=scan.nextInt();
		
		int j=0; // initialize variables for the whhile loop
		while(j<n && j<40){
			int p = -1;// while j is less than 40
			while(p<j){ // while p is less than j+1
				System.out.print('*'); // print the star
				p++;
		} 
			System.out.println(); // go to next line 
		j++; // increment j
	} // end of while loop
      
	int k=3; // set k to 3 as the while loop needs to run only once 
	while(k<4){
		k++; // hence increment the value to display 4 instantly 
		System.out.println("k="+k);// print the statement 
	 	} // end of while loop
       
       for(int i = 0; i<=10;i++){
       		if(n==1 || n==2){
       			System.out.print("Case 2 "); 
       			continue;
       		}
       		if(n==3){
       			break;
       		}
       		if(n==4){
       			System.out.println("Case 4"); 
       			System.out.println("Case 5"); 
       		}
       		if(n==5){
       			System.out.println("Case 5"); 
       		}
       		if(n<1 || n>5){
       			System.out.println(n + " is >5 or <1");
       		}
       	}
       }

	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
    