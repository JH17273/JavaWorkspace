package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		System.out.print("\n");
		
		System.out.printf("1인당 사탕 개수 : %d\n", candy/people);
		System.out.printf("남는 사탕 개수 : %d", candy%people);
		
	}
	
	public void practice2() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classnum = sc.nextInt();
		System.out.print("번호 : ");
		int number = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		char sex = (gender == 'M') ? '남' : '녀';
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float score = sc.nextFloat();
		System.out.print("\n");
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.", grade, classnum, number, name, sex, score);
	}
	
	public void practice3() {
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		String old = ( age <= 13 ) ? "어린이" : ( age > 19 ) ? "성인" : "청소년";
		System.out.println(old);
	}
	
	public void practice4() {
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		float average = (float)(total/3.0);
		
		boolean pass = (math >= 40) && (eng >= 40) && (math >= 40) && (average >= 60);
		
		
		System.out.printf("합계 : %d \n", total);
		System.out.printf("평균 : %.1f\n", average);
		
		System.out.println(pass ? "합격" : "불합격");
	}
	
	public void practice5() {
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		int genderNum = sc.nextLine().charAt(7);
		
		String result = (genderNum == '1' || genderNum == '3') ? "남자" :
			(genderNum == '2' || genderNum == '4') ? "여자" : "올바른 값이 아닙니다.";
		
		System.out.println(result);
	}
	
	public void practice6() {
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.println((num1 >= num3 || num2 < num3) ? "true" : "false");
	}
	public void practice7() {
		
		System.out.print("입력1 : ");
		double num1 = sc.nextDouble();
		System.out.print("입력2 : ");
		double num2 = sc.nextDouble();
		System.out.print("입력3 : ");
		double num3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print((num2 == num3 && num1 == num3) ? "true" : "false");
		
	}
	public void practice8() {
		
		System.out.print("A사원의 연봉 : ");
		double aMoney = sc.nextDouble();
		System.out.print("B사원의 연봉 : ");
		double bMoney = sc.nextDouble();
		System.out.print("C사원의 연봉 : ");
		double cMoney = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("A사원 연봉/연봉+a : %.0f/%.1f\n%s\n", aMoney, aMoney*1.4, (aMoney >= 3000 ? "3000만원이상"
		: "3000만원 미만\n"));
		System.out.printf("B사원 연봉/연봉+a : %.0f/%.1f\n%s\n", bMoney, bMoney, (bMoney >= 3000 ? "3000만원이상"
				: "3000만원 미만\n"));
		System.out.printf("C사원 연봉/연봉+a : %.0f/%f\n%s\n", cMoney, cMoney*1.15, cMoney >= 3000 ? "3000만원이상"
				: "3000만원 미만");
	}

}
