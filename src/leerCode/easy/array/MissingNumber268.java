package leerCode.easy.array;

import java.util.Arrays;

public class MissingNumber268 {
	
	public static void main(String[] args) {
		
		MissingNumber268 obj = new MissingNumber268();		
		System.out.println(obj.majorityElement(new int[]{3,0,1}));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.majorityElement(new int[]{0,1}));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.majorityElement(new int[]{9,6,4,2,3,5,7,0,1}));
		System.out.println("Teste3: "+obj.testThree());
		
	}
	
	public int majorityElement(int[] nums) {
		//Binary Search
		Arrays.sort(nums);
		
		for(int i = 1; i < nums.length; i++) {			
			if( nums[i] - nums[i - 1] > 1) {							
				return nums[i - 1] + 1;				
			}			
		}	
		
		if(nums.length == 2) {
			return nums[1] + 1;					
		}	
		
	    return 0;
		
		
    }
	
	public boolean testOne() {
		return majorityElement(new int[] {3,0,1}) == 2;
	}
	
	public boolean testTwo() {
		return majorityElement(new int[] {0,1}) == 2;
	}
	
	public boolean testThree() {
		return majorityElement(new int[] {9,6,4,2,3,5,7,0,1}) == 8;
	}
	
	/*
	
	//Binary Search
	public int missingNumber(int[] nums) { //binary search
	    Arrays.sort(nums);
	    int left = 0, right = nums.length, mid= (left + right)/2;
	    while(left<right){
	        mid = (left + right)/2;
	        if(nums[mid]>mid) right = mid;
	        else left = mid+1;
	    }
	    return left;
	}  
	  
	//2.SUM  
	public int missingNumber(int[] nums) { //sum
	    int len = nums.length;
	    int sum = (0+len)*(len+1)/2;
	    for(int i=0; i<len; i++)
	        sum-=nums[i];
	    return sum;
	}  
	  
	  
	//1.XOR
	public int missingNumber(int[] nums) { //xor
	    int res = nums.length;
	    for(int i=0; i<nums.length; i++){
	        res ^= i;
	        res ^= nums[i];
	    }
	    return res;
	}  
	  
	  
	  
	//My Solicion
	Arrays.sort(nums);
	
	for(int i = 1; i < nums.length; i++) {			
		if( nums[i] - nums[i - 1] > 1) {							
			return nums[i - 1] + 1;				
		}			
	}	
	
	if(nums.length == 2) {
		return nums[1] + 1;					
	}	
	
    return 0;*/
	
}