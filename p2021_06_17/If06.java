package p2021_06_17;

public class If06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Math 클래스 난수 발생
// 0.0 <= Math.random() < 1.0		
		
		System.out.println("E="+Math.E);
		System.out.println("PI="+Math.PI);
		System.out.println(Math.random());
		
// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int) (Math.random()*6+1);
		System.out.println("num="+num);
		
		if(num==1) {
			System.out.println("1번");
		} else if(num==2) {
			System.out.println("2번");
		} else if(num==3) {
			System.out.println("3번");
		} else if(num==4) {
			System.out.println("4번");
		} else if(num==5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}
		
		
		System.out.println("1~45번 사이의 난수 발생");
		int r = (int) (Math.random() * 45) + 1;
		System.out.println("난수:"+r);
	}

}
