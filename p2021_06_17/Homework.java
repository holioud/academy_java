package p2021_06_17;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result=1;
		for(int i = n; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);
			
	}

}
