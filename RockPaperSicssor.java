package lab2Ex;
import java.util.Random;
import java.util.Scanner;
public class RockPaperSicssor extends Salary {
	
	public static void main(String[] args) 
	{ 
	 String personPlay=null; //User's play -- "R", "P", or "S"
	 String computerPlay=null; //Computer's play -- "R", "P", 
	//or "S"
	int computerInt; //Randomly generated number used to 
	//determine
	//computer's play
	 Scanner scan = new Scanner(System.in);  
	Random generator = new Random();
	while(true)
	{
		System.out.println("R,S,P");
		personPlay=scan.nextLine();
		if(personPlay.equals("R")||personPlay.equals("S")||personPlay.equals("P"))
{
	break;
}
		System.out.println(" Valid play");
	}
	scan.close();
computerInt=generator.nextInt(4);
switch(computerInt)
{
case 0:
	computerPlay="R";
	        break;
case 1:
	computerPlay="P";
            break;
case 2:
	computerPlay="S";
            break;
      default:
         	break;
}
System.out.println("Computer's Play:"+computerPlay);
	
	//Get player's play -- note that this is stored as a 
	//Make player's play uppercase for ease of comparison
	//Generate computer's play (0,1,2)
	//Translate computer's randomly generated play to string
	
	//Print computer's play
	//See who won. Use nested ifs instead of &&.
	 if (personPlay.equals(computerPlay)) 
	 System.out.println("It's a tie!"); 
	 else if (personPlay.equals("R")) 
	 if (computerPlay.equals("S")) 
	 System.out.println("Rock crushes scissors. You win!!");
	 else
		 System.out.println("Paper covers rock..");
	 else if(personPlay.equals("P"))
		if(computerPlay.equals("R"))
			System.out.println("Paper holds Rock.. You Win");
		else
			System.out.println("Sicssors Cuts paper...");
	 
	
	 } 
	 } 
	

