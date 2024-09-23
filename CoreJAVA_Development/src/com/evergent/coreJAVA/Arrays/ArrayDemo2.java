package com.evergent.coreJAVA.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr[]= new int[5];
		arr[0]=60;
		arr[1]=10;
		arr[2]=20;
		arr[3]=30;
		arr[4]=70;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println();
		for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
