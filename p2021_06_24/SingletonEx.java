package p2021_06_24;

// p244

class Singleton{
	
	// 싱글톤(Singleton) : 객체 생성을 1번만 수행
	private static Singleton s = new Singleton(); // 정적 필드
	
	public static Singleton getInstance() { 	   // 정적 메소드
		return s;
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Singleton.s);  접근이 아님

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1 == obj2) {		// 주소값 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	}

}
