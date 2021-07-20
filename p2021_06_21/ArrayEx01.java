package p2021_06_21;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열 : 동일한 자료형의 데이터를 저장하ㅏ기 위한 정적인 자료구조
//		변수 -> 배열 -> 자료구조(List)
//		
//		1차원 배열 첫번째 형식 : 배열에 지정될 값이 정해져 있지 않은 경우에 주로 사용
		
		int[] score = new int[3];
		
		System.out.println(score[0]); //초기값은 0
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		score[0] = 80;
		score[1] = 90;
		score[2] = 100;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		double[] d = new double[3];
		System.out.println(d[0]);  //초기값은 0.0
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		char[] c = new char[3];
		System.out.println(c[0]); // char 배열은 자동으로 초기화가 안됨
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		boolean[] b = new boolean[3];
		System.out.println(b[0]); // boolean 배열은 false로 초기화됨
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		String[] str = new String[3];
		System.out.println(str[0]); // string 배열은 null로 초기화됨
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		str[0]="자바";
		str[1]="오라클";
		str[2]="스프링";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
//		1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할 때 주로 사용
//		(배열에 할당된 값이 정해져 있는 경우에 주로 사용)
		
		int[] s = {80,90,100};
		int[] s1 = new int[] {80,90,100};
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println("배열의 크기:"+ s.length);
		for(int i = 0 ; i < s.length; i++) {
			System.out.print(s[i]+"\t");
		}
		System.out.println();
		
		double[] dd = {3.14, 10.5, 42.195};
		for(int i = 0; i <dd.length; i++) {
			System.out.print(dd[i]+"\t");
		}
		System.out.println();
		
		char[] cc = {'j','a','v','a','자','마'};
		for(int i = 0; i < cc.length; i++) {
			System.out.print(cc[i]+"\t");
		}
		System.out.println();
		
		boolean[] bb = {true, false, true};
		for(int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]+"\t");
		}
		System.out.println();
		
		String[] str1 = {"자바","오라클","스프링","파이썬","텐스플로우"};
		String[] str2 = new String[] {"자바","오라클","스프링","파이썬","텐스플로우"};
		for(int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]+"\t");
		}
	}
		
}


