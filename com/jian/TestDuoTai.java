abstract class Animal{
  private String name;
   Animal(String name){
   this.name = name;
   }
/*public void enjoy(){
   System.out.println("¶¯Îï½ÐÉù......");
   }*/
public abstract void enjoy(); 
}

abstract class Dog extends Animal{
   private String furcolor;
   Dog(String n,String c){
   super(n);
   furcolor = c;
   }
   public abstract void enjoy();
/*public void enjoy(){
   System.out.println("¹·½ÐÉù......");
   }*/
}

class Cat extends Animal{
   private String eyescolor;
   Cat(String q,String e){
   super(q);
   eyescolor = e;
   }
public void enjoy(){
   System.out.println("Ã¨½ÐÉù......");
  
   }
}
class Bird extends Animal{
  // private String wingscolor;
   //Bird(String n,String c){
   Bird(){
   super("n");
   //wingscolor = c;
   }
public void enjoy(){
   System.out.println("Äñ½ÐÉù......");
   }
}


class Lady{
   private String name;
   private Animal pet;
   Lady(String name,Animal pet){
   this.name = name;
   this.pet = pet;
   }
public void mypet(){
   pet.enjoy();
   }
}
public class TestDuoTai{
   public static void main(String[] args){
	   Cat c1 = new Cat("harry","blue");
	  // Dog d1 = new Dog("bigyellow","yellow");
	   //Bird b1 = new Bird("xiaoniao","gray");
	   Bird b1 = new Bird();
	   Lady l1 = new Lady("l1",c1);
	   //Lady l2 = new Lady("l2",d1);
	   Lady l3 = new Lady("l3",b1);
           l1.mypet();
	   //l2.mypet();
	   l3.mypet();
	 //  System.out.println(l1.name);
	   // System.out.println(c1.name);
	 
   }
}
