package leerCode.easy.string;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

*/
public class FirstUniqueCharacterInString387 {
	
	public static void main(String[] args) {
		
		FirstUniqueCharacterInString387 obj = new FirstUniqueCharacterInString387();		
		System.out.println(obj.firstUniqChar("leetcode"));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.firstUniqChar("loveleetcode"));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.firstUniqChar("aabb"));
		System.out.println("Teste3: "+obj.testThree());
				
	}
	
	public int firstUniqChar(String s) {		
		 // Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }   
	
	public boolean testOne() {
		return firstUniqChar("leetcode") == 0;
	}
	
	public boolean testTwo() {
		return firstUniqChar("loveleetcode") == 2;
	}	
	
	public boolean testThree() {
		return firstUniqChar("aabb") == -1;
	}	
}
