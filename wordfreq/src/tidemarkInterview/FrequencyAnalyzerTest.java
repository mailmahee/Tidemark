package tidemarkInterview;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class FrequencyAnalyzerTest {

	//null input
	@Test
	public void testanalyzeFrequency_nullIp() {
		Map<String, Integer> analyzeFrequency = FrequencyAnalyzer.analyzeFrequency(null);
		assertNull("This parameter is supposed to be null", analyzeFrequency);
	}

	//Empty input
	@Test
	public void testanalyzeFrequency_empty() {
		Map<String, Integer> map = FrequencyAnalyzer.analyzeFrequency("");
		assertNull("We are expecting a null Map", map);
	}

	//valid input
	@Test
	public void testanalyzeFrequency_valid() {
		Map<String,Integer> expectedMap = new LinkedHashMap<String,Integer>();
		expectedMap.put("The", 1);
		expectedMap.put("fox", 1);
		expectedMap.put("the", 1);
		expectedMap.put("back", 1);
		expectedMap.put("lazy", 1);
		expectedMap.put("over", 1);
		expectedMap.put("brown", 2);
		expectedMap.put("dog's", 1);
		expectedMap.put("quick", 1);
		expectedMap.put("jumped", 1);
		
		Map<String, Integer> map = FrequencyAnalyzer.analyzeFrequency("The quick brown fox jumped over the lazy brown dog's back");
		assertNotNull("The Map is not supposed to be Null in size", map);
		assertEquals("the size is supposed to ber 10", 10,map.size());
		assertEquals("Invalid Map", expectedMap, map);
		System.out.println(expectedMap);
	}

}
