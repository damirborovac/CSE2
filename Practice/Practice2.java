import java.util.Scanner;

public class Practice2{
    
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
                
        switch(answerOne){
            
            case 'B': case 'b':
                System.out.println("Enter A or a for ''all the fixins''");
                System.out.println("C or c for cheese.");
                System.out.print("N or n for none of the above.");


                String answerOneTwo = myScanner.next();
                char burgerFix = answerOneTwo.charAt(0);
                    switch(burgerFix){
                     case 'A': case 'a':
                       System.out.println("You ordered a burger with all the fixins.");
                       break;
                    case 'C': case 'c':
                        System.out.println("You ordered a burger with cheese.");
                       break;
                    case 'N': case 'n':
                       System.out.println("You ordered a burger with no fixins.");
                        break;
                    default:
                       System.out.println("Please enter one of the choices.");
                       break;
                                }
                            return;
            case 'S': case 's':
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
                String answerTwo = myScanner.next();
                char sodaFix = answerTwo.charAt(0);
                
                    switch(sodaFix){
                        case 'p': case 'P':
                            System.out.println("You ordered a Pepsi.");
                            break;
                        case 'c': case 'C':
                            System.out.println("You ordered a Coke.");
                            break;
                        case 's': case 'S':
                            System.out.println("You ordered a Sprite.");
                            break;
                        default:
                            System.out.println("Please enter one of the choices.");
                            break;
                                 }
                                return;
            case 'F': case 'f':
                System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
                String answerThree = myScanner.next();
                char friesFix = answerThree.charAt(0);
                
                    switch(friesFix){
                        case 'l': case 'L':
                            System.out.println("You ordered large fries.");
                            break;
                        case 's': case 'S':
                            System.out.println("You ordered small fries.");
                            break;
                        default:
                            System.out.println("Please enter one of the choices.");
                            break;
                    }
                    return;
            }
    }
}