package p2021_06_29;

import java.text.DecimalFormat;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat numberFormat = new DecimalFormat();
		numberFormat.setMaximumFractionDigits(2); // 둘째자리까지만
		int r = 5; // 원의 반지름
		double pi = Math.PI;
		//                 원주         면적        표면적             부피
		double[] value = {2*pi*r,pi*r*r,4*pi*r*r,4*pi*r*r*r/3};
		String[] name = {"원주","면적","표면적","부피"};
		for(int i= 0; i < 4; i++) {
			System.out.print(name[i]+"\t");
			System.out.println(numberFormat.format(value[i]));
		}
	}

}
