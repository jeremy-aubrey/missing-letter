
public class MissingLetter {
	public static void main(String[] args) {
	
		String stubStr = "test";
		System.out.println(findMissingLetter(stubStr));
		
	}
	
	public static char findMissingLetter(String str) {
		char missingLetter = str.charAt(0);
		return missingLetter;
	}


}