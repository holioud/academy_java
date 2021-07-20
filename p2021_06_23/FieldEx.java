package p2021_06_23;

//p202
class FieldInitValue{
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	float floatField;
	double doubleField;
	
	char charField;
	boolean booleanField;
	
	int[] arrField;
	String referenceField;
	
}

public class FieldEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldInitValue f = new FieldInitValue();
		System.out.println(f.byteField);
		System.out.println(f.shortField);
		System.out.println(f.intField);
		System.out.println(f.longField);
		
		System.out.println(f.floatField);
		System.out.println(f.doubleField);
		
		System.out.println(f.charField);
		System.out.println(f.booleanField);
		
		System.out.println(f.arrField);
		System.out.println(f.referenceField);
	}

}
