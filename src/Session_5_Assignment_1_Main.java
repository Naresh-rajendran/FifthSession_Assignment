import java.util.Scanner;
public class Session_5_Assignment_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle_Area circle_area = new Circle_Area();
		circle_area.getParameters();
		circle_area.getArea();
		circle_area.getperimeter();

	}

}

abstract class AreaParameters 
{
	final double PI = (22/7);
	
	private double radius = 0.0 , length = 0.0 , height = 0.0;
	
	double getRadius()
	{
		return radius ; 
	}
	double setRadius(double radius)
	{
		return this.radius = radius; 
	}
	
	double getLength()
	{
		return length ; 
	}
	double setLength(double length)
	{
		return this.length = length; 
	}
	
	double getHeight()
	{
		return height ; 
	}
	double setHeight(double height)
	{
		return this.height = height; 
	}
	
	void getParameters()
	{
		
	}
	
	void getArea()
	{
		
	}
	void getperimeter()
	{
		
	}
}

//getParameters() , getArea() , getperimeter() are methods overridden for getting the area , parameters and Perimeter

class Circle_Area extends AreaParameters
{
	private double Area = 0 , Perimeter = 0 ;  
	Scanner inp = new Scanner(System.in);
	
	void getParameters()
	{
		System.out.println("Enter the radius for Circle");
		setRadius(inp.nextDouble());
		System.out.println(" ");
		System.out.println("The Entered radius of circle : " +getRadius());
	}
	void getArea()
	{
		Area = PI * getRadius() * getRadius() ; 
		System.out.println("The area of the Circle       : " +Area);
	}
	void getperimeter()
	{
		Perimeter = 2 *  PI * getRadius() ; 
		System.out.println("The area of the Perimeter    : " +Perimeter);
	}
    
		
}

/*
OUTPUT : 

Enter the radius for Circle
5
 
The Entered radius of circle : 5.0
The area of the Circle       : 75.0
The area of the Perimeter    : 30.0



 */

