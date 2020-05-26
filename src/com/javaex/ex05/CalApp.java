package com.javaex.ex05;
import java.util.Scanner;

public class CalApp {
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print(">> ");
			String sNum = sc.nextLine();

			if(sNum.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String[] sArray = sNum.split(" ");
			int a = Integer.parseInt(sArray[0]), b = Integer.parseInt(sArray[2]);
			String op = sArray[1];	

			if(op.equals("+")) {
				Add add = new Add();
				System.out.println(">> " + add.calculate(a, b));
			}
			else if(op.equals("-")) {
				Sub sub = new Sub();
				System.out.println(">> " + sub.calculate(a, b));
			}
			else if(op.equals("/")) {
				Division div = new Division();
				System.out.println(">> " + div.calculate(a, b));
			}
			else if(op.equals("*")) {
				Multiplication mul = new Multiplication ();
				System.out.println(">> " + mul.calculate(a, b));
			}
			else {
				System.out.println("알 수 없는 연산입니다.");
			}
			
			sc.close();
		}
	}
}
