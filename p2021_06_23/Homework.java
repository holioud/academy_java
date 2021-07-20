package p2021_06_23;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottoNum = new int[6];
		int num;
		for(int i = 0; i<lottoNum.length; i++) {
			num = (int) (Math.random()*45)+1;
			
			for(int j = 0; j < lottoNum.length+1; j++) {
				if(j == lottoNum.length) {
					lottoNum[i] = num;
					break;
				}
				if(num == lottoNum[j]) {
					lottoNum[i]=0;
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lottoNum[i]+" ");
		}
	}

}
