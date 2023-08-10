package cw_Aug8week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class KeyboardRow {

	/*
	 * Given an array of strings words, return the words that can be typed using
	 * letters of the alphabet on only one row of American keyboard like the image
	 * below. In the American keyboard: the first row consists of the characters
	 * "qwertyuiop", the second row consists of the characters "asdfghjkl", and the
	 * third row consists of the characters "zxcvbnm". Input Data: Example 1:
	 * 
	 * Input: words = ["Hello","Alaska","Dad","Peace"] Output: ["Alaska","Dad"]
	 * Example 2:
	 * 
	 * Input: words = ["omk"] Output: [] Example 3:
	 * 
	 * Input: words = ["adsdf","sfd"] Output: ["adsdf","sfd"]
	 * 
	 * Pseudo Code Create an string array and assign all the keyboardStrings to that
	 * array boo foreach loop to traverse from each words in the string Char[] chr =
	 * word.toCharArray(); foreach loop to traverse each char in the first word
	 * foreach loop to traverse each row of the kerboardStrings array if
	 * row.indexOf(chr) == -1 break;
	 * 
	 * 
	 */

	@Test
	public void test1() {
		List<String> expected = Arrays.asList(new String[] { "Alaska", "Dad" });
		//expected.add("Lion");
		// keyboardRow(new String[] {"Hello","Alaska","Dad","Peace"})
		Assert.assertEquals(expected, keyboardRow(new String[] {"Hello", "Alaska", "Dad", "Peace"}));
		//Assert.assertEquals(expected,);	
	}
	
	@Test
	public void test2() {
		List<String> expected = Arrays.asList(new String[] {});
		//expected.add("Lion");
		// keyboardRow(new String[] {"Hello","Alaska","Dad","Peace"})
		Assert.assertEquals(expected, keyboardRow(new String[] {"omk"}));
		//Assert.assertEquals(expected,);	
	}
	
	@Test
	public void test3() {
		List<String> expected = Arrays.asList(new String[] {"adsdf","sfd"});
		//expected.add("Lion");
		// keyboardRow(new String[] {"Hello","Alaska","Dad","Peace"})
		Assert.assertEquals(expected, keyboardRow(new String[] {"adsdf","sfd"}));
		//Assert.assertEquals(expected,);	
	}

	public List<String> keyboardRow(String[] words) {
		String[] keyboardStrings = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };
		List<String> result = new ArrayList<String>();

		// ["Hello","Alaska","Dad","Peace"]
		for (String word : words) {
			// Hello
			String formattedWord = word.toUpperCase();
			
			for (String row : keyboardStrings) {
				//String convrtedRow = row.toUpperCase();
				boolean isExist = true;
				for (char ch : formattedWord.toCharArray()) {
					if (row.indexOf(ch) == -1) {
						isExist = false;
						break;
					}
				}
				if (isExist) {
					result.add(word);
					break;
				}

			}
		}
		return result;
	}

}
