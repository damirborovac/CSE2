import java.util.Scanner;

public class yeah{
	public static void main(String [] args){
	    
	   Scanner input = new Scanner(System.in);
	   while(!input.hasNextInt()){
	       input.next();
	       System.out.println("That is not an integer.");
	     System.out.println("Enter an integer: ");
	      int number1 = input.getInt();
	    System.out.println("Enter an integer: ");
	      int number2 = input.getInt();  
	     
	   }
        int num1 = n1;
        int num2 = n2;
        System.out.println("Number 1 is " +num1+ "and number 2 is : " +num2);
	  }
	public static int getInt(int n1, int n2, int n3){
	    System.out.println("Please enter an integer: ");
	    int n1 = input.nextInt();
	    System.out.println("Please enter an integer: ");
	    int n2 = input.nextInt();
	    System.out.println("Please enter an integer: ");
	    int n3= input.nextInt();
	    
	    return getInt;
	}
}