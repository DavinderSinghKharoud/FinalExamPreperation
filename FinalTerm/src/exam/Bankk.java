package exam;
interface Building{
	void buildingHeight();
}
class Bank{
	protected int INTERESTRATE;
}
class ICIBank extends Bank implements Building  {
	public ICIBank(int interestRate) {
		// TODO Auto-generated constructor stub
	INTERESTRATE=interestRate;
	}
	void display() {
		System.out.println("ici interest rate: "+INTERESTRATE);
	}
	@Override
	public void buildingHeight() {
		// TODO Auto-generated method stub
		System.out.println("ici bankbuilding is 20metres high");
	}
	
}
class HDFCBank extends Bank implements Building{
	public HDFCBank(int interestRate) {
		// TODO Auto-generated constructor stub
		INTERESTRATE=interestRate;
	}
	void display() {
		System.out.println(" hdfc interest rate: "+INTERESTRATE);
	}
	void display(String address) {
		System.out.println("address is: "+address);
	}
	public void buildingHeight(){
		System.out.println("hdfc bankbuilding is 30metres high");
	}
}
public class Bankk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ICIBank ici=new  ICIBank(20);
HDFCBank hdfc=new HDFCBank(30);
ici.display();
hdfc.display();
hdfc.display("patiala");
ici.buildingHeight();
hdfc.buildingHeight();

	}

}
