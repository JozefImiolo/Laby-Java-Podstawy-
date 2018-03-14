package prog.imper.Lab3;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

public class WordCounter2 {
	
	public static final Logger log = Logger.getLogger(WordCounter2.class);

	public static void main(String[] args) {
	
		if(args.length==0)
		{
			log.info("Brak argumentów");
			System.exit(-2);
		}

		int maxVal = Integer.MIN_VALUE;
		String maxKey=" ";
		Map<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < args.length; i++) {
			if (map.containsKey(args[i])) {
				map.put(args[i], map.get(args[i]) + 1);
			} else {
				map.put(args[i], 1);
			}

		}
		for(Map.Entry<String, Integer> elm: map.entrySet())
		{
			log.info(elm.getKey()+ "  "+ elm.getValue());
		}
		
		for(Map.Entry<String, Integer> element: map.entrySet())
		{
			if(element.getValue()>maxVal)
			{
				maxVal=element.getValue();
				maxKey=element.getKey();
			}
		}
		log.info("Najczestsze s³owo to: "+ maxKey+ " wystapi³o: "+maxVal);

	}

}
