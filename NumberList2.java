package com.Luigi;

import java.util.*;

public class NumberList2 {
	
	public static void CountNumbers(ArrayList<Integer> Numbers) {
		Set<Integer> Final = new HashSet<Integer>(Numbers);
		for(Integer i : Final) {
			if(Collections.frequency(Numbers, i) > 1) {
				System.out.println("Number " + i + " repeated: " + Collections.frequency(Numbers, i));
			}
		}	
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> Count = new ArrayList<Integer>() {{
		add(15);
		add(11);
		add(15);
		add(18);
		add(19);
		add(12);
		add(11);
		add(1);
		add(2);
		add(2);
		add(3);
		add(17);
		add(6);
		add(1);
		add(3);
		add(4);
		add(7);
		add(8);
		add(21);
		add(22);
		add(23);
		add(25);
		add(24);
		add(25);
		add(30);
		add(20);
		add(10);
		add(26);
		add(29);
		add(28);
		}};
		CountNumbers(Count);
	}
}