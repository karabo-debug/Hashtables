// FindWeights class used to find all the possible combinations of weights
// Lehlohonolo Mosikili
// Last Modified: 13/04/2022

public class FindWeights {
    
    int[] weights = new int[9];
    
    // All possible digits to create combinations
    int[] digits = {0,1,2,3,4};
 
    // All possible combinations array
    int[] combinations = new int[1953125];
    
    // Counter to increment the index position of an array
    int count = 0;

    // Recursive method to find combinations of weights
    public void rec(int current, int numDigits){
        if(numDigits==0){
             // Stores each every number combination into an array -> int[] combinations
             combinations[count++] = current;
        }

        else{
            for(int x : digits){
                // Recursive call to generate combinations
                rec(current*10+x, numDigits-1);
            }
        }
    }
  
    // Method to convert every combination e.g 111111111 number to an array e.g. [1,1,1,1,1,1,1,1,1]
    public int[] weights(int n){
        
        String num = Integer.toString(combinations[n]);

        String[] str = num.split("");

        for(int j = 0 ; j < str.length ; j++){
            // Stores each an every weight of type int[]
            weights[j] = Integer.parseInt(str[j]);
        }
        return weights;
    }
}
