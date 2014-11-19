import java.util.Arrays;
import java.util.Scanner;

public class TestArrays{
    
    public static int findMax(int[] list){
        int max = 0;
        for(int i = 1; i<list.length; i++){
            if(list[i] > list[max]){
                max = i;
                    }
                }
        System.out.println("The max number is : " +list[max]);
        return max;
    }
    
        public static int findMin(int[] list){
        int min = 0;
        for(int i =1 ; i<list.length; i++){
            if(list[i] < list[min]){
                min = i;
                    }
                }
        System.out.println("The min number is : " +list[min]);
        return min;
    }
    
    public static int sum(int[] list){
        int sum = 0;
        for(int i =0; i<list.length; i++){
            sum += list[i];
        }
        System.out.println("The sum of the numbers is :" +sum);
        return sum;
        }

 public static void main(String[]args){
    
      Scanner input = new Scanner(System.in);
      int size=10;
      int array[]=new int[size];
      int counter=0;
      while(counter<size){
          System.out.println("Please enter 10 integers: " );
          array[counter++]=input.nextInt();
          }
      for(int i:array)
        System.out.println(i);
        
        findMax(array);
        findMin(array);
        sum(array);
      }
        }
  
