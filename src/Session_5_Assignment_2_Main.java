import java.util.Scanner;
public class Session_5_Assignment_2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(); 
		circle.getData();
		circle.findArea();
		circle.findPerimeter();
		
	    Rectangle rectangle = new Rectangle(); 
	    rectangle.getData();
	    rectangle.findArea();
	    rectangle.findPerimeter();
	    
	    Triangle triangle = new Triangle();
	    triangle.getData();
	    triangle.findArea();
	    triangle.findPerimeter();
	    

	}

}

abstract class Figure
{
	double dim1 = 3.1444;
	
	abstract void findArea();
	abstract void findPerimeter();
}
class Circle extends Figure
{
	double radius , Area; 
	double perimeter;
	Scanner inp = new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter the Radius of the Circle");
		radius = inp.nextDouble();
	}
	void findArea()
	{
		Area = dim1*radius*radius;
		System.out.println("Area of the Circle = "+Area);
	}
	void findPerimeter()
	{
		perimeter = 2 * dim1 * radius ;
		System.out.println("Perimeter of the Circle = "+perimeter);
		System.out.println("");
	}
}
class Rectangle extends Figure 
{
	double length , breadth , area , perimeter ; 
	Scanner inp = new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter the Length and Breadth  for the rectangle");
		length = inp.nextDouble();
		breadth = inp.nextDouble();
	}
	void findArea()
	{
		area = length * breadth ; 
		System.out.println("Area of the Rectangle = " +area);
	}
	void findPerimeter()
	{
		perimeter = 2 * length * breadth; 
		System.out.println("Perimeter of the Rectangle = " +perimeter);
		System.out.println(" ");
	}
}
class Triangle extends Figure 
{
	double base , height , area ,perimeter ; 
	Scanner inp = new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter the base and height of the Triangle");
		base = inp.nextDouble();
		height = inp.nextDouble();
	}
	void findArea()
	{
		area = 0.5 * base * height;
		System.out.println("Area of the Triangle = "+area);
	}
	void findPerimeter()
	{
		perimeter = 3 * base ; 
		System.out.println("Perimeter of the Triangle = "+perimeter);
		System.out.println(" ");
	}
}


/*

OUTPUT : 

Enter the Radius of the Circle
5
Area of the Circle = 78.61000000000001
Perimeter of the Circle = 31.444000000000003

Enter the Length and Breadth  for the rectangle
12
13
Area of the Rectangle = 156.0
Perimeter of the Rectangle = 312.0
 
Enter the base and height of the Triangle
5
4
Area of the Triangle = 10.0
Perimeter of the Triangle = 15.0


*/