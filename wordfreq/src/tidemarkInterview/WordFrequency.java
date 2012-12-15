package tidemarkInterview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class WordFrequency {

	private String s;
	WordFrequency(String s){
	this.s = s;
	}
	public void printFrequency()
	{
		Map<String, Integer> map = new TreeMap<String, Integer>(new CustomComparator());		
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()){
			String sb = st.nextToken();
			Integer freq = map.get(sb);
			map.put(sb,(freq == null) ? 1 : freq + 1);
		}
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<String, Integer> pair = it.next();
			System.out.println(pair.getValue() + " " + pair.getKey());
		}
	}
}

class CustomComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		int comparison = 0;
		//System.out.println(str2+" compare to "+str1 );
		if(str1.length() > str2.length())
			return 1;
		else if (str2.length() == str1.length()){
			comparison = str1.compareTo(str2);
			return comparison;
		}
		
		return -1;
	}
	
}
