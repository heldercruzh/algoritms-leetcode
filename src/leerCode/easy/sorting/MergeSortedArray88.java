package leerCode.easy.sorting;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 
*/
public class MergeSortedArray88 {
	
	public static void main(String[] args) {
		
		MergeSortedArray88 obj = new MergeSortedArray88();		
		System.out.println(Arrays.toString(obj.exec(new int[] {1,2,3,0,0,0} , 3, new int[] {2,5,6}, 3)));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(Arrays.toString(obj.exec(new int[] {1} , 1, new int[] {}, 0)));
		System.out.println("Teste2: "+obj.testTwo());
		
		System.out.println(Arrays.toString(obj.exec(new int[] {0} , 0, new int[] {1}, 1)));
		System.out.println("Teste2: "+obj.testThree());
				
	}
	
	public int[] exec(int[] nums1, int m, int[] nums2, int n) {
		
		if(m == 0) {
			nums1 = new int[] {nums2[n-1]};
		}
		
		for(int i = nums1.length - 1; i > 0; i--) {
			if(i >= n) {
				nums1[i] = nums2[i-n];
			} 		
		}
		
		Arrays.sort(nums1);
		
        return nums1;
    }
	
	public boolean testOne() {
		return "[1, 2, 2, 3, 5, 6]".equals(Arrays.toString(exec(new int[] {1,2,3,0,0,0} , 3, new int[] {2,5,6}, 3)));
	}
	
	public boolean testTwo() {
		return "[1]".equals(Arrays.toString(exec(new int[] {1} , 1, new int[] {}, 0)));
	}	
	
	public boolean testThree() {
		return "[1]".equals(Arrays.toString(exec(new int[] {0} , 0, new int[] {1}, 1)));
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

	OK - 1. Two Sum
	OK - 26. Remove Duplicates from Sorted Array
	OK - 66. Plus One
	OK - 88. Merge Sorted Array	
	OK - 118. Pascal's Triangle
	OK - 121. Best Time to Buy and Sell Stock
	OK - 136. Single Number
	OK - 169. Majority Element
	OK - 217. Contains Duplicate
	OK - 268. Missing Number
	OK - 283. Move Zeroes
	
String 600 / 10
	
	OK - 14. Longest Common Prefix
	OK - 20. Valid Parentheses
	OK - 125. Valid Palindrome
	OK - 171. Excel Sheet Column Number
	OK - 242. Valid Anagram
	OK - 344. Reverse String
	OK - 387. First Unique Character in a String
	
Binary Tree
--- Binary Search 214
	OK - 108. Convert Sorted Array to Binary Search Tree

--- Binary Indexed Tree 26
--- Binary Tree 167
	
	OK - 94. Binary Tree Inorder Traversal

--- Depth-First Search 266 e Breadth-First Search 210
		
	OK - 101. Symmetric Tree
	
--- Binary Search Tree 40
--- Tree 207

	OK - 108. Convert Sorted Array to Binary Search Tree


A estudar
+++++++++++++++++++++++++++++++++++++++++
--------------Manhã-----------------------------

++++++++++++ 2h

Math 410
	
	OK - 13. Roman to Integer
	OK - 66. Plus One
	OK - 69. Sqrt(x)
	OK - 70. Climbing Stairs	
	202. Happy Number	
	412. Fizz Buzz
	
Bit Manipulation 154

	OK - 136. Single Number
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