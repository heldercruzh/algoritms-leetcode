package leerCode.easy.math;

public class ClimbingStairs70 {
	
	public static void main(String[] args) {
		
		ClimbingStairs70 obj = new ClimbingStairs70();		
		System.out.println(obj.mySqrt(2));
		System.out.println("Teste1: "+obj.testOne());
		
		System.out.println(obj.mySqrt(3));
		System.out.println("Teste2: "+obj.testTwo());
		
	}
	
	public int mySqrt(int x) {
		
		int l = 1;
        int r = x;

        while(l <= r){
            int mid = (l + r) / 2;

            if(mid == x){
                return mid;
            } else if(mid > x){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
	
	public boolean testOne() {
		return 2 == mySqrt(2);
	}
	
	public boolean testTwo() {
		return 3 == mySqrt(3);
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