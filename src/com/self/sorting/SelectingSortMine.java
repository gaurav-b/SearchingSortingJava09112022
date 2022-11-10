package com.self.sorting;

import java.util.Arrays;
import java.util.Iterator;

public class SelectingSortMine {

	public static void main(String[] args) {

		int[] arr = {56,89,77,10,84};
		
		selectionSort(arr);
	}

	/**
	 * Logic: first it is marking start and the end indexs as 0 and the last index of the array,
	 * then it is looking for the largest number in the array and it is swapping it with the last index,
	 * (which in our case is the endIndex for the moment), then it marking the endIndex with the prv one
	 * of curr endIndex and keep going on with the above process of finding the largest number and swapping
	 * it with the endIndex.  
	 * 
	 * @param arr
	 */
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
