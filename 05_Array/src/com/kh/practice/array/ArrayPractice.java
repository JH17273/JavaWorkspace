package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int a[] = new int[10];
		int num = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = num++;
			System.out.print(a[i] + " ");
		}
	}

	public void practice2() {

		int a[] = new int[10];
		int num = a.length;
		for (int i = 0; i < a.length; i++) {
			a[i] = num--;
			System.out.print(a[i] + " ");
		}
	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num++;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String fruit[] = new String[5];
		fruit[0] = "사과";
		fruit[1] = "귤";
		fruit[2] = "포도";
		fruit[3] = "복숭아";
		fruit[4] = "참외";

		System.out.print(fruit[1]);
	}

//	메소드 명 : public void practice5(){}
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//	ex.
//	문자열 : application
//	문자 : i
//	application에 i가 존재하는 위치(인덱스) : 4 8 
//	i 개수 : 2

	public void practice5() {
		System.out.print("문자열 : "); // apple
		String abc = sc.next();
		char abc_1[] = abc.toCharArray(); // 문자열의 각각 알파벳을 하나하나 나눔

		System.out.print("문자 : "); // p
		char a = sc.next().charAt(0);

		int count = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", abc, a);
		for (int i = 0; i < abc.length(); i++) {
			if (abc_1[i] == a) {
				System.out.print((i + 1) + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d", a, count);
	}

	public void practice6() {

		String week[] = { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int i = sc.nextInt();

		if (i >= 0 && i < 7) {
			System.out.println(week[i] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice7() {
		System.out.print("정수 : ");
		int a = sc.nextInt();
		System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		int a_0 = sc.nextInt();
		System.out.print("배열 1번째 인덱스에 넣을 값 : ");
		int a_1 = sc.nextInt();
		System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		int a_2 = sc.nextInt();
		System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		int a_3 = sc.nextInt();
		System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		int a_4 = sc.nextInt();

		int num = a;
		int result = a_0 + a_1 + a_2 + a_3 + a_4;

		int b[] = new int[num];
		b[0] = a_0;
		b[1] = a_1;
		b[2] = a_2;
		b[3] = a_3;
		b[4] = a_4;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.print("총 합 : " + result);
	}

//	메소드 명 : public void practice8(){}
//	3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요. 

	public void practice8() {

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			int arr[] = new int[num];

			// int mid = num / 2;
			// int value = 0;
			/*
			 * for(int i =0; i< num; i++) { if(i <= mid) { arr[i] = ++value; }else { arr[i]
			 * = --value; } System.out.print(arr[i]+" "); }
			 */
			for (int i = 0; i <= num / 2; i++) {
				arr[i] = i + 1;
				System.out.print(arr[i] + " ");
			}
			for (int i = num / 2 + 1; i < num; i++) {
				arr[i] = num - i;
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			break;
		}
	}

	public void practice9() {
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.next();

		String arr[] = { "양념", "후라이드", "뿌링클" };

		for (int i = 0; i < (arr.length); i++) {
			if (arr[i].equals(name)) {
				System.out.print(name + "치킨 배달 가능");
				return;
			}
		}
		System.out.println(name + "치킨은 없는 메뉴입니다.");
	}

	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String ab = sc.nextLine();

		char num[] = ab.toCharArray();
		char num2[] = new char[num.length];

		for (int i = 0; i < num.length; i++) {
			num2[i] = num[i];
		}
		for (int i = 8; i < num2.length; i++) {
			num2[i] = '*';
		}
		for (int i = 0; i < num2.length; i++) {
			char c = num2[i];
			System.out.print(c);
		}
	}

	public void practice11() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int k = (int) (Math.random() * 10) + 1;
			arr[i] = k;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int k = (int) (Math.random() * 10) + 1;
			arr[i] = k;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

	public void practice13() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			while (true) {
				int k = (int) (Math.random() * 10) + 1;
				int j;
				for (j = 0; j < i; j++) {
					if (arr[j] == k) {
						break;
					}
				}
				if (j == i) {
					arr[i] = k;
					break;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {
		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			while (true) {
				int k = (int) (Math.random() * 45) + 1;
				int j;
				for (j = 0; j < i; j++) {
					if (arr[j] == k) {
						break;
					}
				}
				if (j == i) {
					arr[i] = k;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
			// 여기에 출력값을 넣어줘도 되긴함! System.out.print(arr[i] + " ");
		}

		// 출력 ( 따로하는 이유는 유지보수 때문)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice15() {
		System.out.print("문자열 : "); // applepie
		String abc = sc.next();
		char abc_1[] = abc.toCharArray(); // 문자열의 각각 알파벳을 하나하나 나눔
		char abc_2[] = new char[abc_1.length];

		int index = 0;
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < abc_1.length; i++) {
			char ch = abc_1[i];
			boolean result = false;
			for (int j = 0; j < index; j++) {
				if (abc_2[j] == ch) {
					// abc_2에 이미 추가된 데이터
					result = true;
					break;
				}
			}
			if (!result) {
				abc_2[index++] = ch;
			}
		}
		char[] abc_2_2 = new char[index];
		System.arraycopy(abc_2, 0, abc_2_2, 0, index);

		for (int i = 0; i < abc_2_2.length; i++) {
			System.out.print(abc_2_2[i] + (i != abc_2_2.length - 1 ? ", " : ""));
		}

		System.out.println();
		System.out.println("문자 개수 : " + index);
	}

	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();

		String[] str = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			str[i] = sc.nextLine();
		}
		
		while(true) {
			
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		char ch = sc.nextLine().toLowerCase().charAt(0);

		if (ch == 'n') {
			System.out.println(Arrays.toString(str));
			return;
		}

		System.out.print("더 입력하고 싶은 개수 : ");
		int moreSize = sc.nextInt();
		sc.nextLine();

		String[] copy = new String[str.length + moreSize];
		System.arraycopy(str, 0, copy, 0, str.length); // 깊은 복사 완료
		
		for(int i = str.length;i < copy.length;i++) {
			System.out.printf("%d 번째 문자열 : ", i+1);
			copy[i] = sc.nextLine();
			}
		str = copy;
		}
	}
}