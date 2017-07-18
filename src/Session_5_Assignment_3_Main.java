import java.util.Scanner;
public class Session_5_Assignment_3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermanentEmp emp = new PermanentEmp();
		emp.getDetailsEmployee();
		emp.getDetailPermanentEmployee();
		
		System.out.println("Please the give value for Temporary Employee");
		
		TemperoryEmp temp = new TemperoryEmp();
		temp.getDetailsEmployee();
		temp.getDetailTemporaryEmployee();
		
		
		emp.calculate_salary();
		emp.calculate_balance_leaves();
		emp.print_leave_details();
		
		
		
		temp.calculate_salary();
		temp.calculate_balance_leaves();
		temp.print_leave_details();
	}

}
class Employee 
{
	private int empid  = 0;
	private String empName = " "; 
	private int Total_Leaves = 36 ; 
	protected double Total_salary = 0.0  ;
	
	Scanner in = new Scanner(System.in);
	
	void getDetailsEmployee()
	{
		System.out.println("Enter the Employee Name");
	    empName = in.nextLine();
	    		
		System.out.println("Enter Employee ID");
		empid = in.nextInt();
		
		//System.out.println("Enter Total Leaves for Employee for this Year ");
		//Total_Leaves = in.nextInt();
		
		//System.out.println("Enter the Total Salary");
		//Total_salary = in.nextDouble();
	}
	
	int getTotalLeaves()
	{
		return Total_Leaves;
	}
	int getEmployeeID()
	{
		return empid;
	}
	String getEmployeeName()
	{
		return empName ; 
	}
	
	
	void calculate_balance_leaves()
	{
		
	}
	
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		return true; 
	}
	
	void calculate_salary()
	{
		
	}
}
class PermanentEmp extends Employee 
{
	int paid_leave, sick_leave , casual_leave  ; 
	int avail_paid_leave , avail_sick_leave , avail_casual_leave ; 
	double basic, HRA,PFA;
	
	Scanner inp = new Scanner(System.in);
	
	void getDetailPermanentEmployee()
	{
		System.out.println("Enter Basic salary of Permanent Employee");
		basic = inp.nextDouble();
		
		System.out.println("Enter the Sick leaves took by Permanent Employee");
		sick_leave = inp.nextInt();
		
		System.out.println("Enter the Paid leaves took by Permanent Employee");
		paid_leave = inp.nextInt();
		
		System.out.println("Enter the Causal leaves took by Permanent Employee");
		casual_leave = inp.nextInt();
	}
	
	void print_leave_details()
	{
		System.out.println("Permanent Employee Details");
		System.out.println("**************************");
		
		System.out.println("                 Employee ID : " +getEmployeeID());
		System.out.println("               Employee Name : " +getEmployeeName());
		System.out.println("   Total Leaves for the year : " +getTotalLeaves());
		System.out.println("Total Salary of the Employee : " +Total_salary);
		System.out.println();
		
		System.out.println("Leave Details");
		System.out.println("*************");
		System.out.println("   Total Number of Sick Leaves took out of 12 per year :  " +sick_leave);
		System.out.println("   Total Number of Paid Leaves took out of 12 per year :  " +paid_leave);
		System.out.println(" Total Number of Casual Leaves took out of 12 per year :  " +casual_leave);
		System.out.println();
		
		System.out.println("Available Leaves");
		System.out.println("****************");
		
		System.out.println("  Sick Leave  : " +avail_sick_leave);
		System.out.println("  Paid Leave  : " +avail_paid_leave);
		System.out.println("Casual Leave  : " +avail_casual_leave);
		System.out.println(" ");
	}
	void calculate_balance_leaves()
	{		
         if(avail_leave(sick_leave,'S'))
         {
        	 avail_sick_leave = 12 - sick_leave ;
         }
         else
         {
        	 avail_sick_leave = 0;
         }

		if (avail_leave(paid_leave,'P'))
		{
			avail_paid_leave = 12 - paid_leave ; 
		}
		else
		{
			avail_paid_leave = 0 ; 
		}
		
		if(avail_leave(casual_leave, 'C'))
		{
			avail_casual_leave = 12 - casual_leave;
		}
		else
		{
			avail_casual_leave = 0 ; 
		}
		
		
	}
	boolean avail_leave(int no_of_leaves,char type_of_leave)
	{
		if (type_of_leave == 'S')
		{
		    if(no_of_leaves <= 12 )
		    {
		    	return true ; 
		    }
		    else
		    {
		    	return false ; 
		    }
		}
		else if (type_of_leave == 'P')
		{
			if(no_of_leaves <= 12)
			{
				return true;
			}
			else 
			{
				return false; 
			}
		}
		else if(type_of_leave == 'C')
		{
			if(no_of_leaves <= 12 )
			{
				return true ;
			}
			else
			{
				return false;
			}
		}
		else 
		{
			System.out.println("The Leaves are not in the list");
			return false ; 
		}
		
	}
	void calculate_salary()
	{
		PFA = (12 * basic)/100;
		
		HRA = (50 * basic)/100;
		
		Total_salary = basic + HRA - PFA ; 
	}
	
}
class TemperoryEmp extends Employee 
{
	int paid_leave, sick_leave , casual_leave  ; 
	int avail_paid_leave , avail_sick_leave , avail_casual_leave ; 
	double basic, HRA,PFA;
	
	Scanner input = new Scanner(System.in);
	
	void getDetailTemporaryEmployee()
	{
		System.out.println("Enter Basic salary of Temporary Employee");
		basic = input.nextDouble();
		
		System.out.println("Enter the Sick leaves took by Temporary Employee");
		sick_leave = input.nextInt();
		
		System.out.println("Enter the Paid leaves took by Temporary Employee");
		paid_leave = input.nextInt();
		
		System.out.println("Enter the Causal leaves took by  Temporary Employee");
		casual_leave = input.nextInt();
	}
	
	void print_leave_details()
	{
		System.out.println("Temporary Employee Details");
		System.out.println("**************************");
		
		System.out.println("                 Employee ID : " +getEmployeeID());
		System.out.println("               Employee Name : " +getEmployeeName());
		System.out.println("   Total Leaves for the year : " +getTotalLeaves());
		System.out.println("Total Salary of the Employee : " +Total_salary);
		System.out.println();
		
		System.out.println("Leave Details");
		System.out.println("*************");
		System.out.println("   Total Number of Sick Leaves took out of 12 per year :  " +sick_leave);
		System.out.println("   Total Number of Paid Leaves took out of 12 per year :  " +paid_leave);
		System.out.println(" Total Number of Casual Leaves took out of 12 per year :  " +casual_leave);
		System.out.println();
		
		System.out.println("Available Leaves");
		System.out.println("****************");
		
		System.out.println("  Sick Leave  : " +avail_sick_leave);
		System.out.println("  Paid Leave  : " +avail_paid_leave);
		System.out.println("Casual Leave  : " +avail_casual_leave);
		System.out.println(" ");
	}
	void calculate_balance_leaves()
	{
		 if(avail_leave(sick_leave,'S'))
         {
        	 avail_sick_leave = 12 - sick_leave ;
         }
         else
         {
        	 avail_sick_leave = 0;
         }

		if (avail_leave(paid_leave,'P'))
		{
			avail_paid_leave = 12 - paid_leave ; 
		}
		else
		{
			avail_paid_leave = 0 ; 
		}
		
		if(avail_leave(casual_leave, 'C'))
		{
			avail_casual_leave = 12 - casual_leave;
		}
		else
		{
			avail_casual_leave = 0 ; 
		}
	}
	boolean avail_leave(int no_of_leaves,char type_of_leave)
	{
		if (type_of_leave == 'S')
		{
		    if(no_of_leaves <= 12 )
		    {
		    	return true ; 
		    }
		    else
		    {
		    	return false ; 
		    }
		}
		else if (type_of_leave == 'P')
		{
			if(no_of_leaves <= 12)
			{
				return true;
			}
			else 
			{
				return false; 
			}
		}
		else if(type_of_leave == 'C')
		{
			if(no_of_leaves <= 12 )
			{
				return true ;
			}
			else
			{
				return false;
			}
		}
		else 
		{
			System.out.println("The Leaves are not in the list");
			return false ; 
		}
	}
	void calculate_salary()
	{
		PFA = (12 * basic)/100;
		
		HRA = (50 * basic)/100;
		
		Total_salary = basic + HRA + PFA ;
		
	}
	
}



/*
OUTPUT : 

Enter the Employee Name
Naresh R
Enter Employee ID
1383938
Enter Basic salary of Permanent Employee
20000
Enter the Sick leaves took by Permanent Employee
34
Enter the Paid leaves took by Permanent Employee
12
Enter the Causal leaves took by Permanent Employee
12
Please the give value for Temporary Employee
Enter the Employee Name
Sunil
Enter Employee ID
123
Enter Basic salary of Temporary Employee
12000
Enter the Sick leaves took by Temporary Employee
12
Enter the Paid leaves took by Temporary Employee
12
Enter the Causal leaves took by  Temporary Employee
12
Permanent Employee Details
**************************
                 Employee ID : 1383938
               Employee Name : Naresh R
   Total Leaves for the year : 36
Total Salary of the Employee : 27600.0

Leave Details
*************
   Total Number of Sick Leaves took out of 12 per year :  34
   Total Number of Paid Leaves took out of 12 per year :  12
 Total Number of Casual Leaves took out of 12 per year :  12

Available Leaves
****************
  Sick Leave  : 0
  Paid Leave  : 0
Casual Leave  : 0
 
Temporary Employee Details
**************************
                 Employee ID : 123
               Employee Name : Sunil
   Total Leaves for the year : 36
Total Salary of the Employee : 19440.0

Leave Details
*************
   Total Number of Sick Leaves took out of 12 per year :  12
   Total Number of Paid Leaves took out of 12 per year :  12
 Total Number of Casual Leaves took out of 12 per year :  12

Available Leaves
****************
  Sick Leave  : 0
  Paid Leave  : 0
Casual Leave  : 0
*/