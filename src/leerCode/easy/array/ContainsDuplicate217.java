package leerCode.easy.array;

public class ContainsDuplicate217 {

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
	public static void main(String[] args) {
		
		ContainsDuplicate217 obj = new ContainsDuplicate217();		
		System.out.println(obj.majorityElement(new int[]{1,2,3,1}));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.majorityElement(new int[]{1,2,3,4}));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.majorityElement(new int[]{1,1,1,3,3,4,3,2,4,2}));
		System.out.println("Teste3: "+obj.testThree());
		
	}
	
	public boolean majorityElement(int[] nums) {
		
		int countDuplicates = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {				
				if(nums[i] == nums[j]) {
					countDuplicates++;
					
					if(countDuplicates >= 2) {
						return true;
					}
				}				
			} 	
			countDuplicates = 0;
		}
		
        return false;
    }
	
	public boolean testOne() {
		return majorityElement(new int[] {1,2,3,1}) == true;
	}
	
	public boolean testTwo() {
		return majorityElement(new int[] {1,2,3,4}) == false;
	}
	
	public boolean testThree() {
		return majorityElement(new int[] {1,1,1,3,3,4,3,2,4,2}) == true;
	}
	
}