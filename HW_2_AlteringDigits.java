package Aug1stWeek_HW;

import org.junit.Assert;
import org.junit.Test;

public class HW_2_AlteringDigits {
	
	/* Pseudo Code
	 * Convert the integer to Str (String.valueOf(num))
	 * Convert the string to char array
	 * Initialize the boolean variable assign the value as true
	 * Initialize the integer variable result as 0
	 * for loop to traverse from 0 to charArr length
	 * int val = Character.toGetNumericVal(charArr(i))
	 * if (boolean variable is true) then res = res+val
	 * else res = res - val
	 * set the boolean variable to false, and repeat the process till charArr length
	 * return the result
	 *  
	 */
	
	@Test
	public void test1()
	{
		int actual = alteringDigits(886996);
		Assert.assertEquals(actual, 0);
	}

	@Test
	public void test2()
	{
		int actual = alteringDigits(521);
		Assert.assertEquals(actual, 4);
	}
	
	@Test
	public void test3()
	{
		int actual = alteringDigits(111);
		Assert.assertEquals(actual, 1);
	}
	
	public int alteringDigits(int num)
	{
		String str = String.valueOf(num);
		char[] charArray = str.toCharArray();
		boolean add = true;
		int sum = 0;
		
		for (int i = 0; i < charArray.length; i++)
		{
			int val = Character.getNumericValue(charArray[i]);
			if(add) {
				sum = sum + val;
			}else {
				sum = sum - val;
			}
			add = !add;
		}
		
		return sum;
	}
}
