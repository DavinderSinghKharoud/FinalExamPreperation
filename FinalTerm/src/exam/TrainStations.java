package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

class Tracks {
	String DepartureStation;
	String ArrivalStation;
	int NoofCoaches;
	public Tracks(String DepartureStation,	String ArrivalStation,int NoofCoaches) {
		// TODO Auto-generated constructor stub
	this.DepartureStation=DepartureStation;
	this.ArrivalStation=ArrivalStation;
	this.NoofCoaches=NoofCoaches;
	}
	void freeCoaches(int OccupiedCoaches) {
		System.out.println("freeCoaches: "+(NoofCoaches-OccupiedCoaches));
	}
	void Display() {
		System.out.println("DepartureStation: "+DepartureStation);
		System.out.println("ArrivalStation "+ArrivalStation);
		
	}
}
public class TrainStations {

	void mcgillStations(String Station,Tracks obj,int OccupiedCoaches) {
	
		obj.Display();
		obj.freeCoaches(OccupiedCoaches);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
	
TrainStations obj=new TrainStations();
System.out.println("Enter Station Name");

String enter=scan.next();
Tracks track1=new Tracks(enter, "atwater", 50);
System.out.println("Enter occupiedCoaches: ");
try {
int coaches=scan.nextInt();
obj.mcgillStations(enter,track1,coaches);
}catch(InputMismatchException e) {
	System.out.println("Mismatch error");
}
catch(Exception e) {
	System.out.println(e);
	System.out.println("Enter integer value");
}

	}

}
