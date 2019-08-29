package tutorial;

import java.util.Scanner;

public class BinarytoASCII {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter a binary code:");

		String input = s.nextLine();

		String[] nums = input.split(" ");

		String[] rev = new String[nums.length];

		for (int i = 0; i < rev.length; i++) {
			rev[i] = "";
			for (int j = nums[i].length() - 1; j >= 0; j--) {
				rev[i] += nums[i].charAt(j);
			}
		}
		
		for (int i = 0; i < rev.length; i++) {
			int ascii = 0;
			for (int j = 0; j < rev[i].length(); j++) {
				if(rev[i].charAt(j) == '1')
					ascii += Math.pow(2, j);
			}
			System.out.print(ascii + " ");
		}

	}

}
