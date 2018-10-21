package exam;

public class CapitalizeLetterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String user="guru is";
char first=user.charAt(0);
char Uppercase=Character.toUpperCase(first);
System.out.print(Uppercase);
for(int i=1;i<user.length();i++) {
	System.out.print(user.charAt(i));
}
System.out.println();
String output=user.substring(0,1).toUpperCase()+user.substring(1);
System.out.println(output);
	}

}
