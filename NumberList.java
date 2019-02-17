package com.Luigi;

import java.util.ArrayList;

public class NumberList {
	
	NumberList() {	
	}
	
	public void CountNumbers(ArrayList<Integer> numbers) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, j = 0, k = 0;
		for(int i = 0; i < numbers.size(); i++) {
			numbers.contains(numbers.get(i));
				switch (numbers.get(i)) {
					case 0:
						a += 1;
					break;
					case 1:
						b += 1;
					break;
					case 2:
						c += 1;
					break;
					case 3:
						d += 1;
					break;
					case 4:
						e += 1;
					break;
					case 5:
						f += 1;
					break;
					case 6:
						g += 1;
					break;
					case 7:
						h += 1;
					break;
					case 8:
						j += 1;
					break;
					case 9:
						k += 1;
					break;
			}
		}
		if(a > 1) {
			System.out.println("Number 0 repeated:" + a + "times");
		}
		if(b > 1) {
			System.out.println("Number 1 repeated:" + b + "times");
		}
		if(c > 1) {
			System.out.println("Number 2 repeated:" + c + "times");
		}
		if(d > 1) {
			System.out.println("Number 3 repeated:" + d + "times");
		}
		if(e > 1) {
			System.out.println("Number 4 repeated:" + e + "times");
		}
		if(f > 1) {
			System.out.println("Number 5 repeated:" + f + "times");
		}
		if(g > 1) {
			System.out.println("Number 6 repeated:" + g + "times");
		}
		if(h > 1) {
			System.out.println("Number 7 repeated:" + h + "times");
		}
		if(j > 1) {
			System.out.println("Number 8 repeated:" + j + "times");
		}
		if(k > 1) {
			System.out.println("Number 9 repeated:" + k + "times");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> Repeat = new ArrayList<Integer>();
		Repeat.add(2);
		Repeat.add(5);
		Repeat.add(8);
		Repeat.add(7);
		Repeat.add(3);
		Repeat.add(5);
		Repeat.add(6);
		Repeat.add(2);
		Repeat.add(2);
		Repeat.add(9);
	    NumberList MyAnalyze = new NumberList();
	    MyAnalyze.CountNumbers(Repeat);
	}
	
}