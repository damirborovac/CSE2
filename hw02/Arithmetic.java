// Damir Borovac
// HW #02
// Arithmetic Java Program
// 

// This program takes the number of items bought and their cost, and 
// outputs that information, along with the total cost of the purchase (before tax),
// the total sales tax, as well as the total cost of purchase, including the sales tax 
// (with rounded numbers). 
////////////////////////////////////////////////////////////////////////////////////////

// Defining a class
public class Arithmetic {
    
//Adding main method 
   public static void main(String[] args ) {
      
// Defining the Input Variables
        int nSocks = 3;  // Amount of socks
        double sockCost$=2.58;  // Cost of one pair of socks
        int nGlasses=6;  //Number of drinking glasses
        double glassCost$=2.29;  //Cost per glass
        int nEnvelopes=1;  //Number of boxes of envelopes
        double envelopeCost$=3.25;  //cost per box of envelopes
        double taxPercent=0.06; // PA sales tax
        
        double salesTaxSocks$, salesTaxGlass$, salesTaxBox$; // declaring sales 
                                                            //  taxes for each item   
                                                            
        salesTaxSocks$ = (sockCost$*taxPercent);  // Sales tax for each item
        salesTaxSocks$ = salesTaxSocks$ * 100;    // and rounding up the    
        salesTaxSocks$ = (double)((int)salesTaxSocks$); //output values.
        salesTaxSocks$ = salesTaxSocks$ / 100;
        
        salesTaxBox$ = (envelopeCost$*taxPercent); 
        salesTaxBox$ = salesTaxBox$ *100;
        salesTaxBox$ = (double)((int)salesTaxBox$);
        salesTaxBox$ = salesTaxBox$ /100;
        
        salesTaxGlass$ = (glassCost$*taxPercent);
        salesTaxGlass$ =  salesTaxGlass$*100;
        salesTaxGlass$ = (double)((int) salesTaxGlass$);
        salesTaxGlass$ =  salesTaxGlass$ /100;
           
        // Outputting the input variables, including the sales tax 
        
        System.out.println(" " );
        System.out.println(" Item #1: Pair of Socks "); // Name, amount and cost 
        System.out.println(" Amount: 3 ");      // of socks.
        System.out.println(" Price: $2.58");   
        System.out.println(" Sales Tax: $"+salesTaxSocks$+" ");
        System.out.println(" " );
        System.out.println(" Item #2: Drinking glass ");  // Name, amount and 
        System.out.println(" Amount: 6 ");                // cost of the drinking
        System.out.println(" Price: $2.29");                // glasses.
        System.out.println(" Sales Tax: $" +salesTaxGlass$+" ");
        System.out.println(" " );
        System.out.println(" Item #3: Envelope Box ");  // Name, amount and cost 
        System.out.println(" Amount: 1 ");          // of the envelope box.
        System.out.println(" Price: $3.25"); 
        System.out.println(" Sales Tax: $" +salesTaxBox$+" ");
        System.out.println(" " );
        
        double totalSockCost$, totalGlassCost$, totalBoxCost$; //declaring
                                        // variables that need to be calculated.
                
        double totalCostNoTax$, totalCostWithTax$, totalSalesTax$;// total cost w/ and w/o sales tax
        
        totalSockCost$ = nSocks*sockCost$;    // The cost of each kind of group
        totalGlassCost$ = nGlasses*glassCost$;  // of items
        totalBoxCost$ = nEnvelopes*envelopeCost$;
        
        totalCostNoTax$ = (totalSockCost$+totalGlassCost$+totalBoxCost$);  // Total Cost (before tax)
        totalSalesTax$ = totalCostNoTax$*taxPercent;                       // Total Sales Tax
        totalCostWithTax$= totalCostNoTax$ + totalSalesTax$;               // Total Cost (with sales tax)
        
        totalSalesTax$ = totalSalesTax$*100;                    // The Total Sales Tax
        totalSalesTax$ = (double)((int)totalSalesTax$);
        totalSalesTax$ = totalSalesTax$ / 100; 
        
        totalCostWithTax$ = totalCostWithTax$*100;              // The Total Cost, including Sales Tax.
        totalCostWithTax$ = (double)((int)totalCostWithTax$);
        totalCostWithTax$ = totalCostWithTax$ / 100;

        
        
        System.out.println(" The total cost of purchase is :  $" + totalCostNoTax$ + ""); // Printing out the 
        System.out.println(" " );                                                       // information about 
        System.out.println(" The total sales tax on the purchase is : $"+totalSalesTax$); // the purchase. 
        System.out.println(" " );
        System.out.println(" The total cost (including sales tax) is :  $" + totalCostWithTax$ );
        
        
        
   }
} // end of program