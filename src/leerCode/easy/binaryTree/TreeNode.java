package leerCode.easy.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
    
    public TreeNode() {}
    
    public TreeNode(int val) {
   	 	this.val = val;
    }
    
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
       
    public int[] getBranchLevelOne() {        	
	   	 return new int[] {
	   			 this.val, 
	   			 this.left == null ? 0 : this.left.val, 
	   			 this.right == null ? 0 : this.right.val
	   	 };
    }
    
    public void addAll(int[] values) {
    	for(int num: values) {
    		if(num == 0) {
    			continue;
    		}    		
    		this.add(num);
    	}
    }
    
    
    public void add(int value) {
   	 	addRecursive(this, value);
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
    
    public TreeNode search(int val) {
		
    	TreeNode root = this;
    	
		while(root != null && root.val != val) {
									
			if(val < root.val) {
				root = root.left;
			} else {
				root = root.right;
			}			
		}
		
        return root;
    }
    
    public boolean containsNode(int value) {
        return containsNodeRecursive(this, value);
    }
    
    private boolean containsNodeRecursive(TreeNode current, int value) {
        
    	if (current == null) {
            return false;
        } 
        if (value == current.val) {
            return true;
        } 
        return value < current.val
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }
    
    public void delete(int value) {
        deleteRecursive(this, value);
    }
    
    private TreeNode deleteRecursive(TreeNode current, int value) {
       
    	if (current == null) {
            return null;
        }

        if (value == current.val) {
        	
        	if (current.left == null && current.right == null) {
        	    return null;
        	}
        	
        	if (current.right == null) {
        	    return current.left;
        	}

        	if (current.left == null) {
        	    return current.right;
        	}
        	
        } 
        
        if (value < current.val) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        
        current.right = deleteRecursive(current.right, value);
        return current;
    }
    
    public List<Integer> getTraverseInOrder() {
    	List<Integer> res = new ArrayList<>();
       	this.traverseInOrder(this, res);
       	return res;
    }
         
    public void traverseInOrder(TreeNode node, List<Integer> res) {
    	if (node != null) {    		
            traversePreOrder(node.left, res);
            res.add(node.val);
            traversePreOrder(node.right, res);
        }
    }
    
    public List<Integer> getTraversePreOrder() {
    	List<Integer> res = new ArrayList<>();
       	this.traversePreOrder(this, res);
       	return res;
    }
    
    public void traversePreOrder(TreeNode node, List<Integer> res) {
    	if (node != null) {
    		res.add(node.val);
            traversePreOrder(node.left, res);
            traversePreOrder(node.right, res);
        }
    }
    
    public List<Integer> getTraversePostOrder() {
    	List<Integer> res = new ArrayList<>();
       	this.traversePostOrder(this, res);
       	return res;
    }
    
    public void traversePostOrder(TreeNode node, List<Integer> res) {
    	if (node != null) {    		
            traversePreOrder(node.left, res);            
            traversePreOrder(node.right, res);
            res.add(node.val);
        }
    }
    
    public List<Integer> getTraverseLevelOrder() {
    	List<Integer> res = new ArrayList<>();
       	this.traverseLevelOrder(res);
       	return res;
    }
    
    private void traverseLevelOrder(List<Integer> res) {
    	TreeNode root = this;
    	
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

        	TreeNode node = nodes.remove();

            res.add(node.val);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
}
