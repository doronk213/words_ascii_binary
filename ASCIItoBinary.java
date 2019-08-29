package tutorial;

import java.util.Scanner;

public class ASCIItoBinary {
	
	static Scanner s = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("enter ASCII numbers:");
		
		String input = s.nextLine();
		
		String[] nums = input.split(" ");
		
		int[] ascii = new int[nums.length];
		
		for (int i = 0; i < ascii.length; i++) {
			ascii[i] = Integer.parseInt(nums[i]);
			String temp = "";
			while(ascii[i]>0) {
				if(ascii[i]%2==0)
					temp += "0";
				else
					temp += "1";
				ascii[i] = Math.floorDiv(ascii[i], 2);
			}
			String binary = "";
			for (int j = temp.length()-1; j >= 0; j--) {
				binary += temp.charAt(j);
			}
			System.out.print(binary + " ");
		}
		
	}
	
}
