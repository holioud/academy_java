package p2021_06_25;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 날짜 시간 관련 클래스 : Date, Timestamp
		// 1. Date
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss EEE요일");
		// hh : 12시간제 시간
		// HH : 24시간제 시간
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(sd.format(d));
		
		// 2. Timestamp
		
		// 년, 월, 일, 시 , 분, 초 로 날씨 출력
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println(sf.format(ts));
	}

}
