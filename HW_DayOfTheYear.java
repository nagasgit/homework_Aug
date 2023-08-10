package cw_Aug8week;

import org.junit.Assert;
import org.junit.Test;

public class HW_DayOfTheYear 
{
	/**
	 * Test Data:
	 *  Example 1:
		Input: date = "2019-01-09"
		Output: 9
		
		Example 2:
		Input: date = "2019-02-10"
		Output: 41
	 * 
	 * 
	 * Pseudo Code:
	 * Length of the string
	 * return substring(last two index)
	 */
	
	@Test
	public void test1()
	{
		String actual = dayOfTheYear("2019-01-09");
		Assert.assertEquals(actual, "09");
	}
	
	@Test
	public void test2()
	{
		String actual = dayOfTheYear("2019-02-10");
		Assert.assertEquals(actual, "10");
	}
	
	public String dayOfTheYear(String date)
	{
		int len = date.length();
		//System.out.println(date.substring(len-2, len));
		
		
		return date.substring(len-2, len);
	}
	
}
