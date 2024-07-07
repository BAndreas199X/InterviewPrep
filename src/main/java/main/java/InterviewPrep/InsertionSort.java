package main.java.InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class InsertionSort {

	
	private static List<Integer> mainList = new ArrayList<>();
	private static Random randomizer = new Random();
	private static int listLength = 0;
	
	public static void main(String[] args) {
		fillList(10);
		
		System.out.println(mainList);
		sort();
		System.out.println(mainList);
	}
	
	private static void sort() {
		for(int idx = 1;idx<listLength;idx++) {
			List<Integer> subList = mainList.subList(0, idx+1);
			
			List<Integer> subListopy = subList;
			int toPutElementIndex = listLength+1;
			for(int jdx = 0;jdx<subList.size()-1;jdx++) {
				if(subList.get(jdx)>subList.get(jdx+1)) {
					toPutElementIndex = jdx+1;
					break;
				}
			}
			
			if(toPutElementIndex <= listLength) {
				int toChangeElement = subListopy.get(toPutElementIndex);
				subListopy.remove(toPutElementIndex);
				
				int insertIndex = listLength+1;
				for(int j = 0;j<subListopy.size()-1;j++) {
					
					if(toChangeElement <= subListopy.get(0)) {
						insertIndex = 0;
						break;
					}else if(toChangeElement > subListopy.get(j)&&toChangeElement <= subListopy.get(j+1)) {
						insertIndex = j+1;
						break;
					}
				}
				
				subListopy.add(insertIndex,toChangeElement);
			}
			
		}
	}
	
	public static void fillList(int records) {
		Collections.addAll(mainList,7,12,9,11,3);
		for(int idx = 0;idx<records;idx++) {
			mainList.add(randomizer.nextInt(500));
		}
		listLength = mainList.size();
	}
}
