package exam;

public class SubstringString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcd";
		for (int i = 0; i < a.length(); i++) {
			for (int j = i; j <= a.length(); j++) {
				
				for (int k = i; k < j; k++) {
					System.out.print(a.charAt(k));
				}
				System.out.print(" ");
			}
		}
	}

}
