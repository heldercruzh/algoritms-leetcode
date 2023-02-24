package leerCode.easy.binaryTree.binarysearch;

/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
*/
public class BinarySearch700 {
	
	public static void main(String[] args) {
		
		BinarySearch700 obj = new BinarySearch700();		
		System.out.println(obj.search(new int[]{-1,0,3,5,9,12}, 9));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.search(new int[]{-1,0,3,5,9,12}, 2));
		System.out.println("Teste2: "+obj.testTwo());
						
	}
	
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			
			int mid = right + left / 2;
			
			if(nums[mid] == target) {
				return mid;
			}
			
			if(nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid -1;
			}
			
		}
		
		return -1;
    }
	
	public boolean testOne() {
		return search(new int[]{-1,0,3,5,9,12}, 9) == 4;
	}
	
	public boolean testTwo() {
		return search(new int[]{-1,0,3,5,9,12}, 2) == -1;
	}	
	
}

/*
 public int search(int[] nums, int target) {
		int low =  0;
		int high = nums.length - 1;
				
		while(low <= high) {
			int mid = high - low / 2;
			
			if(nums[mid] == target) {
				return mid;
			}
			
			if(nums[mid] < target) {
				low = mid+1;
			} else {
				high = mid -1;
			}
		}		
		
        return -1;
    }
 */
