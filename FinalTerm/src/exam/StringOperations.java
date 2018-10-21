package exam;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String user="god",u="goddd";
System.out.println(user.concat("good"));
System.out.println(user.length()+" "+user.substring(0, 2));
System.out.println(user.charAt(1)+" "+user.indexOf("o"));
System.out.println(user.contains("e"));
System.out.println(user.compareTo(u));
System.out.println(user.endsWith("d"));
System.out.println(user.startsWith("g"));
	}

}
