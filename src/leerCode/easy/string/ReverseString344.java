package leerCode.easy.string;

import java.util.Arrays;

/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
public class ReverseString344 {

	public static void main(String[] args) {
		
		ReverseString344 obj = new ReverseString344();		
		System.out.println(Arrays.toString(obj.reverseString(new char[]{'h','e','l','l','o'})));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(Arrays.toString(obj.reverseString(new char[]{'H','a','n','n','a','h'})));
		System.out.println("Teste2: "+obj.testTwo());
				
	}
	
	public char[] reverseString(char[] s) {	
		StringBuilder str = new StringBuilder();
		for(char cs: s) {
			str.append(cs);
		}
		return str.reverse().toString().toCharArray();
    }
	
	public boolean testOne() {
		return "[o, l, l, e, h]".equals(Arrays.toString(reverseString(new char[]{'h','e','l','l','o'})));
	}
	
	public boolean testTwo() {
		return "[h, a, n, n, a, H]".equals(Arrays.toString(reverseString(new char[]{'H','a','n','n','a','h'})));
	}	
	
}
