package leerCode.easy.binaryTree.binarysearch;

import java.util.Arrays;

import leerCode.easy.binaryTree.TreeNode;

/*
You are given the root of a binary searchBST tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

Example 1:

Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

Example 2:

Input: root = [4,2,7,1,3], val = 5
Output: []
*/
public class SearchBinarySearchTree700 {
	
	TreeNode root; 
	
	SearchBinarySearchTree700(int[] values) {			
		this.root = new TreeNode(values[0]);
		this.root.addAll(values);
	}
		
	public static void main(String[] args) {
		
		SearchBinarySearchTree700 obj = new SearchBinarySearchTree700(new int[]{4,2,7,1,3});				
		System.out.println(Arrays.toString(obj.root.getBranchLevelOne()));
		System.out.println(Arrays.toString(obj.searchBST(obj.root, 2).getBranchLevelOne()));
		System.out.println("Teste1: "+obj.testOne());
		
		TreeNode breach = obj.searchBST(obj.root, 5);
		System.out.println(breach == null? "[]" : breach.getBranchLevelOne());
		System.out.println("Teste2: "+obj.testTwo());
						
	}
	
	public TreeNode searchBST(TreeNode root, int val) {
		
		while(root != null && root.val != val) {
									
			if(val < root.val) {
				root = root.left;
			} else {
				root = root.right;
			}			
		}
		
        return root;
    }
	
	public boolean testOne() {
		return "[2, 1, 3]".equals(Arrays.toString(searchBST(root, 2).getBranchLevelOne()));
	}
	
	public boolean testTwo() {
		return searchBST(root, 5) == null;
	}	
	
}