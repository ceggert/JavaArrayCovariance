package com.guseggert.javaarraycovariance;

public class JavaArrayCovariance {
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3};
		Object[] objArray = new String[3];
		
		objArray[0] = intArray[0];
	}
}
