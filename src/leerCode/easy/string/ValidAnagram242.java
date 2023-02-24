package leerCode.easy.string;

import java.util.Arrays;

/*
This was also crazy, I found the the best solution on the https://www.baeldung.com/java-strings-anagrams  
 
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/
public class ValidAnagram242 {
	
	public static void main(String[] args) {
		
		ValidAnagram242 obj = new ValidAnagram242();		
		System.out.println(obj.isAnagram("anagram", "nagaram"));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.isAnagram("rat", "car"));
		System.out.println("Teste2: "+obj.testTwo());
		
	}
	
	public boolean isAnagram(String s, String t) {	
		if (s.length() != t.length()) {
	        return false;
	    }
	    char[] a1 = s.toCharArray();
	    char[] a2 = t.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1, a2);
    }
	
	public boolean testOne() {
		return isAnagram("anagram", "nagaram");
	}
	
	public boolean testTwo() {
		return !isAnagram("rat", "car");
	}	
	
/*
public boolean isAnagramCounting(String string1, String string2) {
    if (string1.length() != string2.length()) {
        return false;
    }
    int count[] = new int[CHARACTER_RANGE];
    for (int i = 0; i < string1.length(); i++) {
        count[string1.charAt(i)]++;
        count[string2.charAt(i)]--;
    }
    for (int i = 0; i < CHARACTER_RANGE; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    return true;
}
*/
	
}
