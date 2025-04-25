package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void takeOutOf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 열을 입력하세요 : ");
		String type = sc.nextLine();
		
		
		System.out.printf("첫번째 문자 : %c\n", type.charAt(0));
		System.out.printf("두번째 문자 : %c\n", type.charAt(1));
		System.out.printf("세번째 문자 : %c\n", type.charAt(2));
		
		
		System.out.print("=================");
		
	}
	

}
