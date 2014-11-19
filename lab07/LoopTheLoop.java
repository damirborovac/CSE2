import java.util.Scanner;

public class LoopTheLoop{
    
    public static void main(String [] args){
        
        Scanner scnr = new Scanner(System.in);
        boolean finalPart = true;
        boolean incorrectInput = true;
        int nStars = -1;
        while(finalPart){
        while (incorrectInput) {
        System.out.println("Enter an integer in the range [1,15]: ");
            if (scnr.hasNextInt()) {
            
                nStars = scnr.nextInt();
               
                if (0 >= nStars || nStars > 15) {
                    System.out.println("Error: Integer not in the specified range.");
                } else {
                    incorrectInput = false;
                }
            } else {
                scnr.next();
            }
        }
       nStars ++;
       while(true){
        int k = 1;
        while(k<nStars){
            System.out.print('*');
            k++;
        }
        int times = 0;
        int rows = 0;

        while(times<nStars){
            rows = 0;
            while(rows<times){
                System.out.print('*');
                rows ++; }
            System.out.println();
                times ++;

            }
            
        break; }
        System.out.println("Enter y or Y to go again: ");
        String answer = scnr.next();  // reads the second user input 
        char response = answer.charAt(0);
            switch(response){
                case 'Y': case'y':
                    nStars = -1;
                    incorrectInput = true;
                  continue;
                default:
                return; }
        }
    }
}