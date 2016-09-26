class FatherClass{
    public int value =101;
   public void f(){
       value = 100;
   System.out.println("Father's value is "+ value);
   }
}
class ChildClass extends FatherClass{
    public int value;
   public void f(){
        super.f();
	value = 200;
	System.out.println("ChildClass's value is "+ value);
	System.out.println(value);
	System.out.println(super.value);
	
   }
}
public class TestSuper{
    public static void main(String args[]){
    ChildClass c1 = new ChildClass();
    c1.f();


   }

}
