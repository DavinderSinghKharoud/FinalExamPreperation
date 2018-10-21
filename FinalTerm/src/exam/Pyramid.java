package exam;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dec=5;
		for(int i=0;i<5;i++) {
	for(int j=0;j<=i;j++) {
		System.out.print(dec);
		
	}System.out.println();
	dec--;
}
		int inc=2;
		for(int i=4;i>=0;i--) {
			for(int j=0;j<i;j++) {
		System.out.print(inc);		
			}inc++;
			System.out.println();
		}
	}

}
