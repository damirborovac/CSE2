/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
  public static void main(String[] args){ // error args and brackets switched
      
    System.out.print("Enter an int- ");
    
    Scanner scan=new Scanner(System.in);

    int n = 0;
    if(scan.hasNextInt()){
         n = scan.nextInt(); 
         System.out.println("You entered "+n);
         }
         
    int k=4,p=6,q=7,r=8; // n is already defined
    int total = (k+p+q+r);
    switch(total){
      case 24: 
      case 25: System.out.println("sum is 25");
               System.out.println("Again, you entered "+n); // change repeat to again
               break; // add break and remove default
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */
