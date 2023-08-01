package simpli.com;

abstract class Shape {

	String color = "RED";

	abstract double area();

	public abstract String toString();

	// default constructor
	public Shape() {
	}
	 
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;

	}

	public String getColor() {
        return color;

	}

}

////create a subclass and implement in it the abstract
class Circle extends Shape {
   String color = "BLUE";
	double radius;
	
	// default constructor
	public Circle() {
        super();
	}


	public Circle(String color, double radius) {
        super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;

	}


	public String getColor() {
        return color;

	}

	@Override

	double area() {

		return Math.PI * Math.pow(radius, 2);

	}

	@Override

	public String toString() {

		return "Circle color is " + super.color + "and area is : " + area();

	}

}

public class ObjectPolymorphismDemo {

	public static void main(String[] args) {

		// abstract class demo

		// NOT allowed because Shape is abstract.

		// We cant instantiate

		// Shape shape1 = new Shape();

		// Circle is concrete class with all methods in it having a body.

		// so we can create instances out of it

		Circle c1 = new Circle("Red ", 2.2);
		System.out.println(c1);
//		
//		Shape c2 = new Circle("white ",2.2);
//        System.out.println("color of c2 is "+ c2.color);
//	
//
//		Shape c2 = new Circle();
//        System.out.println("color of c2 is "+ c2.color);
//	

		Shape c2 = new Circle("white ",2.2);
        System.out.println("color of c2 is "+ c2.getColor());
	
	}

}
