package main.java.InterviewPrep;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetGame {

	private static Random randomizer = new Random();
	
	public static void main(String[] args) {
		Set<Integer> nhs = new HashSet<>();
		
		for(int i = 0;i<100;i++) {
			nhs.add(randomizer.nextInt(1,101));
		}
		
		System.out.println(nhs.size() + " "+nhs);
	}
}
