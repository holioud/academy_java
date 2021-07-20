package p2021_06_25;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calender c1 = enw Canlender();			// 오류 발생
		Calendar c2 = new GregorianCalendar(); // 업캐스팅
		Calendar c = Calendar.getInstance();
		String[] dayOfWeek = {"토요일","일요일","월요일","화요일","수요일","목요일","금요일"};
//		System.out.println(c);
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);
		int hh = c.get(Calendar.HOUR);
		int mm = c.get(Calendar.MINUTE);
		int ss = c.get(Calendar.SECOND);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(y+"/"+m+"/"+d+" "+hh+":"+mm+":"+ss+" "+dayOfWeek[dow]);
	}

}
