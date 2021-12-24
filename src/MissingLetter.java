import java.util.*;

/*
A function that returns the first missing letter from the alphabet in a string.
The function creates a hashmap from the string and then checks another string containing
the letters of the alphabet against the keys of the hashmap. If a letter is found to be missing
it is returned as the missing letter. The time complexity is O(N).

Author: Jeremy Aubrey
Date: 12/23/2021
Purpose: Practice using HashMaps for increasing efficiency
 */

public class MissingLetter {
	public static void main(String[] args) {
		//Pangram - missing 'j' ("jumps" -> "bumps")
		String pangram = "The quick brown fox bumps over a lazy dog";
		
		//Find missing letter
		char missingLetter = findMissingLetter(pangram);
		
		//Display results
		System.out.println("Sentence: " + pangram);
		System.out.println(missingLetter == ' ' ? "No missing letter" : "Missing letter: " + missingLetter);
	}
	
	public static char findMissingLetter(String str) {
		//Result to be returned
		char missingLetter = ' ';
		
		//Hashmap to store letters of the string to be searched
		HashMap<Character, Boolean> hashmap = new HashMap<Character, Boolean>();
		
		//String of the alphabet to compare hashmap elements to
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		//Add argument String letters to hashmap
		for (int i = 0; i < str.length(); i++) {
			char c = Character.toLowerCase(str.charAt(i));
			hashmap.put(c, true);
		}
		
		//Check alphabet against hashmap keys,
		//return first missing letter found
		for (int i = 0; i < alphabet.length(); i++) {
			if(!hashmap.containsKey(alphabet.charAt(i))) {
				missingLetter = alphabet.charAt(i);
				break;
			}
		}
		
		return missingLetter;
	}
}