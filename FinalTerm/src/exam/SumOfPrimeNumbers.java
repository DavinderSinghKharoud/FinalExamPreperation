package exam;

public class SumOfPrimeNumbers {

	static boolean primeNumber(int num){
		for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			return false;
		}
		
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=2;
int count=0;
long sum=0;
while(count<100){
	if(primeNumber(num)) {
		count++;
		sum+=num;
		
	}num++;
}
System.out.println("sum of first 100 prime numbers is: "+sum);
	}

}
