import java.util.*;

public class MissingLetter {
	public static void main(String[] args) {
		//Pangram - missing 'j' ("jumps" -> "bumps")
		String pangram = "The quick brown fox jumps over a lazy dog";
		
		//Find missing letter
		char missingLetter = findMissingLetter(pangram);
		
		//Display results
		System.out.println("Sentence: " + pangram);
		System.out.println(missingLetter == ' ' ? "No missing letter" : "Missing letter: " + missingLetter);
	}
	
	public static char findMissingLetter(String str) {
		//Result to be returned
		char missingLetter = ' ';
		
		//Hashmap to store letters of string to be searched
		HashMap<Character, Boolean> hashmap = new HashMap();
		
		//String of alphabet to compare hashmap elements to
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		//Add string letters to hashmap
		for (int i = 0; i < str.length(); i++) {
			char c = Character.toLowerCase(str.charAt(i));
			hashmap.put(c, true);
		}
		
		//Check alphabet against hashmap keys
		for (int i = 0; i < alphabet.length(); i++) {
			if(!hashmap.containsKey(alphabet.charAt(i))) {
				missingLetter = alphabet.charAt(i);
				break;
			}
		}
		
		return missingLetter;
	}
}