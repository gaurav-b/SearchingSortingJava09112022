package com.self.sorting;

import java.util.Arrays;

public class BubbleSortMine {

	public static void main(String[] args) {
		
		int[] arr = {56,89,77,10,84};
		
		bubbleSort(arr);

	}

	private static void bubbleSort(int[] arr) {
		
		int count = 0;
		while (count<arr.length) {
			for (int i = 0; i < arr.length-count-1; i++) {
				
				if (arr[i] > arr[i+1]) { // if elem1 is bigger than elem2, then swap
					arr[i]+=arr[i+1];
					arr[i+1]=arr[i]-arr[i+1];
					arr[i]-=arr[i+1];
				}
			}
			count++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
}
