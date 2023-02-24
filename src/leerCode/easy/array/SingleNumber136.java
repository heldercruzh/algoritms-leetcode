package leerCode.easy.array;

public class SingleNumber136 {

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/
	
	public static void main(String[] args) {
		
		SingleNumber136 obj = new SingleNumber136();		
		System.out.println(obj.singleNumber(new int[]{2, 2, 1}));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.singleNumber(new int[]{4,1,2,1,2,2,9}));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.singleNumber(new int[]{1}));
		System.out.println("Teste3: "+obj.testThree());
		
	}
	
	public int singleNumber(int[] nums) {		 		
		for(int i = 0; i < nums.length; i++) {			
			boolean blSingleNumber = true;			
			for(int j = 0; j < nums.length; j++) {				
				if(i != j) {					
					if(nums[i] == nums[j]) {
						blSingleNumber = false;
						break;
					}					
				}				
			}			
			if(blSingleNumber) {
				return nums[i];
			}						
		}		
		return 0; 
    }
	
	public boolean testOne() {
		return singleNumber(new int[] {2, 2, 1}) == 1;
	}
	
	public boolean testTwo() {
		return singleNumber(new int[] {4,1,2,1,2}) == 4;
	}
	
	public boolean testThree() {
		return singleNumber(new int[] {1}) == 1;
	}
	
	/*
	 Minha implementação OK
	  
	 public int singleNumber(int[] nums) {		 		
		int ans=0; //since XOR with 0 returns same number 		        
		 for(int i=0; i < nums.length; i++){		    
			 ans ^= nums[i];  // ans = (ans) XOR (array element at i) 		 
		 }		 
		 return ans;  
     }
	  
	 public int singleNumber(int[] nums) {		
		for(int i = 0; i < nums.length; i++) {			
			boolean blSingleNumber = true;			
			for(int j = 0; j < nums.length; j++) {				
				if(i != j) {					
					if(nums[i] == nums[j]) {
						blSingleNumber = false;
						break;
					}					
				}				
			}			
			if(blSingleNumber) {
				return nums[i];
			}						
		}		
        return 0;
    }
	 */
	
	

}
