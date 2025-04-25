package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 : 
			System.out.println("수정 메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회 메뉴입니다.");
			break;
		case 4 : 	
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7 : 
			System.out.println("프로그램이 종료됩니다.");
			break;
		default : 
			System.out.println("잘못된 번호입니다.");
			return;
		}
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && (num % 2 ==0)) {
			System.out.println("짝수다");
		}else if(num % 2 == 1){
			System.out.println("홀수다");
		}else{
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int total = kor+math+eng;
		int subJectCount = 3;
		double average = (kor+math+eng) / subJectCount;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && average >= 60) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+total);
			System.out.println("평균 : "+average);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		String season = "";
		
		switch(num) {
		case 12 : 
		case 1 : 
		case 2 :
			season = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			season = "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			season = "여름";
			break;
		case 9 :
		case 10 :
		case 11 :
			season = "가을";
			break;
		default : 
			System.out.println(num+"월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.printf("%d월은 %s입니다.", num, season);
	}
	
	public void practice5() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		if(id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		}else if(id.equals("myId")) {
				System.out.println("비밀번호가 틀렸습니다.");
		}else if(pw.equals("myPassword12")) {
					System.out.println("아이디가 틀렸습니다.");
			}
		}
	
	public void practice6() {
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String position = sc.nextLine();
		
		switch(position) {
			case "관리자" : 
				System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
				break;
			case "회원" : 
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
				break;
			default : 
				System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		System.out.println("BMI 지수 : "+bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else if(bmi >= 30) {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/*%) : ");
		char operators = sc.next().charAt(0);
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("잘못 입력하셨습니다.프로그램을 종료합니다.");
		}
		
		switch(operators) {
		case '+' : 
		case '-' : 
		case '*' : 
		case '/' : 
		case '%' : 
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.프로그램을 종료합니다.");
			return;
		}
		double result = 0;
		
		
		switch(operators) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' : 
			result = num1 * num2;
			break;
		case '/' : 
			result = (double) num1 / num2;
			break;
		case '%' : 
			result = num1 % num2;
			break;
		}
		System.out.printf("%d %c %d = %f", num1, operators, num2, result);
		}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		double score1 = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double score2 = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double score3 = sc.nextDouble();
		System.out.print("출석 회수 : ");
		double attendance = sc.nextDouble();
		
		double score1_1 = score1*0.2;
		double score2_1 = score2*0.3;
		double score3_1 = score3*0.3;
		
		double result = score1_1+score2_1+score3_1+attendance;
		
		System.out.println("================= 결과 =================");
		
		if(attendance <= 14) {
			System.out.println("Fail [출석 회수 부족 (10/20)]");
			return;
		}else {
			System.out.println("중간 고사 점수(20) : "+score1_1);
			System.out.println("기말 고사 점수(30) : "+score2_1);
			System.out.println("과제 점수(30)\t : "+score3_1);
			System.out.println("출석 점수(20)\t : "+attendance);
			System.out.println("총점 : "+result);
		}if(result < 70) {
			System.out.println("Fail [점수 미달]");
		}else {
				System.out.println("PASS");
				
			}
		}
	
	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("10. 비밀번호 입력");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
			case 1 : practice1();
			break;
			case 2 : practice2();
			break;
			case 3 : practice3();
			break;
			case 4 : practice4();
			break;
			case 5 : practice5();
			break;
			case 6 : practice6();
			break;
			case 7 : practice7();
			break;
			case 8 : practice8();
			break;
			case 9 : practice9();
			break;
			case 10 : practice11();
			break;
		}
	}
	
	public void practice11() {
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();
		
		if(pw < 1000 || pw > 9999 ) {
			System.out.println("자리수 안맞음");
			return;
		}
		int i1 = pw / 1000;
		int i2 = (pw / 100)%10;
		int i3 = (pw / 10)%10;
		int i4 = pw % 10;
		
		
		if(i1 == i2 || i2 == i3 || i3 == i4 || i1 == i4 || i2 == i3 || i2 == i4) {
			System.out.println("실패");
		}else {
				System.out.println("성공");
			}
		}
	}
