package leerCode.easy.array;

import java.util.Arrays;

public class PlusOne66 {

	
/*
	 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/
	
	public static void main(String[] args) {
		
		PlusOne66 obj = new PlusOne66();
				
		System.out.println(Arrays.toString(obj.plusOne(new int[] {1,2,3})));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(Arrays.toString(obj.plusOne(new int[] {4,3,2,1})));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(Arrays.toString(obj.plusOne(new int[] {9})));
		System.out.println("Teste3: "+obj.testThree());

	}
	
	public int[] plusOne(int[] digits) {
    
		if(digits.length == 0) {
			return new int[] {};
		}
		
		int lastDigit = digits[digits.length - 1];
		
		if(lastDigit + 1 < 9 && digits.length > 1) {
			digits[digits.length - 1] = digits[digits.length - 1] + 1;
			return digits;
		} 
		
		int[] digitsResult = new int[digits.length + 1];
		
		for(int i = 0; i < digits.length; i++) {
			digitsResult[i] = digits[i];
		}
		
		digitsResult[digits.length - 1] = 1;
		digitsResult[digits.length] = 0;
				
		return digitsResult;
		
    }
	
	
	public boolean testOne() {
		return "[1, 2, 4]".equals(Arrays.toString(plusOne(new int[] {1,2,3})));
	}
	
	public boolean testTwo() {
		return "[4, 3, 2, 2]".equals(Arrays.toString(plusOne(new int[] {4,3,2,1})));
	}
	
	public boolean testThree() {
		return "[1, 0]".equals(Arrays.toString(plusOne(new int[] {9})));
	}

}
