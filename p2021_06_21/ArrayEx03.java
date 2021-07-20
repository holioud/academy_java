package p2021_06_21;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 키보드로 5과목의 점수를 입력 받아서, 총점과 평균을 구하는 프로그램
		
		int[] score = new int[5];;
		int sum = 0,  avg = 0;
		System.out.println("5과목의 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println("5과목의 합은:"+sum);
		System.out.println("5과목의 평균은:"+sum/5);
	}

}
