package bst_FindSumPair;

import java.util.HashSet;

public class FindSumPair {
	
	public static class Node{
		int nodeData;
		Node leftNode, rightNode;
	};
	
	static Node NewNode(int nodeData) {
		Node temp = new Node();
		temp.nodeData = nodeData;
		temp.leftNode = null;
		temp.rightNode = null;
		
		return temp;
	}
	
	public Node insert(Node root,int key) {
		
		if(root== null) {
			return NewNode(key);
		}
		if(key < root.nodeData) {
			root.leftNode = insert(root.leftNode,key);
		}
		else {
			root.rightNode = insert(root.rightNode,key);
		}
		
		return root;
	}
	
	public boolean findPair(Node root,int sum,HashSet<Integer> set) {
		
		if(root== null) {
			return false;
		}
		if(findPair(root.leftNode, sum, set)) {
			return true;
		}
		if(set.contains(sum - root.nodeData)) {
			 System.out.println("Pair is found (" + (sum-root.nodeData) + "," + root.nodeData + ")");
			 
			 return true;
		}
		else {
			set.add(root.nodeData);
		}
		
		return findPair(root.rightNode,sum,set);
	}
	
	public void findPairWithGivenSum(Node root,int sum) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		if(!findPair(root, sum, set)) {
			System.out.println("Pairs do not exists" + "\n")	;
		}
		
	}

}
