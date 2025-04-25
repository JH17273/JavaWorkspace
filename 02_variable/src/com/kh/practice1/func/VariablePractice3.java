package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void rowcol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		float width = sc.nextFloat();
		System.out.print("세로 : ");
		float length = sc.nextFloat();
		
		float area = width*length;
		System.out.printf("면적 : %.2f\n", area);
		float perimeter = width+length;
		System.out.printf("둘레 : %.1f\n", perimeter);
		System.out.println("===================");
	}

}
