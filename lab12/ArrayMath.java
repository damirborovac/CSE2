
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
  
  public static boolean equals(int a[], int b[]){
      if (a.length != b.length){
       return false;}
     for (int i = 0; i < a.length; i++){
       if (a[i] != b[i]){
         return false;}
     return true; }
   }
   
   public static double[] addArrays(double a[], double b[]){
       
       int c[] = new int[a.length];
       for(int i=0; i<a.length; i++){
           c[i]= a[i]+b[i];
       }
       return c;
   }
      
        public static void main(String [] arg){
      
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
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
