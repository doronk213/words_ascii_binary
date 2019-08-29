package ascii;

import java.util.Scanner;

public class WordstoASCII {
	static Scanner s = new Scanner(System.in);

// this program will convert letters to ASCII
	public static void main(String[] args) {
		System.out.println("enter a String:");
		String str = s.nextLine();
		char[] ascii = str.toCharArray();
		for (int i = 0; i < ascii.length; i++) {
			System.out.print((int) ascii[i] + " ");
		}
	}

}
