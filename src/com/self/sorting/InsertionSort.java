package com.self.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = {3,0,1,8,7,2,5,4,9,6};
		
		insertionSort(arr);
	}

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
