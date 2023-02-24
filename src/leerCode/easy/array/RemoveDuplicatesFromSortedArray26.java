package leerCode.easy.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray26 {

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
	int[] expectedNums;
	
	public static void main(String args[]) {
		
		RemoveDuplicatesFromSortedArray26 obj = new RemoveDuplicatesFromSortedArray26();
				
		System.out.println(obj.removeDuplicates(new int[] {1,1,2}));
		System.out.println(Arrays.toString(obj.expectedNums));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
		System.out.println(Arrays.toString(obj.expectedNums));
		System.out.println("Teste2: "+obj.testTwo());
				
	}
	
	public int removeDuplicates(int[] nums) {
     
		if(nums.length==0){
            return 0;
        }
        else{
            int k=0;
            for(int i=0;i<nums.length;i++){
                if(nums[k]!=nums[i]){
                    nums[++k] = nums[i];
                }
            }
            
            expectedNums = nums;
            
            return k+1;
        }
		
    }
	
	
	
	
	public boolean testOne() {
				
		return (removeDuplicates(new int[] {1,1,2}) == 2) &&
				"[1, 2]".equals(Arrays.toString(expectedNums));
		
	}
	
	public boolean testTwo() {
		
		return (removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}) == 5) &&
			   "[1, 1, 2, 3, 4]".equals(Arrays.toString(expectedNums));
		
	}
	
	
	/*
	 public int[] expectedNums(int[] nums) {
		
		int lastNumber = nums[nums.length - 1];
		int lastNumberJ = 0;
		int lastNumberJJ = 0;
		int countDuplicates = 1;
		
		for(int i = nums.length - 2; i >= 0; i--) {
						
			if(nums[i] == lastNumber) {
				
				for(int j = nums.length - 1; j >= 0; j--) {
										
					if(j >= nums.length - countDuplicates) {
						lastNumberJ = nums[j];
						nums[j] = 0;
					} else {	
						if(lastNumberJ != nums[j]) {
							lastNumberJJ = nums[j];
							nums[j] = lastNumberJ;	
							lastNumberJ = lastNumberJJ;
						} 												
					}
									
				}
				
				countDuplicates++;
				
								
			} else {
				lastNumber = nums[i];
			}
			
		}
		
		return nums;
	}
	 */
	
}
