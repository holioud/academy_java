package p2021_06_23;

// p217 ~ 218

class Calculator{
	// 메소드 
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.powerOn();
		System.out.println("result1:"+c1.plus(2, 1));
		System.out.println("result2:"+c1.divide(10,3));
		c1.powerOff();
	}

}
