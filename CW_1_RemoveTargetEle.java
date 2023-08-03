package Aug1stWeek_HW;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CW_1_RemoveTargetEle {

	/*
	 * Pseudo code Pseudo Code: 1) Get the input array length and empty list 2) for
	 * loop to traverse from 0 to array length 3) if condition to check the target
	 * element with each index value 4) if not matches add it to the list and return
	 * the list
	 * 
	 */
	@Test
	public void test1()
	{
		Object[] actual = removeTargetEle(new int[] {2, 3, 3, 4, 5}, 3);
		//List<Integer> actual = removeTargetEle(Arrays.asList(new int[] {2, 3, 3, 4, 5}), 3);
		Assert.assertArrayEquals(actual, new Object[] {2,4,5});
		//Assert.assertEquals(actual, Arrays.asList(new int[] {2,4,5}));
		//Assert.assertArrayEquals(actual, null)
		//assertArrayEquals(actual, Arrays.asList(new int[] {2,4,5}))
	}

	public Object[] removeTargetEle(int[] input, int n) {
		int len = input.length;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			if (input[i] != n) {
				list.add(input[i]);
			}
		}
		return list.toArray();
	}

}
