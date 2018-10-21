package exam;

interface GeometricObject {
	public double getPerimeter();

	public double getArea();
}

class Circle implements GeometricObject {
	protected double radius = 2.0;

	void Circle(double radius) {
		System.out.println("Radius is: " + radius);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2 * 3.14 * radius);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.pow(radius, 2) * 3.14);
	}
}

interface Resizeable {
	void resize(int percent);
}

class ResizeableCircle extends Circle implements Resizeable {

	public void NewRadius(double radius) {
	this.radius=radius;
	}

	@Override
	public void resize(int radius) {
		// TODO Auto-generated method stub
		System.out.println("Circle changed by Percent: " +(((this.radius-radius)/radius)*100) );
	}

}

public class InterfaceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.Circle(10);
		System.out.println(obj.getPerimeter());
		System.out.println(obj.getArea());
		ResizeableCircle obj1 = new ResizeableCircle();
		obj1.resize(1);
		System.out.println(obj1.getArea());

	}

}
