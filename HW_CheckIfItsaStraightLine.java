package cw_Aug8week;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class HW_CheckIfItsaStraightLine {
	
	/* Problem Stmt:
	 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
	 * Check if these points make a straight line in the XY plane.
	 * 
	 * Test Data:
	 * 1) Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
		  Output: true
	 * 
	 * 2) Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
		  Output: false
	 * 
	 * 
	 * Pseudo Code:
	 * 1) get the length of the coordinates
	 * 2) Initialize 4 variable, x1 ([0],[0]) Y1 ([0],[1]), x2 ([1,0]), y2 ([1,1])
	 * 3) For loop to traverse from 2 to coordinates length
	 * 4) if ((y2-y1)/(x2-x1) != ((x-x2)/(y-y2))
	 * 5) return false
	 * 6) return true finally if all coordinates matches
	 * 
	 */
	
	@Test
	public void test1()
	{
		boolean actual = checkIfItsStraightLine(new int[][] {{1,2}, {2,3}, {3,4}, {4,5}, {5,6}});
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void test2()
	{
		boolean actual = checkIfItsStraightLine(new int[][] {{1,2}, {3,3}, {4,4}, {4,5}, {5,6}});
		Assert.assertEquals(actual, false);
	}
	
	public boolean checkIfItsStraightLine(int[][] coordinates)
	{
		// [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
		int len = coordinates.length;
		System.out.println(len);
		
		int x1 = coordinates[0][0];  //1
		int y1 = coordinates[0][1];  //2
		int x2 = coordinates[1][0];  //2
		int y2 = coordinates[1][1];  //3
		
		for (int i = 2; i < coordinates.length; i++) {
			
			int x = coordinates[i][0];
			int y = coordinates[i][1];
			
			if ((y2-y1)/(x2-x1) != (y-y2)/(x-x2)) {
				return false;
			}
			
		}
		
		
		return true;
	}
	
	

}
