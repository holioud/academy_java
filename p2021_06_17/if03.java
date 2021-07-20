package p2021_06_17;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if(n1>n2) {
			max = n1;
			min = n2;
		}
		else
		{
			max = n2;
			min = n1;
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	}

}
