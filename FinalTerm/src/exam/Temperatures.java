package exam;
class Temperature{
	int temp[][]= {{1,2},{1,2},{1,2},{1,2},{1,2},{2,1}};
	void display() {
		System.out.println("January Highest temp: "+temp[0][0]+" Lowest temp: "+temp[0][1]);
	}
	void averageHight() {
		int sum=0;
		for(int i=0;i<temp.length;i++) {
			sum+=temp[i][0];
		}
		System.out.println("Average hi: "+sum/temp.length);
	}
	void averageLow() {
		int sum=0;
		for(int i=0;i<temp.length;i++) {
			sum+=temp[i][1];
		}
		System.out.println("Average low: "+sum/temp.length);
	
	}
	void indexHighTemp() {
		int highTemp=temp[0][0];
		for(int i=1;i<temp.length;i++) {
			if(highTemp<temp[i][0]) {
				highTemp=temp[i][0];
			}
		}
		System.out.println("highest Temperature is "+ highTemp);
	}
	void indexLowTemp() {
		int lowTemp=temp[0][1];
		for(int i=1;i<temp.length;i++) {
			if(lowTemp>temp[i][1]) {
				lowTemp=temp[i][1];
			}
		}
		System.out.println("lowest Temperature is "+ lowTemp);
	}
}
public class Temperatures extends Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Temperature obj=new Temperature();
obj.display();
obj.averageHight();
obj.averageLow();
obj.indexHighTemp();
obj.indexLowTemp();
	}

}
