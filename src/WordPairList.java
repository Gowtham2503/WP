import java.util.ArrayList;

public class WordPairList 
{
	private ArrayList<WordPair> allPairs;

	public WordPairList(String[]words) //words.length>=2
	{
		allPairs=new ArrayList<WordPair>();
		//String firstWordReference, secondWordReference; *no need for these variables*
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				allPairs.add(new WordPair(words[i], words[j])); /*Can call both words from here,
				the first word will not change while the second word is being looped!*/
			}
		}
	}
	
	public int numMatches()
	{
		int matches=0;
		for(WordPair wp:allPairs)
		{
			if(wp.getFirst().equals(wp.getSecond())) /* .equals() not == */
			{
				matches++;
			}
		}
		return matches;
	}
	
	public static void main(String[] args)
	{
		String[] words= {"the","red","fox","the","red"};
		WordPairList exampleOne=new WordPairList(words);
		System.out.println(exampleOne.allPairs);
		System.out.println(exampleOne.numMatches());
		
	}
	
