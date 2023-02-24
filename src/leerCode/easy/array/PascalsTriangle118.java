package leerCode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle118 {

/*
 Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/
	
	
	public static void main(String[] args) {
		
		PascalsTriangle118 obj = new PascalsTriangle118();
		
		System.out.println(obj.generate(5));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.generate(1));
		System.out.println("Teste2: "+obj.testTwo());
	}
	
	public List<List<Integer>> generate(int numRows) {
        	
		/* mock
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			result.add(Arrays.asList(1));
			result.add(Arrays.asList(1, 1));
			result.add(Arrays.asList(1, 2, 1));
			result.add(Arrays.asList(1, 3, 3, 1));
			result.add(Arrays.asList(1, 4, 6, 4, 1));
		*/
		
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i = 0; i < numRows; i++) {
						
			if(i == 0) {
				result.add(Arrays.asList(1));
				continue;
			} 
			
			if(i == 1) {
				result.add(Arrays.asList(1, 1));
				continue;
			}
			
			if(i >= 2) {
				
				List<Integer> newline = new ArrayList<>();
								
				for(int j = 0; j < result.get(i - 1).size() + 1; j++) {
					
					// If is the first or the last
					if(j == 0) {
						newline.add(1);
						continue;
					} 
					
					if(j == result.get(i - 1).size()) {
						newline.add(1);
						continue;
					}
										
					newline.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));						
										
				}
				
				result.add(newline);
			}			
		}
		
		return result;
				
    }
	
	public boolean testOne() {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(Arrays.asList(1));
		result.add(Arrays.asList(1, 1));
		result.add(Arrays.asList(1, 2, 1));
		result.add(Arrays.asList(1, 3, 3, 1));
		result.add(Arrays.asList(1, 4, 6, 4, 1));
		
		return result.equals(generate(5));
	}
	
	public boolean testTwo() {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(Arrays.asList(1));
		return result.equals(generate(1));
	}
	
}
