package com.kh.variable;

public class D_printf {
	
	public void printTest() {
	/*
	 * println() => 값 출력 후 자동 개행(\n)
	 * print() => 값만 출력한 후 종료
	 * printf("출력할 형식", 형식에 맞는 값들 ...)
	 *  => f는 format의 약자.
	 *  => 형식에 맞춰서 값들을 출력한 후 종료.( 줄바꿈X )
	 *  문자열에 추가 가능한 형식
	 *  %d : 정수
	 *  %f : 실수
	 *  %c : 문자
	 *  %s : 문자열
	 */
	// 정수 테스트
	int iNum1 = 10;
	int iNum2 = 20;
	
	// iNum1 : xx, iNum2 : xx 을 출력해보자
	// println문을 활용하여 출력문 만들기
	
	System.out.println("iNum1 :"+iNum1+", iNum2 : "+iNum2);
	//printf문을 사용
	System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
	
	// 실수 테스트
	double dNum = 4.27546789;
	System.out.printf("dNum: %f", dNum);
	//%f => 소수점 아래 6번째 까지만 출력.
	
	System.out.printf("dNum: %.3f", dNum);
	// 소수점 아래 첫번째 자리만 출력하고 싶다면? %.xf
	
	// %와 d사이에 숫자를 넣으면 그만큼 공백이생김.
	// %5d 의 경우 5칸의 공백이 생김.
	}
	
}
