package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int i = 1;
		for (; i <= num;) {
			System.out.print(i++ + " ");
		}
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
	}
}
	

	public void practice2() {

		int num;

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();

			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			} else {
				break;
			}
		}
		int i = 1;
		while (i <= num)
			System.out.print(i++ + " ");
	}

	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");

		while (num >= 1) {
			System.out.print(num-- + " ");
			if (num < 1)
				break;
		}

	}

	public void practice4() {

		int num;
		int i = 0;
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				break;
			}
		}
		while (num >= 1) {
			System.out.print(num-- + " ");
		}
	}

	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
		int sum = 0;
		for (int b = 1; a >= b; b++) {
			sum += b;
			if (b < a) {
				System.out.print(b + " + ");
			} else {
				System.out.print(b + " = " + sum);
			}
		}
	}

	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		if (a < 1 || b < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			return;
		}

		int start, end;
		
//		int min = num1 > num2 ? num2 : num1
//		int max = num1 > num2 ? num1 : num2
		
		if (a < b) {
			start = a;
			end = b;
		} else {
			start = b;
			end = a;
		}

		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
	}

	public void practice7() {

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int a = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int b = sc.nextInt();

			if (a < 1 || b < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				continue;
			}

			int start, end;

			if (a < b) {
				start = a;
				end = b;
			} else {
				start = b;
				end = a;
			}
			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");

			}
			break;
		}
	}

	public void practice8() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("===== " + num + "단=====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	public void practice9() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for (; num <= 9; num++) {
				System.out.printf("===== %d단 =====\n", num);
				for (int gop = 1; gop <= 9; gop++) {
					System.out.printf("%d * %d = %d\n", num, gop, num * gop);
				}
			}
		}
	}

	public void practice10() {

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			for (; num <= 9; num++) {
				System.out.printf("===== %d단 =====\n", num);
				for (int gop = 1; gop <= 9; gop++) {
					System.out.printf("%d * %d = %d\n", num, gop, num * gop);
				}
			}
			break;
		}
	}

	public void practice11() {
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int plus = sc.nextInt();

			// for (int i = 0; i < 10; i++) {
			// System.out.print(start + plus * i + " ");
			System.out.print(start + " ");
			start += plus;
			// int count = 0; //< 카운트 변수 선언 후
			// for(int i = start; count < 10 ; start += plus ) {
			// System.out.print(start +" ");
			// count ++;
		}
	public void practice12() {
		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String oper = sc.next();

			if (oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			int a = sc.nextInt();
			System.out.print("정수2 : ");
			int b = sc.nextInt();

			if (!(oper.equals("+") || oper.equals("-") || oper.equals("*") || 
					oper.equals("/") || oper.equals("%"))) {
				System.out.println("없는 연산자입니다.다시 입력해주세요");
				continue;
			}

			if ((oper.equals("/") || oper.equals("%")) && b == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			int result = 0;
			switch (oper) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
			case "%":
				result = a % b;
				break;
			}
			System.out.printf("%d %s %d = %d\n", a, oper, b, result);
		}
	}

	public void practice13() {
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
