package com.exam;

public class Test2 {

	public static void main(String[] args) {
		int iArr[] = {3,29,38,12,57,74,40,85,61};
		int max = 0;
		int count = 0; 
		for(int i = 0; i<iArr.length; i++) {
			if(max < iArr[i]) {
				max = iArr[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}

}
