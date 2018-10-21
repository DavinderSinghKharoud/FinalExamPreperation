package exam;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
try{
	int i=34/0;
}catch(ArithmeticException e) {
	System.out.println(e);
}
try {
	String c="aba";
	int k=Integer.parseInt(c);
}catch(NumberFormatException e) {
	System.out.println(e);
}

}catch(Exception e) {
	System.out.println("good");
}
System.out.println("done");
	}

}
