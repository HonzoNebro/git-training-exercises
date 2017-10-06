package com.lonebapps.cajondesastre.tiposprimitivos;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = {0,-7,55};
		int[] arr2 = new int [3];
		int[][] arr3 = {arr1, null};
		int[][] arr4 = new int[2][2];
		int[][][] arr5 = {arr4,arr3, null};
		arr4[0][0] = 100;
		arr2 = arr1;
		arr2[1] = 666;
		arr5[1][0][0]++;
		System.out.println(arr5[1][0][1]);
		
		
	}

}
