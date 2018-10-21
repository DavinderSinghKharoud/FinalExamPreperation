package exam;

public class ReverseJavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "good";
		for (int count = a.length() - 1; count >= 0; count--) {
			System.out.print(a.charAt(count));
		}
	}

}
