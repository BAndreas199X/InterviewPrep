package main.java.InterviewPrep;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PalindromeCheckerPython {

	public static void main(String[] args) {
		int ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		System.out.println(palindromeExtractor("Alola"));
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		System.out.println(palindromeExtractor("Eevee"));
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		System.out.println(palindromeExtractor("Girafarig"));
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		System.out.println(palindromeExtractor("Farigiraf"));
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		System.out.println(palindromeExtractor("Ho-Oh"));
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		System.out.println(palindromeExtractor("Alomomola"));
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);

	}
	
	private static List<String> palindromeExtractor(String i_string){
		i_string = i_string.toLowerCase();
		List<String> resultList = new ArrayList<>();
		int i_length = i_string.length();
		
		for(int idx = 0;idx<i_length-1;idx++) {
			for(int jdx = idx+2;jdx<i_length+1;jdx++) {
				String testString = i_string.substring(idx,jdx);
				if(palindromeChecker(testString)) {
					resultList.add(testString);
				}
			}
		}
		
		return resultList;
	}
	
	private static boolean palindromeChecker(String i_potPalindrome) {
		int i_length = i_potPalindrome.length();
		int i_lengthHalf = i_length/2;
		
		for(int idx = 0;idx<i_lengthHalf;idx++) {
			if(i_potPalindrome.charAt(idx)==i_potPalindrome.charAt(i_length-idx-1)) {
				
			}else {
				return false;
			}
		}
		
		return true;
	} 

}
