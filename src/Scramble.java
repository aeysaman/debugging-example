import java.util.List;

public class Scramble {

	public static void main(String[] args) {
		String test = "ABRACADABRA";
		String answer = "BARCADABARA";
		String scrambledWord = scrambleWord(test);
		
		if(scrambledWord.compareTo(answer) == 0) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("WRONG!");
		}
	}
	
	public static String scrambleWord(String word) {
		String upperCaseWord = word.toUpperCase();
		String scrambledWord = "";
		
		int i = 0;
		while(i < upperCaseWord.length() - 1) {
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
		
		if(i == upperCaseWord.length() - 1) {
			scrambledWord += upperCaseWord.charAt(i);
		}
		
		return scrambledWord;
	}
	
	public static void scrambleOrRemove(List<String> wordList) {
		for(int i = 0; i < wordList.size(); i++) {
			String word = wordList.get(i);
			String scrambledWord = scrambleWord(word);
			
			// if the scrambledWord is the same, remove it
			if(scrambledWord.compareTo(word) == 0) {
				wordList.remove(i);
			}
			// otherwise replace it with the scrambled version
			else {
				wordList.set(i, scrambledWord);
			}
		}
	}
}
