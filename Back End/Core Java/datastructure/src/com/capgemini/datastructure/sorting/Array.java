package com.capgemini.datastructure.sorting;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements present in Array");
			arr[i] = sc.nextInt();
		}
		int result1[] = BubbleSort.bubbleSort(arr);
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
			
			
		}
	}

}
