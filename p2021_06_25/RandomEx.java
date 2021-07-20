package p2021_06_25;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생 방법 : 1. Math.random(), 2. Random 클래스
		
		Random r = new Random();
		int n1 = r.nextInt(10);
		System.out.println(n1);
		
		// 1~45 사이의 난수 발생
		int n2 = r.nextInt(45)+1;
		System.out.println(n2);
	}

}
