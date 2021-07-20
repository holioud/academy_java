package p2021_06_21;

import java.util.Scanner;

public class MethodEx03 {

	// 키보드로 입력한 2개의 정수 중에서 최대값과 최소값으 구하는 프로그램
	
	static void test(int a, int b) {
		int max, min = 0;
		if(a >= b) {
			max = a; 
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		test(a,b);
	}

}
