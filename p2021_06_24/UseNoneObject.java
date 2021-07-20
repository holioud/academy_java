package p2021_06_24;

public class UseNoneObject {

    public static void main( String[] args ) {
    
    NoneObject no = new NoneObject();
    System.out.println("no.number = " + no.number);
    no.printNumber();
    
    System.out.println("NoneObject.number = " + 
									NoneObject.number);
    NoneObject.printNumber();
    
    }
}    