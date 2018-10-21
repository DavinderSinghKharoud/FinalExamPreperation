package exam;

public class StringReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String user="wow is good";
StringBuilder wow=new StringBuilder(user);
for(int i=0;i<user.length();i++) {
	if(user.charAt(i)=='i' && user.charAt(i+1)=='s') {
		wow.insert(i+2, " not");
	}
}
String str=wow.toString();
System.out.println(str);
	}
}
