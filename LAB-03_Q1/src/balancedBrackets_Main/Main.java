package balancedBrackets_Main;

import balancedBrackets_Check.balancedBrackets;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your Brackets :");
		String brackets = sc.next();
		
		balancedBrackets obj = new balancedBrackets();
		if(obj.balancedBracketsCheck(brackets)) {
			System.out.println("The entered String has balanced brackets");
		}
		else {
			System.out.println("The entered String does not contain balanced brackets");
		}
		
		sc.close();
		
	}

}
