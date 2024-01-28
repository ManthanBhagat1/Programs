package abstract1;




abstract class Shape1
{
	abstract void calculateArea();
}
class Circle extends Shape1
{
	double r=3.14;
	
	 public void calculateArea()
	 {
		
		
		 System.out.println("Area of circle : "+(3.14 * r * r));
	 }
	
}
class Triangle extends Shape1
{

	 public void calculateArea()
	 {
		 ;
		 double base = 5;
		 double height =3;
		 System.out.println("Area of Triangle : "+((base * height)/2));
		
	 }
}
class Rectangle extends Shape1
{
	
	 public void calculateArea()
	 {
		
		 double length = 5;
		
		 double width = 10;
		 System.out.println("Area of Rectngle : "+(length * width));
		
	 }
}
public class spaes 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		c.calculateArea();
		t.calculateArea();
		r.calculateArea();
	
}



}


