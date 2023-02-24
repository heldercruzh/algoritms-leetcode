package leerCode.easy.math;


/*
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 
 For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 
 */

public class RomantoInteger13 {
	
	public static void main(String[] args) {
		
		RomantoInteger13 obj = new RomantoInteger13();		
		System.out.println(obj.romanToInt("III"));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.romanToInt("LVIII"));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(obj.romanToInt("MCMXCIV"));
		System.out.println("Teste2: "+obj.testThree());
				
	}
	
	public int romanToInt(String s) {
		
	        int ans = 0, num = 0;
	         
	        for (int i = s.length()-1; i >= 0; i--) {
	            switch(s.charAt(i)) {
	                case 'I': num = 1; break;
	                case 'V': num = 5; break;
	                case 'X': num = 10; break;
	                case 'L': num = 50; break;
	                case 'C': num = 100; break;
	                case 'D': num = 500; break;
	                case 'M': num = 1000; break;
	            }
	            if (4 * num < ans) {
	            	ans -= num;
	            } else {
	            	ans += num;
	            }
	        }
	        return ans;
	    
    }
	
	public boolean testOne() {
		return 3 == romanToInt(new String("III"));
	}
	
	public boolean testTwo() {
		return 58 == romanToInt(new String("LVIII"));
	}	
	
	public boolean testThree() {
		return 1994 == romanToInt(new String("MCMXCIV"));
	}	
	
}

/*
Top Algoritimos Leetcode

Seleção dos exercícios mais cobrados em entrevistas alinhado ao conteúdo a estudar no leetcode
Filtros
--- TOP Interview Questions
--- Easy
--- Tags


Fazer Exercícios
+++++++++++++++++++++++++++++++++++++++
--- Array 1302/14

	1. Two Sum
	26. Remove Duplicates from Sorted Array
	66. Plus One
	88. Merge Sorted Array	
	118. Pascal's Triangle
	121. Best Time to Buy and Sell Stock
	136. Single Number
	169. Majority Element
	217. Contains Duplicate
	268. Missing Number
	283. Move Zeroes
	
String 600 / 10
	
	14. Longest Common Prefix
	20. Valid Parentheses
	125. Valid Palindrome
	171. Excel Sheet Column Number
	242. Valid Anagram
	344. Reverse String
	387. First Unique Character in a String
	
Binary Tree
--- Binary Search 214
108. Convert Sorted Array to Binary Search Tree

--- Binary Indexed Tree 26
--- Binary Tree 167
	
	94. Binary Tree Inorder Traversal

--- Depth-First Search 266 e Breadth-First Search 210
		
	101. Symmetric Tree
	
--- Binary Search Tree 40
--- Tree 207

	108. Convert Sorted Array to Binary Search Tree


A estudar
+++++++++++++++++++++++++++++++++++++++++
--------------Manhã-----------------------------

++++++++++++ 2h

Math 410
	
	13. Roman to Integer
	
	66. Plus One
	69. Sqrt(x)
	70. Climbing Stairs
	171. Excel Sheet Column Number
	202. Happy Number
	326. Power of Three
	412. Fizz Buzz
	
Bit Manipulation 154

	136. Single Number
	190. Reverse Bits
	191. Number of 1 Bits
	268. Missing Number

Sorting 292

	88. Merge Sorted Array
	169. Majority Element
	242. Valid Anagram
	268. Missing Number
	350. Intersection of Two Arrays II
	
+++++++++++++++	2h
	
Dynamic Programming 415/4
	
	118. Pascal's Triangle
	121. Best Time to Buy and Sell Stock
	
Hash Table 454 / 12

	13.  Roman to Integer
	217. Contains Duplicate
	242. Valid Anagram
	387. First Unique Character in a String
	
Two Pointers 166
	
	26. Remove Duplicates from Sorted Array
	88. Merge Sorted Array
	125. Valid Palindrome
	283. Move Zeroes
	344. Reverse String
	
----------------------Tarde------------------------------	
	
+++++++++++++++ 2h
Stack 136

	20. Valid Parentheses
	94. Binary Tree Inorder Traversal


Linked List 70
	
	234. Palindrome Linked List
	206. Reverse Linked List
	160. Intersection of Two Linked Lists
	141. Linked List Cycle
	21. Merge Two Sorted Lists

Recursion 45

	326. Power of Three

++++++++++++

Divide and Conquer 43

	191. Number of 1 Bits
	190. Reverse Bits
	
Trie 44 

	14. Longest Common Prefix

Queue 39

	387. First Unique Character in a String

Matrix 186

	104. Maximum Depth of Binary Tree
	
Heap (Priority Queue) 134 e Design 120 e Graph 120 e Prefix Sum 114 e Backtracking 94 e Sliding Window 84 e Union Find 72 e Ordered Set 51 e Monotonic Stack 49 e Enumeration 46 e Bitmask 38 e Geometry 31 e Segment Tree 31 e Topological Sort 30 e Number Theory 28 e Game Theory 24 e Combinatorics 19 e Data Stream 18 e Interactive 18 e String Matching 18 e Rolling Hash 18 e Shortest Path 17 e Randomized 12 e Brainteaser 12 e Monotonic Queue 11 e Merge Sort 11 e Iterator 9 e Concurrency 9 e Doubly-Linked List 8 e Doubly-Linked List 8 e Quickselect 7 e Bucket Sort 6 e Suffix Array 6 e Minimum Spanning Tree 5 e Counting Sort 5 e Shell 4 e Line Sweep 4 e Reservoir Sampling 4 e Eulerian Circuit 3 e Radix Sort 3 e Strongly Connected Component 2 e Rejection Sampling 2 Biconnected Component 1
	
	104. Maximum Depth of Binary Tree

--------------------------------------------------


-------------Noite---------------------- 
Resumo de Certificação Java
Resumo de Conceitos Angular
Form Angular

-------------Manhã-------------------
Empresas
Inglês
Treinar o que falar

------------------------------------


Não estudar agora
+++++++++++++++++++++++++++++++++++++++++
Greedy 285
Database 220
Hash Function 25
Simulation 113

	412. Fizz Buzz
	
Counting 98

	387. First Unique Character in a String
	169. Majority Element

Memoization 32

	70. Climbing Stairs
	

*/