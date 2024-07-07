package main.java.InterviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSOrt {

	private static List<Integer> mainList = new ArrayList<>();
	private static Random randomizer = new Random();
	
	public static void main(String[] args) {
		fillList(50);
			
		System.out.println(mainList);
		sort(mainList);
		System.out.println(mainList);
	}
	
	private static void sort(List<Integer> toOrderList) {
		
		int listLength = toOrderList.size();
		int pivotElement = toOrderList.get(listLength-1);
		
		boolean checker = true;
		
		while(checker) {
			
			int leftBoundIndex = listLength+1;
		
			for(int idx = 0;idx<listLength;idx++) {
				if(toOrderList.get(idx)>pivotElement) {
					leftBoundIndex = idx;
					break;
				}
			}
			
			
			int rightBoundIndex = leftBoundIndex;
		
			for(int idx = listLength-1;idx>=leftBoundIndex;idx--) {
				if(toOrderList.get(idx)<pivotElement) {
					rightBoundIndex = idx;
					break;
				}
			}
			
			if(leftBoundIndex == listLength+1) {
				List<Integer> subList = toOrderList.subList(0, listLength-1);
				if(subList.size()>=2) {
					
					sort(subList);
				}
				checker = false;
			} else if(rightBoundIndex == leftBoundIndex) {
				swapElements(toOrderList, leftBoundIndex, listLength-1);
				
				List<Integer> frontSubList = toOrderList.subList(0, leftBoundIndex);
				List<Integer> backSubList = toOrderList.subList(leftBoundIndex+1, listLength);
				
				if(frontSubList.size()>=2) {
					sort(frontSubList);
				}
				
				if(backSubList.size()>=2) {
					sort(backSubList);
				}
				
				checker = false;
			} else {
				swapElements(toOrderList, leftBoundIndex, rightBoundIndex);
			}
		}
		
	}
	
	private static void swapElements(List<Integer> list,int leftBoundIndex,int rightBoundIndex) {
		
		int temporary = list.get(leftBoundIndex);
		list.set(leftBoundIndex,list.get(rightBoundIndex));
		list.set(rightBoundIndex,temporary);
	}
	
	public static void fillList(int records) {
		//Collections.addAll(mainList,10,70,40,90,50);
		//Collections.addAll(mainList,64, 34, 25, 12, 22, 11, 90, 5);
		for(int idx = 0;idx<records;idx++) {
			mainList.add(randomizer.nextInt(500));
		}
	}
}
