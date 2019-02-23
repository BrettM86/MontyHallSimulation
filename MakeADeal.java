import java.util.concurrent.ThreadLocalRandom;

public class MakeADeal
{
private int Simulations;
private int Wins;
private int Correct;
private int Guess;
private int DoorOpened;
private int NewGuess;


	public MakeADeal(int x)
	{
		Simulations = x;
		SetCorrectDoor();
		SetGuess();
		GenerateDoorOpened();
		SwitchingUpGuess();
	}

	public int getNewGuess()
	{
		return NewGuess;
	}

	public int getWins()
	{
		return Wins;
	}

	public int getDoorOpened()
	{
		return DoorOpened;
	}

	public int getGuess()
	{
		return Guess;
	}

	public int getCorrect()
	{
		return Correct;
	}

	private void SetCorrectDoor()
	{
		Correct = GenerateRandomNumBetween1And3();
	}

	private void SetGuess()
	{
		Guess = GenerateRandomNumBetween1And3();
	}


	private static int GenerateRandomNumBetween1And3()
	{
		int num = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		return num;
	}

	private void GenerateDoorOpened()
	{

		for(int i = 1; i<=3;i++)
		{
			if(i != Correct && i != Guess)
			{
				DoorOpened = i;
			}
		}
	}

	private void SwitchingUpGuess()
	{
		for(int i = 1; i <=3; i++)
		{
			if(i != DoorOpened && i != Guess)
			{
				NewGuess = i;
			}
		}

		if(NewGuess == Correct)
		{
			Wins++;
		}
	}






}
