package Aug1stWeek_HW;

import org.junit.Test;

import junit.framework.Assert;

public class HW_3rd_LeetCodeBank {

	@Test
	public void test1() {
		int actual = leetCodeBank(20);
		Assert.assertEquals(actual, 96);

	}

	@Test
	public void test2() {
		int actual = leetCodeBank(10);
		Assert.assertEquals(actual, 37);

	}

	public int leetCodeBank(int n) {
		int sum = 0;
		int flag = 1;
		int j = 1;
		int cnt = 1;

		for (int i = 1; i <= n; i++) {
			if (i == (flag + 7)) {
				flag = flag + 7;
				j++;
				cnt = j;
			}

			sum = sum + cnt;
			cnt++;

		}

		return sum;
	}

}
