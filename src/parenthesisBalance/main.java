package parenthesisBalance;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter expression");
		String input = sc.next();
		
		StackCompare msc = new StackCompare();
		if(input.length()%2!=0)
			System.out.println("Invalid input");
		else {
		if(msc.valdate(input))
			System.out.println("Valid input");
		else
			System.out.println("Invalid input");
		
		}
			

	}

}
