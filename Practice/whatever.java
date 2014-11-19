import java.util.Scanner;

public class whatever{
    
    public static void main(String[] args){
        
        Scanner scan =new Scanner(System.in);
        System.out.println("enter  " );
        int k = scan.nextInt();
        int i = 2;
           
       do{
           System.out.println("i: " +i++);
    
       }while(i<k);
       
    }
}