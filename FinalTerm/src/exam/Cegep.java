package exam;
class Teachers{
	int Id;
	String Name;
	String Schedule;
	public Teachers(String Name,int Id) {
		// TODO Auto-generated constructor stub
		this.Id=Id;
		this.Name=Name;
	}
	void displayDetails() {
		System.out.println("Name: "+Name);
		System.out.println("Id :"+Id);
	}
	void schedule() {
		System.out.println("class 209 at 9:30 am");
		System.out.println("class 207 at 12:30 pm");
	}
}
class Students extends Teachers{
String Subjects;
	public Students(String Name, int Id) {
		super(Name, Id);
		// TODO Auto-generated constructor stub
	}
	void displaySubjects() {
		System.out.println("Subjects are OOPs,Math");
	}
	
	
}
class Receptionist extends Teachers{
int Payment;
	public Receptionist(String Name, int Id,int Payment) {
		super(Name, Id);
		// TODO Auto-generated constructor stub
		this.Payment=Payment;
	}
	void addPayment() {
		displayDetails();
		System.out.println("Payment done: "+Payment);
	}
}
public class Cegep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teachers tec1=new Teachers("saku", 123);
tec1.displayDetails();
tec1.schedule();
Students stu1=new Students("sunny", 1893033);
stu1.displayDetails();
stu1.displaySubjects();
Receptionist rec1=new Receptionist("kharoud", 1234, 5000);
rec1.addPayment();
	}

}
