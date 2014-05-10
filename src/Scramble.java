import java.util.List;

public class Scramble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static String scrambleWord(String word) {
		String upperCaseWord = word.toUpperCase();
		String scrambledWord = "";
		
		int i = 0;
		while(i < upperCaseWord.length()) {
			char currentLetter = upperCaseWord.charAt(i);
			char nextLetter = upperCaseWord.charAt(i + 1);
			
			// scramble this current and next letter if applicable
			if(currentLetter == 'A' && nextLetter != 'A') {
				scrambledWord = (scrambledWord + nextLetter) + currentLetter;
				i += 2;
			}
			// otherwise check the next set of letters
			else {
				scrambledWord += currentLetter;
				i++;
			}
		}
		
		return scrambledWord;
	}
	
	public static void scrambleOrRemove(List<String> wordList) {
		
	}
}
