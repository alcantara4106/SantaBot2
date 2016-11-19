import java.util.Scanner;
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    
    public static void main (String [] args)
    {
        SantaBot santabot = new SantaBot();
        Scanner scanner = new Scanner(System.in);
        System.out.println (santabot.getGreeting());

		Scanner in = new Scanner (System.in);
		String answer = santabot.getGreeting();
		String statement = in.nextLine();

		while (statement != "Good-bye."){
			System.out.println (santabot.processor1(statement));
			statement = in.nextLine();
    }
}
}