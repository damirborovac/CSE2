// Damir Borovac
// HW #03 - Program #1
// Bicycle Java Program
// 
// This program will prompt the user for two inputs - the number of counts
// and the number of seconds, hence will output the distance travelled,
// as well as the average miles per hour. 
//
///////////////////////////////////////////////////////////////////////////

    import java.util.Scanner;
    
    // Defining class
            public class Bicycle {
                
            //adding main method
            public static void main(String [] args) {
            
        Scanner myScanner;

        myScanner = new Scanner (System.in);  
        
        double tripDistance, milesPerHour, tripLength, tripLengthMins; // defining parameters for calculations
        
        double wheelDiameter=27.0; // Defining useful constants 
        double PI=3.14159; //
        int feetPerMile=5280; // 
        int inchesPerFoot=12; //
        int secsPerMinute = 60;
        int minsPerHour = 60;

        System.out.print(" Enter the number of seconds: ");  // Ask the user for 
                                                            // input for number of seconds            
        int nSecs = myScanner.nextInt();
        
        System.out.print(" Enter the number of counts: "); // Ask for number of counts. 
        
        int nCounts = myScanner.nextInt();
        
        tripLengthMins = nSecs/secsPerMinute; // Arithmetic calculations for 
        tripLength = tripLengthMins/minsPerHour; // the required outputs. 
        tripDistance = nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        milesPerHour = tripDistance / tripLength; 
        
        tripDistance = tripDistance*100; // Rounding up numbers to make them 
        tripDistance = (double)((int)tripDistance); // look more legitimate
        tripDistance = tripDistance/100; // and meaningful.
        
        tripLengthMins = tripLengthMins *100;
        tripLengthMins = (double)((int)tripLengthMins);
        tripLengthMins = tripLengthMins/100;
        
        milesPerHour = milesPerHour*100;             
        milesPerHour = (double)((int)milesPerHour);
        milesPerHour = milesPerHour / 100;
        
        System.out.println(" The distance was " +tripDistance+" miles and took " + tripLengthMins + " minutes.");
        System.out.println("The average mph was " + milesPerHour );
            
        } 
}

