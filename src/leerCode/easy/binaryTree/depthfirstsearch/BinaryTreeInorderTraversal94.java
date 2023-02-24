package leerCode.easy.binaryTree.depthfirstsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leerCode.easy.binaryTree.TreeNode;

/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:

Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
*/
public class BinaryTreeInorderTraversal94 {
	
	TreeNode root; 
	
	BinaryTreeInorderTraversal94(int[] values) {
				
		if(values.length == 0) {
			this.root = new TreeNode();
		} else {
			this.root = new TreeNode(values[0]);
			this.root.addAll(values);
		}	
		
	}
		
	public static void main(String[] args) {
		
		BinaryTreeInorderTraversal94 obj = new BinaryTreeInorderTraversal94(new int[]{1,0,2,3});				
		System.out.println(Arrays.toString(obj.root.getBranchLevelOne()));
		System.out.println(obj.inorderTraversal(obj.root).toString());
		System.out.println("Teste1: "+obj.testOne());
				
		BinaryTreeInorderTraversal94 obj2 = new BinaryTreeInorderTraversal94(new int[]{});	
		System.out.println(obj2.inorderTraversal(obj2.root).toString());
		System.out.println("Teste2: "+obj2.testTwo());
		
		BinaryTreeInorderTraversal94 obj3 = new BinaryTreeInorderTraversal94(new int[]{1});	
		System.out.println(obj3.inorderTraversal(obj3.root).toString());
		System.out.println("Teste3: "+obj3.testThree());
		
						
	}
	
	public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {        	
            helper(root.left, res);           
            res.add(root.val);
            helper(root.right, res);            
        }
    }
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
	
	public boolean testOne() {
		return "[1, 2, 3]".equals(inorderTraversal(root).toString());
	}
	
	public boolean testTwo() {
		return "[0]".equals(inorderTraversal(root).toString());
	}	
	
	public boolean testThree() {
		return "[1]".equals(inorderTraversal(root).toString());
	}	
	
}