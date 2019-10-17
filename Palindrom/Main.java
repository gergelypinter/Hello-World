package Palindrom;

/*1. Keressük meg egy paraméterként kapott szöveg összes palindrom felosztását

Például az "aab" bemenetre az alábbi eredményt adjuk:

[
    ["aa","b"],
    ["a","a","b"]
  ]*/

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> palindroms= new ArrayList<>();
		System.out.println(args[0]);
		
		String input = args[0];
		
		for(int i=0; i<input.length();i++) {
			for(int j=i;j<input.length();j++) {
				Word word = new Word( input.substring(i, j+1));
				//System.out.println(word);
				if (word.isPalindrom()) {
					palindroms.add(word.getWord());
				}
			}
		}
		
		for(String pal : palindroms) {
			System.out.println(pal);
		}
		
	}
	

}
