package leerCode.easy.binaryTree.binarysearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leerCode.easy.binaryTree.TreeNode;

/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced binary search tree.

Example 1:

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:

Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.

*/
public class ConvertSortedArrayToBinarySearchTree108 {
	
	TreeNode root; 
			
	public static void main(String[] args) {
		
		ConvertSortedArrayToBinarySearchTree108 obj = new ConvertSortedArrayToBinarySearchTree108();				
		obj.root = new TreeNode(0);
		obj.root.left = new TreeNode(-3);
		obj.root.left.left = new TreeNode(-10);
		obj.root.right = new TreeNode(9);
		obj.root.right.left = new TreeNode(5);	
		System.out.println(obj.sortedArrayToBST());
		System.out.println("Teste1: "+obj.testOne());
		
		ConvertSortedArrayToBinarySearchTree108 obj2 = new ConvertSortedArrayToBinarySearchTree108();				
		obj2.root = new TreeNode(0);
		obj2.root.left = new TreeNode(3);
		obj2.root.left.left = new TreeNode(1);
		obj2.root.right = new TreeNode(1);
		obj2.root.right.right = new TreeNode(3);	
		System.out.println(obj2.sortedArrayToBST());
		System.out.println("Teste2: "+obj2.testTwo());
		
						
	}
	
	public void add(int value) {
		addRecursive(root, value);
    }
	
	public TreeNode addRecursive(TreeNode current, int value) {
  	     
	   	 if(current == null) {
	   		 return new TreeNode(value);
	   	 }
	   	 
	   	 if(value < current.val) { //smaller add left
	   		 current.left = addRecursive(current.left, value);
	   	 } else if(value > current.val) { //bigger add right
	   		 current.right = addRecursive(current.right, value);
	   	 } else { //value already exists 
	   		 return current;
	   	 }
	   	 
	   	 return current;
  	 
   }
	
	
	public List<Integer> sortedArrayToBST() {
		
		List<Integer> res = new ArrayList<>();  
	    	
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

        	TreeNode node = nodes.remove();
        	if(!res.contains(node.val))
        		res.add(node.val);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
				
        return res;
    }
	
	public boolean testOne() {
		return "[0, -3, 9, -10, 5]".equals(sortedArrayToBST().toString());
	}
	
	public boolean testTwo() {
		return "[0, 3, 1]".equals(sortedArrayToBST().toString());
	}	
	
}

/*

class Solution {
public TreeNode helper(int[] arr, int start, int end){
    if(start > end) return null;
    int mid = start + (end-start)/2;
    TreeNode midNode = new TreeNode(arr[mid]);
    midNode.left = helper(arr, start, mid-1);
    midNode.right = helper(arr, mid+1, end);
    return midNode;
}
public TreeNode sortedArrayToBST(int[] nums) {        
    return helper(nums, 0, nums.length-1);
}
}
*/