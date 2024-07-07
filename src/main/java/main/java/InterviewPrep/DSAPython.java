package main.java.InterviewPrep;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class DSAPython {
	
	private static ArrayList<Integer> randomList = new ArrayList<>();
	final static Random randomizer = new Random();
	//private static double maxSaleIndex = Double.POSITIVE_INFINITY;
	private static int maxSaleIndex = 0;
	private static int minPurchaseIndex = 0;
	private static int maxSale = 0;
	final static int listSize = 20;
	
	public static void main(String[] args) {
		fillAray(listSize);
		int counter = 0;
		
		
		int ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		for(int i = 0;i<randomList.size();i++) {
			
			if(minPurchaseIndex == 0 || randomList.get(i)<randomList.get(minPurchaseIndex)) {
				if(i < maxSaleIndex) {
					minPurchaseIndex = i;
				}else {
					List<Integer> restList = randomList.subList(i,listSize);
					int potentialNewMax = restList.stream().max(Integer::compareTo).get();
					counter++;
					if(!restList.isEmpty()&&(potentialNewMax-randomList.get(i)>maxSale)) {
						maxSale = potentialNewMax-randomList.get(i);
						minPurchaseIndex = i;
						maxSaleIndex = i+restList.indexOf(potentialNewMax);
					}
				}
			}
		}
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		String str3 = String.format("The purchasing value is maximized with a value of %d by purchasing for the value of %d at period %d and selling it for %d at period %d.",
				maxSale,randomList.get(minPurchaseIndex),minPurchaseIndex,randomList.get(maxSaleIndex),maxSaleIndex);
		System.out.println(str3);
		System.out.println("Counter has been executed "+counter+" times");
		
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		
		for(int i = 0;i<randomList.size();i++) {
			
			if(minPurchaseIndex == 0 || randomList.get(i)<randomList.get(minPurchaseIndex)) {
				List<Integer> restList = randomList.subList(i,listSize);
				int potentialNewMax = restList.stream().max(Integer::compareTo).get();
				counter++;
				if(!restList.isEmpty()&&(potentialNewMax-randomList.get(i)>maxSale)) {
					maxSale = potentialNewMax-randomList.get(i);
					minPurchaseIndex = i;
					maxSaleIndex = i+restList.indexOf(potentialNewMax);
				}
			}
		}
		ts = Calendar.getInstance().get(Calendar.MILLISECOND);
		System.out.println("Timestamp: "+ts);
		str3 = String.format("The purchasing value is maximized with a value of %d by purchasing for the value of %d at period %d and selling it for %d at period %d.",
				maxSale,randomList.get(minPurchaseIndex),minPurchaseIndex,randomList.get(maxSaleIndex),maxSaleIndex);
		System.out.println(str3);
		System.out.println("Counter has been executed "+counter+" times\n\n\n");
		
		maxSaleIndex = 0;
		minPurchaseIndex = 0;
		maxSale = 0;
		counter = 0;
	}
	
	public static void fillAray(Integer arrayLength) {
		for(int i = 0;i<arrayLength;i++) {
			randomList.add(randomizer.nextInt(20)+1);
		}
		System.out.println(randomList);
	}
}
