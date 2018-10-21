package exam;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=10;i++) {
for(int space=10;space>i;space--) {
	System.out.print(" ");
}
	for(int j=0;j<=i;j++) {
		System.out.print("* ");
	}System.out.println();
}
	}

}
