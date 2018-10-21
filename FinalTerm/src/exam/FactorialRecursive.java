package exam;

public class FactorialRecursive {
static int factorial(int num) {
	if(num==0) {
		return 1;
	}else if(num>0) {
		return (num*factorial(num-1));
	}
	return num;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=4;
System.out.println(factorial(num));
	}

}
