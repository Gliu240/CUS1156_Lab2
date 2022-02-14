/* Project:Lab2 Git
Class:Unique Words
Author: Goden Liu
Date: 2/14/22
Description:This file completes the rest of the count unique words methods.
/*

package Lab2;
import java.util.ArrayList;

public class UniqueWords {
	/**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {	
    	  boolean unique= true;
    	  for (int j = 0; j < i; j++)
    	  {
    		  if(list.get(i) == list.get(j)) {
    			unique = false;
    			break;
    		  }
    	  }
    	  if(unique) {
    		  count++;
    	  }
      }
      
	  return count;
   }

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
