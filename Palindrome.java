package day6;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Check if a number is palindrome eg 121 ie same when reversed.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number ");
		int num = scanner.nextInt();
		int initialNum = num;
		int newNum = 0;
		while(num !=0) {
			int lastDigit = num%10;
			newNum = newNum * 10 + lastDigit;
			num = num/10;
		}
		if(initialNum == newNum) {
			System.out.println("This number " + initialNum + " is a Palindrome");
		}else {
			System.out.println("This number " + initialNum + " is not a Palindrome");
		}

	}

}
