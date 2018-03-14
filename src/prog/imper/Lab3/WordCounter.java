package prog.imper.Lab3;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	public static void main(String[] args) {
		String maxKey="";
		int maxVal=Integer.MIN_VALUE;
		
		for(Map.Entry<String, Integer> entry: wordCounter(args).entrySet())
		{
			if(entry.getValue()>maxVal) {
				maxVal=entry.getValue();
				maxKey=entry.getKey();
			}
		}
		System.out.println("Najczestsze s³owo to: "+ maxKey+ " wystapi³o: "+maxVal);

	}
	public static HashMap<String, Integer> wordCounter(String[] words)
	{
		HashMap<String,Integer> hm=new HashMap<>();
		for (String string : words) {
			if(hm.containsKey(string))
			{
				hm.put(string, hm.get(string)+1);
			}
			else
			{
				hm.put(string, 1);
			}
			
		}
	
	return hm;
	}

}
