import myPack.Stack;
import java.util.*;

public class Session_5_Assignment_4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option ; 
		
		FixedStack stack = new FixedStack(10);
		Scanner input = new Scanner(System.in);
		
OuterLoop:		
	do{
			System.out.println("--------Fixed Menu ------------");
			System.out.println("1. Adds Element to a Stack    ");
			System.out.println("2. Removes Element to a Stack ");
			System.out.println("3. Print the Elements in Stack");
			System.out.println("4. Exit the Stack");
			System.out.println("");
			
			System.out.println("Please Choose Option for performin the operation in the stack");
			option = input.nextInt();
			System.out.println("");
			
			switch(option)
			{
			case 1: 
				
				System.out.println("Enter the Element into the Stack");
				stack.push(input.nextInt());
				break;
				
			case 2: 
				System.out.println("The Element " +stack.pop() + " has removed from the Stack" );
				break;
				
			case 3: 
				stack.printStack();
				break;
				
			case 4:
				System.out.println("Exiting the Loop...");
				break OuterLoop ; 
				
			default:
				System.out.println("You have choosed an Invalid Option, Exiting the loop...");
				break OuterLoop;
			}
			
		   }while(option <= 4 );
	} 
}
class FixedStack implements Stack
{
	int[] arr;
	public static int TOP = 0; 
	Scanner inp = new Scanner(System.in);

	FixedStack(int i)
	{
		arr = new int[i];
	}
		
	public void push(int i)
	{
		if(TOP <= arr.length - 1)
		{
			arr[TOP] = i ;
			TOP = TOP + 1 ;
		}
		else 
		{
			System.out.println("Error/Fixed Stack Full : Array Out of Bound Index");
			System.out.println("The Stack is Empty, Please Add the Element in the Stack");
		}
	}
	
	public int pop()
	{
		if((TOP >= 0) && ((TOP-1) >=0 ) )
		{
			TOP = TOP - 1; 
			return arr[TOP];
		}
		else
		{
			System.out.println("Error/Fixed Stack Empty : Array Out of Bound Index"); 
			return 0;
		}
	}
	
	public void printStack()
	{
		if(TOP > 0)
		{
			for(int k = 0 ; k < TOP ; k++  )
			{
				System.out.println(+arr[k]);
			}	
		}
		else
		{
			System.out.println("The Stack is Empty, Please Add the Element in the Stack");
		}
	}
}

/*class VariableStack implements Stack
{
	int [] variablearr ; 
	public static int var_TOP = 0 ;
	VariableStack(int i)
	{
		variablearr = new int[i];
	}
		
	public void push(int i)
	{
		if(var_TOP <= variablearr.length-1)
		{
			variablearr[var_TOP] = i ;
			var_TOP = var_TOP + 1 ;
		}
		else 
		{
			System.out.println("Error/Fixed Stack Full : Array Out of Bound Index");
			System.out.println("The Stack is Empty, Please Add the Element in the Stack");
		}
	}
	
	public int pop()
	{
		if((var_TOP >= 0) && ((var_TOP-1) >=0 ) )
		{
			var_TOP = var_TOP - 1; 
			return variablearr[var_TOP];
		}
		else
		{
			System.out.println("Error/Fixed Stack Empty : Array Out of Bound Index"); 
			return 0;
		}
	}
	
	public void printStack()
	{
		if(var_TOP > 0)
		{
			for(int k = 0 ; k < var_TOP ; k++  )
			{
				System.out.println(+variablearr[k]);
			}	
		}
		else
		{
			System.out.println("The Stack is Empty, Please Add the Element in the Stack");
		}
	}
}*/
	
