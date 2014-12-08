 
 
 public class yeah{
 	public static void main(String [] args){
 		
 		
 		String [] SA = {"hello" , "goodbye"  , "jack" , "bye" , "yes" , "no" , "yoo"};

 		   		System.out.println(small(SA));
 	}
 		public static String small(String [] input){
 		 int minLength = input[0].length();
 		 int index = 0;

 		 for(int i = 1; i<input.length; i++){
 		   if(input[i].length()>minLength){
 		     index = i;
 		     minLength = input[i].length();
 		   }
 		 }
 		 return input[index];
 		}
 	}