package exam;

import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Begin=0,Last=100;
int Middle=Last/2;
int Number=75;
Scanner scan=new Scanner(System.in);
int user=101;
System.out.println("Guess the number game: ");
while(true) {
	user=scan.nextInt();
	if(user>Number) {
		System.out.println("Number is greater");
	}else if(user<Number) {
		System.out.println("Number is smaller");
	}else {
		break;
	}
}
System.out.println("Number Found");
	}

}
