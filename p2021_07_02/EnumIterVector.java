package p2021_07_02;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumIterVector {

	public static void main(String[] args) {

		// Vector 객체 생성
		Vector v = new Vector(1, 1);

		// Vector에 Object 저장
		v.add(30);
		v.addElement(new Integer(10));
		v.addElement("johnharu");
		v.addElement("gracedew");
		
		System.out.println(v);
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) +"\t");
		}
		System.out.println();
		
		
		// 나열형(Enumeration) : 30, 10, "johnharu", "gracedew"
		Enumeration e = v.elements();
		// Enumeration을 이용해 Vector의 Object를 출력
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement()+"\t");
		}
		System.out.println();

		
		// 반복자(Iterator) : 30, 10, "johnharu", "gracedew"
		Iterator ie = v.iterator();
		// Iterator을 이용해 Vector의 Object를 출력
		while (ie.hasNext()) {
			System.out.print(ie.next() + "\t");
		}

	} // main end
}
