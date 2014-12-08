/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] args){
      
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
      System.out.println(out);
      System.out.println(n);
      System.out.println(k);
         break;
      default: out+=40;
          n/=3;
          k-=7;  
          System.out.println(out);
          System.out.println(n);
          System.out.println(k);// there is no break here so as long as 
    } // so k = 53 in this case and n = 13;
    if(n*k%12< 12){
      n-=20;
      out+=n;   // out = 40 - 7 
      System.out.println(out);
      System.out.println(n); // n = - 7 
      System.out.println(k); // k = 53 
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println(out);
      System.out.println(n);
      System.out.println(k); // k = 53; 
    }
    else {
      n=45;
      out+=n+k;  // out = 40-798 
      System.out.println(out);
      System.out.println(n); // n = 45
      System.out.println(k); // k = 53
      int p = k/9;
      System.out.println(p);
    }

    switch(n+k){   
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:  // STARTS here as n + k = 98.
        n/=5;  // n == 9
        k/=9; // k = 5 
      default: // then goes here 
        n-=3; // n = 6
        k-=4; // k = 0; 
    }
    out+=1/n + 1/k;    // 1/n = 0 and 1/k = 1 , therefore the 1 at the end of out
    System.out.println(out);
  }
}

/*
 * Error report: line 49 has a RE has it divides by zero.
 * the system crashes at the very last line of the default 
 * as the k value reaches 0 , hence makes the program crash
 *  and experience a runtime error due to division by zero. 
 * 
 * 
 */

