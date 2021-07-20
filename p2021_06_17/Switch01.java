package p2021_06_17;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	정수를 입력 받았을 때 어느 학점에 해당하는가를 판별
//	90점이상 - A 
//	80점이상 - B 
//	70점이상 - C 
//	60점이상 - D 
//	60점미만 - F 
		System.out.println("학점을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		s = s/10;
		s = s*10;
		switch(s) {
		case 100 :
		case 90 : System.out.println("A학점");
		break;
		case 80 : System.out.println("B학점");
		break;
		case 70 : System.out.println("C학점");
		break;
		case 60 : System.out.println("D학점");
		break;
		default : System.out.println("F학점");
		}
	}

}
