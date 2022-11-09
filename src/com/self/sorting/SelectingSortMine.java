package com.self.sorting;

import java.util.Arrays;
import java.util.Iterator;

public class SelectingSortMine {

	public static void main(String[] args) {

		int[] arr = {56,89,77,10,84};
		
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		
		int startIndex=0, endIndex=arr.length-1;
		int indexOfLargestNum;
		
		while (startIndex!=endIndex) {
			
			// resetting the index of largest number
			indexOfLargestNum=0;
			
			for (int i = 1; i < endIndex; i++) {
				// find the index of the largest number in the array 
				if (arr[indexOfLargestNum]>arr[i]) {
					// do nothing
				} else {
					indexOfLargestNum = i;
				}
			}
			
			// and swap the largest number with the elem at endIndex
			arr[endIndex] += arr[indexOfLargestNum];
			arr[indexOfLargestNum] = arr[endIndex] - arr[indexOfLargestNum];
			arr[endIndex] = arr[endIndex] - arr[indexOfLargestNum];
			
			endIndex--;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
