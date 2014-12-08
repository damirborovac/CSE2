
public class ArrayMath{

  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double a[], double b[]){
    boolean answer = true;
      if (a.length != b.length){
       answer = false; }
     for (int i = 0; i < a.length; i++){
       if (a[i] != b[i]){
         answer = false;}
         }
      return answer;
   }
   
   public static double[] addArrays(double a[], double b[]){
  double [] c = new double[6];
      if(b.length>a.length){
        for(int i=0; i<6; i++){
           c[i]= b[i];
           for(int j = 0; j<3; j++){
             c[i] = a[j]+b[i];
           }} }
      else{
       for(int i=0; i<6; i++){
           c[i]= a[i];
           for(int j = 0; j<3; j++){
             c[i]=a[i]+b[j];
           }
   } }
   return c;
   }
      
  public static void main(String [] arg){ // main method
      
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      u[]={2.3, 12, 14};
      
    double v[]=addArrays(x,y);
    
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  }





{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}