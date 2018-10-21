package exam;

import java.util.Scanner;

public class StringPyramidShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input string:");
		String user = scan.next();
		for (int i = 0; i < user.length(); i++) {
			for (int k = i; k < user.length(); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {

				System.out.print(user.charAt(j) + " ");
			}
			System.out.println();
		}

	}

}
