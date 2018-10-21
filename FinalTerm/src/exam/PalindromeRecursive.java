package exam;

public class PalindromeRecursive {
static void check(int num) {
	int sum=0,temp=num;
	while(num>0) {
		int mod=num%10;
		sum=sum*10+mod;
		num=num/10;
	}
	if(sum==temp) {
		System.out.println("Number is palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=4544;
float d= (34);
int k=(int) d;
System.out.println(d+" "+k);
check(num);
	}

}
