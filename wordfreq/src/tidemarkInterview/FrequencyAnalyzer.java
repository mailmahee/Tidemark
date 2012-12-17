package tidemarkInterview;

import java.util.Comparator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class FrequencyAnalyzer {

	public static Map<String, Integer> analyzeFrequency(String text) {
		Map<String, Integer> map = null;

		if (inputIsValid(text)) {
			map = new TreeMap<String, Integer>(new CustomComparator());
			StringTokenizer st = new StringTokenizer(text);
			while (st.hasMoreTokens()) {
				String sb = st.nextToken();
				Integer freq = map.get(sb);
				map.put(sb, (freq == null) ? 1 : freq + 1);
			}
		}
		return map;
	}

	private static boolean inputIsValid(String s) {

		boolean result = false;
		if ((s != null) && (!s.isEmpty())) {
			result = true;
		}

		return result;
	}
}

final class CustomComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		int comparison = 0;
		// System.out.println(str2+" compare to "+str1 );
		if (str1.length() > str2.length())
			return 1;
		else if (str2.length() == str1.length()) {
			comparison = str1.compareTo(str2);
			return comparison;
		}

		return -1;
	}

}
