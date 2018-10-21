package exam;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Discriminant;
		System.out.println("Equation is ax^2+bx+c=0");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double A = scan.nextDouble();
		System.out.println("Enter the value of b:");
		double B = scan.nextDouble();
		System.out.println("Enter the value of c:");
		double C = scan.nextDouble();
		if (Math.pow(B, 2) - 4 * A * C == 0) {
			System.out.println("Root is " + (-1 * B) / (2 * A));
		} else if (Math.pow(B, 2) - 4 * A * C > 0) {
			Discriminant = Math.pow(B, 2) - 4 * A * C;
			System.out.println("First Root is: " + ((-1 * B) + Math.sqrt(Discriminant)) / (2 * A));
			System.out.println("Second Root is: " + ((-1 * B) - Math.sqrt(Discriminant)) / (2 * A));
		}else {
			System.out.println("It dont have Any Real Roots");
		}

	}

}
