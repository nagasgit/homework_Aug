package Aug1stWeek_HW;

import org.junit.Assert;
import org.junit.Test;

public class CW_2_ReverseInt {

	
	@Test
	public void test1()
	{
		int actual = reverseInt(200);
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void test2()
	{
		int actual = reverseInt(221);
		Assert.assertEquals(actual, 122);
	}
	
	public int reverseInt(int num) {

		String str = "";
		while (num > 0) {

			int rem = num % 10;
			if (rem > 0) {
				str = str + rem;
			} 
			num = num / 10;
		}

		return Integer.parseInt(str);
	}

}
