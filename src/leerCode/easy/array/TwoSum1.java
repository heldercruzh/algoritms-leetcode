package leerCode.easy.array;

import java.util.Arrays;

public class TwoSum1 {

/*
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
	
	public static void main(String[] args) {
		
		TwoSum1 twoSum1 = new TwoSum1();	
		
		System.out.println("testOneNambers: "+twoSum1.testOneNambers());
			
		System.out.println(
				Arrays.toString(twoSum1.execute(new int[]{2,7,11,15}, 9))
		);
		
		System.out.println("testTwoNambers: "+twoSum1.testTwoNambers()); 
			
		System.out.println(
				Arrays.toString(twoSum1.execute(new int[]{3,2,4}, 6))
		);
		
		System.out.println("testThreeNambers: "+twoSum1.testThreeNambers()); 
		
		System.out.println(
				Arrays.toString(twoSum1.execute(new int[]{3,2,4}, 6))
		);
		
	}
	
	public int[] execute(int[] nums, int target) {
		
		int nunsPrevious = nums[0];		
		
		for(int i = 1; i < nums.length; i++) {
						
			if(nums[i] + nunsPrevious == target) {												
				return new int[]{i - 1, i};
			}
										
			nunsPrevious = nums[i];
		}
				
		return new int[]{};
	} 
	
	public boolean testOneNambers() {
		return "[0, 1]".equals(Arrays.toString(execute(new int[]{2,7,11,15}, 9)));
	}
	
	public boolean testTwoNambers() {		
		return "[1, 2]".equals(Arrays.toString(execute(new int[]{3,2,4}, 6)));
	}
	
	public boolean testThreeNambers() {		
		return "[0, 1]".equals(Arrays.toString(execute(new int[]{3,3}, 6)));
	}
	
	
	
	
	
}
