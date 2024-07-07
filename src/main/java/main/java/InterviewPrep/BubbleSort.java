package main.java.InterviewPrep;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {

	private static ArrayList<Integer> mainArray = new ArrayList<>();
	final static Random randomizer = new Random();
	private static int arrayLength;
	
	public static void main(String[] args) {
		fillArray(10);
		System.out.println(mainArray);
		sort();
		System.out.println(mainArray);
	}
	
	private static void sort() {
		int counter = 0;
		boolean controller = false;
		while(!controller) {
			counter++;
			controller = true;
			for(int i = 0;i<arrayLength-1;i++) {
				if(mainArray.get(i)>mainArray.get(i+1)) {
					controller = false;
					switchElements(i);
				}
			}
		}
		System.out.println(counter);
	}
	
	private static void switchElements(int i) {
		int temporary = mainArray.get(i+1);
		mainArray.set(i+1, mainArray.get(i));
		mainArray.set(i, temporary);
	}
	
	private static void fillArray(int a) {
		//Collections.addAll(mainArray, 7, 12, 9, 11, 3); 
		//Collections.addAll(mainArray, 7, 14, 11, 8, 9); 
		for(int idx = 0;idx < a;idx++) {
			mainArray.add(randomizer.nextInt(50));
		}
		arrayLength = mainArray.size();
	}
}
