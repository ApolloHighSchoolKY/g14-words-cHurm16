import java.util.List;
import java.util.ArrayList;

public class Word
{
	//Instance field(variable)
	private String word;
	//Class field(variable)
	private static final String VOWELS = "AEIOUaeiou";   //static means only one


	public Word()
	{
		word = "";
	}

	public Word(String newWord)
	{
		setWord(newWord);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{

		int count= 0; 

		for(int i = 0; i<getLength();i++)
		{
			if(VOWELS.indexOf(word.substring(i,i+1)) !=-1)
				count +=1; 
		}

		return count;
		//Loop for every letter in "word"

			//Use indexOf to see if the letter is in the string "vowels"


		
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}