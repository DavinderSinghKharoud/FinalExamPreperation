package exam;

public class RecursiveFibonacci {
	static int n1=0;
	static int n2=1;
static void fibonacci(int count) {
	
	int n3;
	if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+" ");
		fibonacci(count-1);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("n1 n2 ");
fibonacci(6);
	}

}
