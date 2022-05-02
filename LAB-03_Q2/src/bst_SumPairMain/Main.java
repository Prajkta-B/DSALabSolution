package bst_SumPairMain;

import bst_FindSumPair.FindSumPair.Node;

import java.util.Scanner;

import bst_FindSumPair.FindSumPair;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Node root = null;
		
		FindSumPair obj = new FindSumPair();
		root = obj.insert(root, 40);
		root = obj.insert(root, 20);
		root = obj.insert(root, 60);
		root = obj.insert(root, 10);
		root = obj.insert(root, 30);
		root = obj.insert(root, 50);
		root = obj.insert(root, 70);
		
		System.out.println("Enter the value of Sum to find the sum pair for the given BST: ");
		int sum;
		sum = sc.nextInt();
		obj.findPairWithGivenSum(root, sum);
		
		sc.close();
	}

}
