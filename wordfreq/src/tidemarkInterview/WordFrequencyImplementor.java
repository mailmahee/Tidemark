package tidemarkInterview;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordFrequencyImplementor {
	public static void main(String[] args) {

		System.out.println("Please enter the Test String you need word frequency analysis on.");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s; 

		try{
			s = br.readLine();
			boolean isWhiteSpace = s.matches("^\\s*$");
			if((s.length()<1) || isWhiteSpace){
				System.out.println("Invalid String, Please enter a valid String.");
			}else{
			WordFrequency wf = new WordFrequency(s);
			wf.printFrequency();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
