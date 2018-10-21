package exam;
interface interfacewow{
	void a();
}
abstract class Greetings implements interfacewow{
	abstract void c();
}
class Happy extends Greetings{
	void c() {
		System.out.println("abstract");
	}
	void happy() {
		System.out.println("i am happy");
	}
	void hungry() {
		System.out.println("i am hungry");
	}
	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("good");
	}
}
class sad extends Happy{
	void happy(int k) {
		System.out.println(k);
	}
	void happy() {
		System.out.println("sad is happy");
	}
}

public class OOpsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Happy user;
user=new  sad();
sad user1=new sad();
user.happy();
user.hungry();
user1.happy(2);
user.c();
user.a();
	}

}
