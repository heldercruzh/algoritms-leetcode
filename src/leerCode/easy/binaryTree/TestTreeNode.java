package leerCode.easy.binaryTree;

import java.util.Arrays;

public class TestTreeNode {

	TreeNode root; 
	
	TestTreeNode(int[] values) {			
		this.root = new TreeNode(values[0]);
		this.root.addAll(values);
	}
	
	public static void main(String[] args) {
		
		TestTreeNode obj = new TestTreeNode(new int[]{4,2,7,1,3});
				
		System.out.println("First level: "+Arrays.toString(obj.root.getBranchLevelOne()));
		System.out.println("Second level on the left: "+Arrays.toString(obj.root.left.getBranchLevelOne()));
		System.out.println("Second level with search: "+Arrays.toString(obj.root.search(2).getBranchLevelOne()));
		System.out.println("Depth-First Search -> Transversal in Order: "+obj.root.getTraverseInOrder());
		System.out.println("Depth-First Search -> Transversal pre Order: "+ obj.root.getTraversePreOrder());
		System.out.println("Depth-First Search -> Transversal pos Order: "+obj.root.getTraversePostOrder());
		System.out.println("Breadth-First Search: "+obj.root.getTraverseLevelOrder());
		
	}
}
