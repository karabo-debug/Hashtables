/*
Both lines included for the execute method used to find the perfect hash
to read the names36.txt file

import java.util.*;

import java.nio.file.*;

*/

public class HashTableFunctions{
   // hash function weights
   // 9 integers, each in the range 0-5 to act as weights for the characters in the key

   int[] weights = {4, 2, 0, 3, 1, 0, 0, 2, 4}; // found perfect hash  NOTE: Comment this line when using my program
   
   // int iterateCombos = 0;  ***Line included for my program uncomment to use it! (To iterate thorough all possible combinations)

   // FindWeights fw = new FindWeights(); ***Line included for my program uncomment to use it! (Creates FindWeights object)

   // returns True if the hash table contains string s
   // return False if the hash table does not contain string s
   public boolean find ( String s, int h, int hashTableSize, String [] hashTableArray )
   {
      while(!hashTableArray[h].equals("")){
         if(hashTableArray[h]==s){
            return true;
         }
         h = (h+1) % hashTableSize;
      }
      return false;
   }

/* Method added to find the perfect hash function with 0 collisions, uncomment to use it!

   public void execute(){

      List<String> lines = null;

      try {
         lines = Files.readAllLines (Paths.get ("names36.txt"));
      } catch (Exception e) {
         System.out.println (e.toString ());
      }
      
      // Invokes the recursive function found in FindWeights class passing numDigits as 9
      fw.rec(0,9);


      // While loop to iterate through each and every combination of weights to find the perfect one
      while(iterateCombos < 1953125){

         HashTable h = new HashTable();
         
         // Passes changing weights to the HashTable class int[] weights variable wcontrolled by iterateCombos counter
         h.weights = fw.weights(iterateCombos);

         for (int i=0; i<lines.size(); i++){
            h.insert (lines.get (i));
         }

         if (h.getCollisions () <= 0){

            System.out.println ("Collisions Threshold Met! Collisions = "+ h.getCollisions());

            System.out.println(Arrays.toString(h.weights)); // prints out the weights

            break; // terminates the while loop if threshold is met i.e. when the collision is found
         }
         else {
            System.out.println("Collisions Threshold Not Met! Collisions = " + h.getCollisions());

            System.out.println(Arrays.toString(h.weights)); // prints out the weights

            n++;
         }
      }
   }
   */
}
