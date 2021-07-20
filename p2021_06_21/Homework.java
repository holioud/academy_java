package p2021_06_21;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min;
		int[] num = new int[5];
		max = 0;
		min = 0;
		System.out.println("정수 5개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		min = sc.nextInt();
		max = min;
		for(int i = 1; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i]>=max) max = num[i];
			if(num[i]<=min) min = num[i];
			
		}
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
	}

}
