package p2021_07_05;

class TestClass02 {
	private Object member;

	public void setValue(Object value) {
		member = value;	// Object value = 3;
	}

	public Object getValue() {
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass02 obj01 = new TestClass02();
		
		// Object value = 3;			오토박싱 + 업캐스팅
		// Object value=new Integer(3);	박싱 + 업캐스팅
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		// 다운캐스팅 + 언박싱
		int n01 = ((Integer)(obj01.getValue())).intValue();
		int n02 = (Integer)(obj01.getValue());	//다운캐스팅+오토언박싱

		// Object value = 3.4;			 오토박싱 + 업캐스팅
		// Object value=new Double(3.4); 박싱 + 업캐스팅
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		// 다운캐스팅 + 언박싱
		double n03 = ((Double)(obj01.getValue())).doubleValue();
		double n04 = (Double)(obj01.getValue());//다운캐스팅+오토언박싱

		// Object value = "이해할 수 있다.";			 	 업캐스팅
		// Object value=new String("이해할 수 있다.");	 업캐스팅
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());

		String str = (String)obj01.getValue();	// 다운 캐스팅
	}
}
