package leerCode.easy.binaryTree.depthfirstsearch;

import leerCode.easy.binaryTree.TreeNode;

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:

Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:

Input: root = [1,2,2,null,3,null,3]
Output: false
*/
// Java program to check is binary tree is symmetric or not

// I used this link to help me: https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
public class SymmetricTree101 {
	
	TreeNode root; 
	
	SymmetricTree101() { }
		
	public static void main(String[] args) {
		
		SymmetricTree101 obj = new SymmetricTree101();	
		obj.root = new TreeNode(1);
		obj.root.left = new TreeNode(2);
		obj.root.right = new TreeNode(2);
		obj.root.left.left = new TreeNode(3);
		obj.root.left.right = new TreeNode(4);
		obj.root.right.left = new TreeNode(4);
		obj.root.right.right = new TreeNode(3);
		System.out.println(obj.isSymmetric(obj.root));
		System.out.println("Teste1: "+obj.testOne());
				
		
		SymmetricTree101 obj2 = new SymmetricTree101();	
		obj2.root = new TreeNode(1);
		obj2.root.left = new TreeNode(2);
		obj2.root.right = new TreeNode(2);		
		obj2.root.left.right = new TreeNode(3);
		obj2.root.right.right = new TreeNode(3);
		System.out.println(obj2.isSymmetric(obj2.root));
		System.out.println("Teste2: "+obj2.testTwo());
								
	}
	
	public boolean isMirror(TreeNode left, TreeNode right) {						
        
		if (left == null && right == null)
            return true;
		
		 if (left != null && right != null && left.val == right.val)
		            return (isMirror(left.left, right.right)
		                    && isMirror(left.right, right.left));
		
		return false;
		
    }
	
	public boolean isSymmetric(TreeNode root) {						
        return isMirror(root.left, root.right);
    }
	
	public boolean testOne() {
		return isSymmetric(root);
	}
	
	public boolean testTwo() {
		return !isSymmetric(root);
	}	
		
}