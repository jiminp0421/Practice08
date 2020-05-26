package com.javaex.ex01;

public class LastNumberApp {

	public static void main(String[] args) {
		
		
		int[] intArray = new int[] {3,6,9};
		
		try {
		System.out.println(intArray[3]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 범위를 넘었습니다.");
			System.out.println();
		}
		

	}

}
