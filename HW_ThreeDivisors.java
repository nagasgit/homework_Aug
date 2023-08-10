package cw_Aug8week;

import org.junit.Assert;
import org.junit.Test;

public class HW_ThreeDivisors {
	/**
	 * Test Data: n = 4 (Positive) return true n = 3 (Negative) return false n = 2
	 * (Negative) return false
	 * 
	 * Pseudo Code: Initialize the variable name count as 0, For loop to traverse from
	 * i to n (i = 1), if condition to check (n % i) == 0, then count++, if count > 3
	 * then return false else continue;
	 **/

	@Test
	public void test1() {
		boolean actual = threeDivisors(4);
		Assert.assertEquals(actual, true);
	}

	@Test
	public void test2() {
		boolean actual = threeDivisors(3);
		Assert.assertEquals(actual, false);
	}

	@Test
	public void test3() {
		boolean actual = threeDivisors(2);
		Assert.assertEquals(actual, false);
	}

	public boolean threeDivisors(int n) {
		int count = 0;
		if (n < 3)
			return false;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				if (count > 3) {
					return false;
				}
			}
		}
		if (count == 3) {
			return true;
		}
		return false;
	}
}
