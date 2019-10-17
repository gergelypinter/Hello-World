package Palindrom;

public class Word {
	
	private String word;

	public Word(String word) {
		super();
		this.word = word;
	}
	
	public boolean isPalindrom( ) {
		String[] wordInArray= word.split("");
		int length=wordInArray.length;
		int correctWordLength=0;
		//System.out.println(word);
		
		for(int i=0;i <length;i++) {
			if(wordInArray[i].equals(wordInArray[length-1-i])) {
				correctWordLength++;
				
				if(correctWordLength == length) {
					return true;
				}
				
			}
			
		}
		return false;
	}

	public String getWord() {

		return word;
	}
}
