package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void uniCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char word1 = sc.next().charAt(0);
		System.out.printf("%c unicode : %d\n\n", word1, (int)word1);
		
		sc.nextLine();
		
		System.out.print("문자 : ");
		String word2 = sc.nextLine();
		System.out.printf("%c unicode : %d", word2.charAt(0), (int)word2.charAt(0));
		
	}

}
