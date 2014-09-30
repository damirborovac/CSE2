import java.util.Scanner;

public class whatever{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); // enables user input
        
        System.out.println(" Enter a letter to indicate a choice of: ");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f)");
        
        String answer1=myScanner.next();
        char answerOne = answer1.charAt(0);
        int notSingleChar = answer1.length();
        
        if(notSingleChar > 1){
            System.out.println("Please enter a single character.");
            return;
                }
    }
}