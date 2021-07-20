package p2021_06_21;

public class MethodEx01 {

	// 사용자 정의 메소드
	static void check() {    //static : 정적 메소드
		System.out.println("메소드 호출 성공");
		return;
	}
	
	static void check(int a) {
		System.out.println("전달된  값:"+a);
	}
	
	static void check(int a, double d) {
		double result = a + d;
		System.out.println("전달된 값의 합:"+result);
		
	}
	
	static void check(char c) {
		System.out.println("전달된 값:"+c);
	}
	
	static void check(boolean i) {
		System.out.println("전달된 값:"+i);
	}
	
	static void check(String s) {
		System.out.println("전달된값"+s);
	}
	static int check01() {
		System.out.println("출력");
		return 10;
	}
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx01.check();
		check();
		check(30);
		check(10,20.5);
		check('a');
		check(true);
		check("hello");
		int result = check01();
		System.out.println("돌려받은값1:"+ result);
		System.out.println("돌려받은값2:"+ check01());
		System.out.println("돌려받은값3:"+ result);
		System.out.println("돌려받은값4:"+ check02(50, 3.1));
		
		
	}

}
