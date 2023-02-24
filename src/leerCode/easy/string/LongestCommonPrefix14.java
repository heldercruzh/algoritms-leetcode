package leerCode.easy.string;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		
		LongestCommonPrefix14 obj = new LongestCommonPrefix14();		
		System.out.println(obj.longestCommonPrefix(new String[]{"flower","flow","flight"}));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.longestCommonPrefix(new String[]{"dog","racecar","car"}));
		System.out.println("Teste2: "+obj.testTwo());
				
	}
	//Learning a lot from these Indian logics https://www.linkedin.com/in/tarushi-singh-a35941202/
	//Longest string prefix ["flower","flow","flight"] o resultado é "fl"
	public String longestCommonPrefix(String[] strs) {	
		String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
	
	public boolean testOne() {
		return "fl".equals(longestCommonPrefix(new String[]{"flower","flow","flight"}));
	}
	
	public boolean testTwo() {
		return "".equals(longestCommonPrefix(new String[]{"dog","racecar","car"}));
	}	
	
	/*
	String prefix = ""; 
	String lastWord = strs[0];
	int countToCompare = 0;		
	if(strs.length == 0 || strs.length == 1) {
		return "";
	}		
	for(int i = 1; i < strs.length; i++) {
		prefix = "";			
		if(lastWord.length() > strs[i].length()) {
			countToCompare = strs[i].length();
		} else {
			countToCompare = lastWord.length();
		}						
		for(int j = 0; j < countToCompare; j++) {				
			if(lastWord.charAt(j) != strs[i].charAt(j)) {
				break;
			}	
			prefix += strs[i].charAt(j); 
		}
		lastWord = prefix;			
	}		
    return prefix;
    */
	
}
