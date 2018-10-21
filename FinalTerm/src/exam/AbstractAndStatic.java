package exam;
abstract class Hello{
	abstract void good();
}
class Teacher extends Hello{
	static int num=4;
	static void number() {
		System.out.println("number is good");
	}
	@Override
	void good() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class");
	}
}
public class AbstractAndStatic extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(num);
number();
Teacher obj=new Teacher();
obj.good();
	}

}
