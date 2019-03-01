package com.Luigi;

import java.util.*;

public class NumberList3 {
	
	NumberList3() {	
	}
	
	public void CountNumbers(ArrayList<Integer> Numbers) {
		int i, j, Count;
		ArrayList<Integer> Final = new ArrayList<Integer>();
		for(i = 0; i < Numbers.size(); i++) {
			if(!(Final.contains(Numbers.get(i)))) {
				Final.add(Numbers.get(i));
				Count = 0;
				for(j = 0; j < Numbers.size(); j++) {
					if(Numbers.get(j).equals(Final.get(Final.size()-1))) {
						Count++;
					}
				}
				if(Count >= 2) {
					System.out.println("Number: " + Final.get(Final.size()-1) + " - Repeated: " + Count + " times");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> Count = new ArrayList<Integer>() {{
		add(2);
		add(5);
		add(8);
		add(7);
		add(3);
		add(5);
		add(6);
		add(2);
		add(2);
		add(9);
		}};
	    NumberList3 MyAnalyze = new NumberList3();
	    MyAnalyze.CountNumbers(Count);
	}
}