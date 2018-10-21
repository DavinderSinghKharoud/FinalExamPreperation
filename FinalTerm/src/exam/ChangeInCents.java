package exam;

import java.util.Scanner;

public class ChangeInCents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the change in cents");
int user=scan.nextInt();
long Dollars=user/50;
long modDollars=user%50;
long Quaters=modDollars/25;
long remainingChange=modDollars%25;
long dimes=remainingChange/10;
long remainingDimes=remainingChange%10;
long nickels=remainingDimes/5;
long pennies=(remainingDimes%5)/1;
System.out.println("Half Dollars: "+Dollars+" Quaters: "+Quaters+
		" Dimes: "+dimes+" Nickels: "+nickels+" Pennies: "+pennies);
	}

}
