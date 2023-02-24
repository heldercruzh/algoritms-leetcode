package leerCode.easy.string;
/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 
Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701 
*/
public class ExcelSheetColumnNumber171 {

	public static void main(String[] args) {
		
		ExcelSheetColumnNumber171 obj = new ExcelSheetColumnNumber171();		
		System.out.println(obj.titleToNumber("A"));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.titleToNumber("AB"));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.titleToNumber("ZY"));
		System.out.println("Teste3: "+obj.testThree());
				
	}
	
	public int titleToNumber(String columnTitle) {		
		int sum = 0;
        for(char ch : columnTitle.toCharArray()) {          
            int diff = ch - ('A' - 1);
            sum = sum * 26 + diff;
        }
        return sum;    
    }
	
	public boolean testOne() {
		return titleToNumber("A") == 1;
	}
	
	public boolean testTwo() {
		return titleToNumber("AB") == 28;
	}	
	
	public boolean testThree() {
		return titleToNumber("ZY") == 701;
	}	
	
/*
	public int titleToNumber(String str) {		
		int numbersAlphabetLetters  = 31;
		int titleToNumber = 0;			
		if(str.length() == 1) {
			return str.charAt(0) & numbersAlphabetLetters;
		}		
		for (int i = str.length() - 1; i >= 0 ; i--) {
			if(i == str.length() - 1) {
				titleToNumber += (str.charAt(i) & numbersAlphabetLetters);
				continue;
			}
			titleToNumber += (str.charAt(i) & numbersAlphabetLetters) * 26;
    	}
		return titleToNumber;        
    }
*/
}
