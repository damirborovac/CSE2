import java.util.Scanner;

public class Methods{
    
    public static int number; // user number as variable for the whole program
    public static int getInt(Scanner scan){
    
    	System.out.print("Enter the integer: " );
    	if(scan.hasNextInt()){
    		number = scan.nextInt(); 
    		 return number; }  // return number if an integer was entered
    		else{
    			scan.next();
    			System.out.println("You did not enter an integer.Try Again: "); // display error
    			number = getInt(scan);  	
    					}  // run the scan again
    			return number; // until you get the integer
    		}
   public static int larger(Scanner scan, int num1, int num2){
   		if(num1>num2){
   			return num1; 
   		}
   		else{
   			return num2;
   		}
   	}

   public static boolean ascending(Scanner scan, int num1, int num2, int num3){
   	
   		if(num1<num2 && num2<num3){
   			return true;
   		}
   		else{
   			return false;
   				}
   			}

   
  	public static void main(String [] arg){
		Scanner scan = new Scanner(System.in);
			int a,b,c;
			System.out.println("Enter three integers");
			a=getInt(scan);
			b=getInt(scan);
			c=getInt(scan);	
	
	System.out.println("The larger of "+a+" and "+b+" is "+larger(scan,a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(scan,a,(larger(scan,b,c))));
                   	
	System.out.println("It is "+ascending(scan,a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
 
 }
}
