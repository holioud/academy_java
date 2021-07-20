package p2021_06_17;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//정수를 입력 받았을 때 어느 학점에 해당하는가를 판별
//90점이상 - A 
//80점이상 - B 
//70점이상 - C 
//60점이상 - D 
//60점미만 - F 
		System.out.println("학점을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=90)
			System.out.println("학점:A");
		else if(num>=80)
			System.out.println("학점:B");
		else if(num>=70)
			System.out.println("학점:C");
		else if(num>=60)
			System.out.println("학점:D");
		else
			System.out.println("학점:F");
	}

}
