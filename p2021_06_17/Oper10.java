package p2021_06_17;

public class Oper10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		증감 연산자
//		++a와 a++의 차이
		int a=10, b=10, c=10, d=10;
		int a1, b1, c1, d1;
		
		a1 = ++a;
		b1 = b++;
		c1 = --c;
		d1 = d++;
		
		System.out.println("a1:"+a1+" a="+a);
		System.out.println("b1:"+b1+" b="+b);
		System.out.println("c1:"+c1+" c="+c);
		System.out.println("d1:"+d1+" d="+d);
	}

}
