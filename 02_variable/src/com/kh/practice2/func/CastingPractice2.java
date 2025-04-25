package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void score() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		float kor = sc.nextFloat();
		System.out.print("영어 : ");
		float eng = sc.nextFloat();
		System.out.print("수학 : ");
		float math = sc.nextFloat();
		
		int subJectCount = 3;
		
		int allscore = (int) (kor+eng+math);
		int average = allscore/subJectCount;
		
		System.out.printf("\n총점 : %d\n", allscore);
		System.out.printf("평균 : %d", average);
	}

}
