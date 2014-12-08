// Damir Borovac CSE 02
// Lab 02 - Cylcometer
// Date : 09/03/14
// 
// This program will perform as a cyclometer, which means it will record data 
// during the bicycle trip (time elapsed and rotations of the front wheel) and
// will output the distance, time elapsed and etc. 
//
//////////////////////////////////////////////////////////////////////////////

// Defining class.
public class Cyclometer {
    
// Adding main method
    public static void main(String[] args ){
        
// The following numbers are the input data from the cyclometer.

        int secsTrip1 = 480;
        int secsTrip2 = 3220;
        int countsTrip1 = 1561;
        int countsTrip2 = 9037;
        
// Important variables, constants and output data.

        double wheelDiameter = 27.0;
        double PI = 3.14159;
        int feetPerMile = 5200;
        int inchesPerFoot = 12;
        int secsPerMinute = 60;
        double distanceTrip1, distanceTrip2, totalDistance; 
        
// Printing values stored for time elapsed and counts. 

        System.out.println("Trip1 took"+ (secsTrip1/secsPerMinute)+"minutes and had" +countsTrip1+ "counts.");
        System.out.println("Trip2 took"+(secsTrip2/secsPerMinute)+"minutes and had" +countsTrip2+ "counts.");
                            
        distanceTrip1 = countsTrip1*wheelDiameter*PI;
        
//  Above gives distance in inches
//( for each count, a rotation of the wheel travels
// the diameter in inches times PI)

        distanceTrip1 /= inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance = distanceTrip1+distanceTrip2;
 //Print out the output data.
 
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
    } // end of main method
    
} // end of main class