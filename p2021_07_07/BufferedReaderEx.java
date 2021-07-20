package p2021_07_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 구구단 1개를 입력받아서, 구구단 한개단을 출력하는 프로그램
		System.out.println("원하는 단을 입력하세요");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String dan = br.readLine();
			int num = Integer.parseInt(dan);
			for(int i = 1; i <= 9; i++) {
				System.out.println(num+"x"+i+"="+num*i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
