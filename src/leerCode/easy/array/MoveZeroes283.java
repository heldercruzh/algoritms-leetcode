package leerCode.easy.array;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.


Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Example 2:

Input: nums = [0]
Output: [0]
*/

public class MoveZeroes283 {
	
	public static void main(String[] args) {
		
		MoveZeroes283 obj = new MoveZeroes283();		
		System.out.println(Arrays.toString(obj.moveZeroes(new int[]{0,1,0,3,12})));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(Arrays.toString(obj.moveZeroes(new int[]{0})));
		System.out.println("Teste2: "+obj.testTwo());
						
	}
	
	public int[] moveZeroes(int[] nums) {
		
		Arrays.sort(nums);
			
		int countZeroes = 0;
		
		for(int i = 0; i < nums.length; i++) {			
			if(nums[i] == 0) {
				countZeroes++;
			} else {
				nums[i - countZeroes] = nums[i];
				nums[i] = 0;
			}			
		}
		return nums;
    }
	
	public boolean testOne() {
		return "[1, 3, 12, 0, 0]".equals(Arrays.toString(moveZeroes(new int[] {0,1,0,3,12})));
	}
	
	public boolean testTwo() {
		return "[0]".equals(Arrays.toString(moveZeroes(new int[] {0})));
	}
	
}
	