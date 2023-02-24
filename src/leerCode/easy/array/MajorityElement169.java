package leerCode.easy.array;

public class MajorityElement169 {

	public static void main(String[] args) {
		
		MajorityElement169 obj = new MajorityElement169();		
		System.out.println(obj.majorityElement(new int[]{3,2,3}));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.majorityElement(new int[]{2,2,1,1,1,2,2}));
		System.out.println("Teste2: "+obj.testTwo());
				
	}
	
	public int majorityElement(int[] nums) {		
		int leastQtdDuplicates = 0;
		int currentQtdDuplicates = 0;
		int indiceMandatory = 0;
		
		for(int i = 0; i < nums.length; i++) {		
			for(int j = 0; j < nums.length; j++) {		
				if(nums[i] == nums[j]) {
					currentQtdDuplicates++;
				}						
			}			
			if(leastQtdDuplicates < currentQtdDuplicates) {
				leastQtdDuplicates = currentQtdDuplicates;	
				indiceMandatory = i;
			}			
			currentQtdDuplicates = 0;						
		}				
        return nums[indiceMandatory];
    }
	
	public boolean testOne() {
		return majorityElement(new int[] {3,2,3}) == 3;
	}
	
	public boolean testTwo() {
		return majorityElement(new int[] {2,2,1,1,1,2,2}) == 2;
	}
	
}
