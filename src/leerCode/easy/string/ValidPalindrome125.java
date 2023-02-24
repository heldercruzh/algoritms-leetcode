package leerCode.easy.string;

/*
palindrome: diz-se de ou frase ou palavra que se pode ler, indiferentemente, da esquerda para a direita ou vice-versa. 
 
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/
public class ValidPalindrome125 {

	public static void main(String[] args) {
		
		ValidPalindrome125 obj = new ValidPalindrome125();		
		System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.isPalindrome("race a car"));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.isPalindrome(" "));
		System.out.println("Teste3: "+obj.testThree());
				
	}
	
	public String isPalindrome(String s) {
	     // convert Strign s to lowerCase with regex
	     String tempString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	     // Reverse the tempString 
	     return new StringBuffer(tempString).reverse().toString();	       
	}
	
	public boolean testOne() {
		return "amanaplanacanalpanama".equals(isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	public boolean testTwo() {
		return !"raceacar".equals(isPalindrome("race a car"));
	}	
	
	public boolean testThree() {
		return "".equals(isPalindrome(" "));
	}	
	
	/*
	public String isPalindrome(String str) {		
		str = str.toLowerCase();
		Pattern p = Pattern.compile("[^aA-zZ]");
		Matcher m = p.matcher(str);		
		return m.replaceAll("");
    }
    
    public String isPalindrome(String s) {
	     // convert Strign s to lowerCase with regex
	     String tempString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	     // Reverse the tempString 
	     return new StringBuffer(tempString).reverse().toString();	       
	}
    
    public String isPalindrome(String str) {			
		return str.replaceAll("[^aA-zZ]", "").toLowerCase();
    }
    
	*/
	
}
