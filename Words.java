import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<Word>();
	}

	public Words(String s)
	{
		wordList = new ArrayList<Word>();
		setWords(s);
	}

	public void setWords(String s)
	{
		//Create a Scanner for the list of words in the string "s"
		Scanner chopper = new Scanner(s);

		//Continue to loop while there are more words to read
			while(chopper.hasNext())
			{
				wordList.add(new Word(chopper()));
			}
			//Add objects of the type Word to our ArrayList "wordList"


	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
		for (Word x: wordList )
			if(x.getNumVowels())
			count++;


		

		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		//for each Word in the ArrayList "words" loop

			//if the Word has "size" characters
			//for(int i = wordList.get[i].getLength; i<0; i--)
			//if the length of the "theWord" is the same as the parameter "size"
			for (int i=0; i<words.size(); i++)
				//if(word.getLength()== size)
				//vowelCount += wordList.get[i];
				if (words.get(i).contains("a") || vowels.get(i).contains("e") || vowels.get(i).contains("i") ||
				 vowels.get(i).contains("o") || vowels.get(i).contains("u"))
				 vowelCount ++;


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		for (Word y: wordList )
			if(y.getNumVowels())
			count++;


		return count;
		//for every Word in the ArrayList "words"

			//if the number of vowels in "theWord" is the same as the parameter "numVowels"
	}

	public String toString()
	{
	   return "";
	}
}