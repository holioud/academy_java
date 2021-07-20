package p2021_07_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result.txt에 저장할 문장을 작성해주세요");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
			String str = br.readLine();
			System.out.println(str);
			bw.write(str);
			bw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
