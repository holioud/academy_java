package p2021_06_23;

class MyDate05{   
  private int year;    
  private int month;    
  private int day;

  public MyDate05(){
  }
  public MyDate05(int new_year, int new_month, int new_day){
    year=new_year;
    month=new_month;
    day=new_day;
  }  
  public void print(){
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest05 {     
  public static void main(String[] args) {
    MyDate05 d=new MyDate05();  
    d.print();

    MyDate05 d2=new MyDate05(2017, 7, 19);
    d2.print();
  }
}      