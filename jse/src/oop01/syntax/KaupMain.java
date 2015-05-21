package oop01.syntax;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		
		
		double height = 0;
		double weight = 0;
		kaupVO vo = new kaupVO(height, weight) ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 :");
		height = scanner.nextDouble();
		vo.setHeight(height);
		
		System.out.println("몸무개를 입력하세요 :");
		weight = scanner.nextDouble();
		vo.setWeight(weight);
		
		/*
		int idx=0;
		vo.setIdx(idx);
		vo.getWeight();
		*/
		
		System.out.println(vo.toString());
		System.out.println("완료");
		
	}
}
