package p2021_06_17;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, max, min=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력해주세요");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1>=n2 && n1>=n3) {
			max = n1;
			if(n2 >= n3)
				min = n3;
		}else if(n2 >= n3) {
			max = n2;
			if(n1>=n3)
				min = n3;
		}else {
			max = n3;
			if(n1>=n2)
				min = n2;
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
