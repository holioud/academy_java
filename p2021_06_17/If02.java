package p2021_06_17;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n1 = sc.nextInt();
		if(n1%2==1)
			System.out.println("홀수입니다");
		else
			System.out.println("짝수입니다");
	}

}
