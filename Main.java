import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
	{

		int input=0;
        System.out.println("How many games would you like to simulate: ");
		Scanner keyboard = new Scanner(System.in);
		try
		{
			input = keyboard.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Sorry your input is not recognized!");
			System.exit(0);
		}

		int counter = 0;
		for(int i = 0; i< input; i++)
		{
			MakeADeal Demo = new MakeADeal(input);
			System.out.println("Prize\tGuess\tView\tNewGuess");
			System.out.println(Demo.getCorrect()+"\t\t" + Demo.getGuess() + "\t\t" + Demo.getDoorOpened() + "\t\t" + Demo.getNewGuess());
			if(Demo.getWins() == 1)
			{
				counter++;
			}
		}
		System.out.println("\n");
		System.out.println("Probability of Winning if you Switch: " + String.format("%.2f", (double)counter/(double)input));
		System.out.println("Probability of Winning if you don't Switch: " + String.format("%.2f", 1.0-((double)counter/(double)input)));
    }


}
