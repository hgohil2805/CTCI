package Code;
import java.util.*;

public class LimeTest {

    public static ArrayList<String> getNGrams(String s, int num)
    {
    	String maxString = null;
    	int max = 0;
    	int value = 0;
    	ArrayList<String> returnString = new ArrayList<String>();
    	ArrayList<String> maxStrings = new ArrayList<String>();
    	HashMap<String, Integer> stringCount = new HashMap<String, Integer>();
    	for(int i=0;i < s.length(); i++)
    	{
    		int k=0;
    		int j = i;
    		String currentWord = "";
    		while(k < num && j < s.length() )
    		{
    			char ch = s.charAt(j);
    			currentWord += Character.toString(ch);
    			j++;
    			k++;
    		}
    		
    		if(currentWord.length() == num && currentWord.indexOf(" ") < 0)
    		{
    			returnString.add(currentWord);
    			if(stringCount.containsKey(currentWord))
    			{
    				value  = stringCount.get(currentWord);
    				value = value + 1;
    				stringCount.put(currentWord, value);
    				if(max < value)
    				{
    					max = value;
    					maxString = currentWord;
    					maxStrings = new ArrayList<String>();
    					maxStrings.add(currentWord);
    				}
    				else if(max == value)
    				{
    					maxStrings.add(currentWord);
    				}
    			}
    			stringCount.put(currentWord, 1);
    			maxStrings.add(currentWord);
    		}
    	}
    	if(maxStrings.size() > 1)
    	{
    		Collections.sort(maxStrings);
    	}
    	
    	System.out.println(maxStrings.get(0));
    	//System.out.println("Max string is:" +maxString);
    	return returnString;
    }
    public static void main(String[] args) 
    {
    	ArrayList<String> returnList = getNGrams("pilot",3);
    	System.out.println(returnList);
    }
}