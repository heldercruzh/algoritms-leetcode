package leerCode.easy.math;

import java.util.Arrays;

public class PlusOne66 {
	
	public static void main(String[] args) {
		
		PlusOne66 obj = new PlusOne66();		
		System.out.println(Arrays.toString(obj.plusOne(new int[] {1,2,3})));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(Arrays.toString(obj.plusOne(new int[] {4,3,2,1})));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(Arrays.toString(obj.plusOne(new int[] {9})));
		System.out.println("Teste2: "+obj.testThree());
				
	}
	
	public int[] plusOne(int[] digits) {
        
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;

		
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

/*
public int[] plusOne(int[] digits) {
        
		int digitoAdd = digits[digits.length - 1] + 1;
		int digitsLenght = String.valueOf(digitoAdd).length();
		
		
		if(digitsLenght <= 1) {
			digits[digits.length - 1] = digitoAdd;			
			return digits;
		} else {
			int[] newDigits = new int[digits.length - 2 + digitsLenght];
			
			for (int i = 0; i < digits.length; i++) {
				newDigits[i] = (digits.+""+digitoAdd).charAt(i);
			}
			
			return newDigits;
		}
		
    }
	

*/