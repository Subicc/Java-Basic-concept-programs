package lab2Ex;
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {

	public static void main (String[] args) 
	{ 
	double currentSalary; // employee's current salary
	double raise=0; // amount of the raise
	double newSalary; // new salary for the employee
	 String rating;
	 double percentRaise;
	 Scanner scan = new Scanner(System.in); 
	System.out.print ("Enter the current salary: ");
	currentSalary = scan.nextDouble(); 
	 System.out.print ("Enter the performance rating (Top performance,Excellent, Good, or Poor): "); 
	rating = scan.nextLine();
	if(rating.equals("Top performance:"))
	{
		percentRaise=10;
		raise=(10*currentSalary);
	}
	else if(rating.equals("Excellent"))
	{
		percentRaise=.06;
		raise=(0.6*currentSalary);
	}
	else if(rating.equals("Good"))
	{
		percentRaise=0.4;
		raise=(0.4*currentSalary);
	}
	else if(rating.equals("Poor"))
	{
		percentRaise=.015;
		raise=(0.015*currentSalary);
	}
	
	newSalary = currentSalary + raise; 
	// Print the results
	 NumberFormat money = NumberFormat.getCurrencyInstance(); 
	 System.out.println(); 
	 System.out.println("Current Salary: " + money.format(currentSalary)); 
	 System.out.println("Amount of your raise: " + money.format(raise)); 
	 System.out.println("Your new salary: " + money.format(newSalary)); 
	 System.out.println(); 
	} 
	}

