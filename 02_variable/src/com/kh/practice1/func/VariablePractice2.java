package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void gyesangi() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int secondNum = sc.nextInt();
		
		int plus = firstNum + secondNum;
		int minus = firstNum - secondNum;
		int multiply = firstNum * secondNum;
		int devide = firstNum / secondNum;
		
		System.out.printf("더하기 결과 : %d\n", plus);
		System.out.printf("빼기 결과 : %d\n", minus);
		System.out.printf("곱하기 결과 : %d\n", multiply);
		System.out.printf("나누기 결과 : %d\n", devide);
		
		System.out.println("======================");
		
	}

}
