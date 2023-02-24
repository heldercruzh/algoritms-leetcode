package leerCode.easy.string;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/
public class ValidParentheses20 {

	public static void main(String[] args) {
		
		ValidParentheses20 obj = new ValidParentheses20();		
		System.out.println(obj.isValid("()"));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.isValid("()[]{}"));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.isValid("(]"));
		System.out.println("Teste3: "+obj.testThree());
				
	}
	
	public boolean isValid(String str) {		
		String padroes = "()[]{}";		
		for(int i = 0; i < str.length() - 1; i++) {
			if(padroes.indexOf(str.substring(i, i+2)) < 0) {
				return false;
			}
		}		
        return true;
    }
	
	public boolean testOne() {
		return isValid("()");
	}
	
	public boolean testTwo() {
		return isValid("()[]{}");
	}	
	
	public boolean testThree() {
		return !isValid("(]");
	}	
	
}
