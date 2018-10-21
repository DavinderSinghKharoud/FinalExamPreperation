package exam;

import java.util.Scanner;

class Days{
	static String day[]= {"monday","tuesday","wednesday","thursday","friday","saturday","Sunday"};
	static Scanner scan=new Scanner(System.in);
	static int number;
	public Days(int i) {
		// TODO Auto-generated constructor stub
		number=i;
	}
	 
	static void display() {
		System.out.println(day[number]);
	}
	static void nextDay() {
		System.out.println(day[number+1]);
	}
	static void previousDay() {
		System.out.println(day[number-1]);
	}
	static void calculateDay(int user) {
		int mod=user%7;
		int num=number+mod;
		while(true) {
			if(num<=6) {
		
			
		
		System.out.println(day[num]);
		break;}
		else if(num>6){
			int d=num%6;
			System.out.println(day[d-1]);
			break;
		}}
	}
}
public class WeekDays extends Days{
	
	public WeekDays(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Days obj=new Days(2);
	display();
	nextDay();
	previousDay();
	calculateDay(17);
	
	}

}
