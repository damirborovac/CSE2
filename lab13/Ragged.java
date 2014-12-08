import java.util.Arrays;

public class Ragged{
    
    public static void main(String [] args){
        
        int n = 5;
        int [][] input = new int [n][];
        
        for(int i = 0; i<n; i++){
                input[i] = new int [i*3+5];
            }
        
        for(int i = 0; i<input.length; i++){
            for(int j =0; j<input[i].length; j++){
                input[i][j] += (int)(Math.random()*40);
            }
        }
        System.out.println("The array before sorting: ");
        printArray(input);
        System.out.println();
        System.out.println("The array after sorting :");
        
        for (int[]output : input) {
        Arrays.sort(output);
                }
        printArray(input);
    }
        
    public static void printArray(int matrix[][]) {
    for (int[] row : matrix) 
        System.out.println(Arrays.toString(row));       
}
}
