package Aug1stWeek_HW;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class HW_1_RomanToInt {

	/*
	 * Pseudo Code Get the Input String and find out the length of the str Create a
	 * Map and add all the key and values of the Roman letters Symbol Value I 1 V 5
	 * X 10 L 50 C 100 D 500 M 1000 For loop to traverse from reverse order to do
	 * subtract if any val is lesser than prev val Initialize two variable, result
	 * as 0 and prev val as 0 initialize a variable name currentChar and assign the
	 * input.charAt(i) initialize a variable to assign the current val of the
	 * currChar using map.get(currentChar) if (currentVal < prevVal) then result =
	 * result - currVal else result = result + currVal Assign prevVal = currVal
	 * return result
	 */

	@Test
	public void test1() {
		int actual = romanToInt("MCMXCIV");
		Assert.assertEquals(actual, 1994);
	}

	@Test
	public void test2() {
		int actual = romanToInt("III");
		Assert.assertEquals(actual, 3);
	}

	@Test
	public void test3() {
		int actual = romanToInt("LVIII");
		Assert.assertEquals(actual, 58);
	}

	public int romanToInt(String input) {
		int len = input.length();
		Map<Character, Integer> romanVal = new HashMap<Character, Integer>();
		romanVal.put('I', 1);
		romanVal.put('V', 5);
		romanVal.put('X', 10);
		romanVal.put('L', 50);
		romanVal.put('C', 100);
		romanVal.put('D', 500);
		romanVal.put('M', 1000);
		
		int res = 0;
		int prevVal = 0;

		for (int i = len - 1; i >= 0; i--) {
			char currChar = input.charAt(i);
			int currVal = romanVal.get(currChar);
			if (currVal < prevVal) {
				res = res - currVal;
			} else {
				res = res + currVal;
			}
			prevVal = currVal;
		}

		return res;
	}
}
