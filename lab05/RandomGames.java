import java.util.Random;
import java.util.Scanner;

public class RandomGames{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick:");
        String choice = myScanner.next();
        char game = choice.charAt(0);
        
        switch(game){
            case 'R': case 'r':
                int randomNo = (int)(Math.random()*38);
                System.out.println("Roulette:  " +randomNo);
                break;
            case 'C': case 'c':
                System.out.println("Craps option is yet to be implemented.");
                break;
            case 'P': case 'p':
                System.out.println("Picking a card option is yet to be implemented.");
                break;
            default:
                System.out.println("You did not enter one of the choices.");
                break;
        }
    }
}