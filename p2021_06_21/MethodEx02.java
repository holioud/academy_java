package p2021_06_21;

public class MethodEx02 {
	
	// 1 ~ n까지 합을 구하는 메소드
	static void sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 n까지의 합 : "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5);

	}

}
