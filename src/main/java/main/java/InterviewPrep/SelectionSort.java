package main.java.InterviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {

	private static List<Integer> mainList = new ArrayList<>();
	private static Random randomizer = new Random();
	private static int listLength = 0;
	
	public static void main(String[] args) {
		fillList(25);
		
		System.out.println(mainList);
		sort();
		System.out.println(mainList);
	}
	
	private static void sort() {
		
		
		List<Integer> backListPart = new ArrayList<>();
		
		for(int idx = 0;idx<listLength;idx++) {
			
			if(idx == 0) {
				backListPart = mainList;
			}else {
				backListPart = mainList.subList(idx, listLength);
			}

			int minValue = backListPart.stream().min(Integer::compareTo).get();
			int minValIdx = backListPart.indexOf(minValue);
			
			if(minValIdx != 0) {
				backListPart.remove(minValIdx);
				backListPart.add(0,minValue);
			}
		}
	}
	
	public static void fillList(int records) {
		//Collections.addAll(mainList,7,12,9,11,3);
		for(int idx = 0;idx<records;idx++) {
			mainList.add(randomizer.nextInt(51));
		}
		listLength = mainList.size();
	}
}
