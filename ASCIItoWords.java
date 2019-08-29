package ascii;

import java.util.Scanner;

public class ASCIItoWords {
	static Scanner s = new Scanner(System.in);

// this program will convert ASCII to letters
	public static void main(String[] args) {
		System.out.println("enter ascii numbers:");
		String nums = s.nextLine();
		String[] ch = nums.split(" ");
		int[] words = new int[ch.length];
		for (int i = 0; i < words.length; i++) {
			words[i] = Integer.parseInt(ch[i]);
			System.out.print((char) words[i]);
		}
	}

}
