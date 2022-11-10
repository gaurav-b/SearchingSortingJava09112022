package com.self.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = {3,0,1,8,7,2,5,4,9,6};
		
		insertionSort(arr);
	}

	/**
	 * Logic: it is starting from the index 1 till the last index
	 * and comparing the elements one by one while traversing backwards
	 * it will stop swapping and stop backtracking when even one comparison fails
	 * and there is no need of any swap after that. It will continue till it reaches the end
	 * 
	 * @param arr
	 */
	private static void insertionSort(int[] arr) {
		
		for (int endIndex=1; endIndex<=arr.length-1; endIndex++) {
			
			for (int i = endIndex; i>0; i--) {
				if (arr[i]<arr[i-1]) {
					// do the swap
					arr[i]+=arr[i-1];
					arr[i-1]=arr[i]-arr[i-1];
					arr[i]=arr[i]-arr[i-1];
				} else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
