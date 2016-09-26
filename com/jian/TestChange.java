class Animal{
   public String name;
   Animal(String name){
   this.name = name;
   }
}
class Cat extends Animal{
   public String eyescolor;
   Cat(String n,String c){
   super (n);
   eyescolor = c;
   }
}
class Dog extends Animal{
   public String furcolor;
   Dog(String n,String c){
   super (n);
   furcolor = c;
   }
}
public class TestChange{
   public static void main(String args[]){
   Animal a = new Animal("name");
   Cat c1 = new Cat("catname","blue");
   Dog d1 = new Dog("dogname","yellow");

   System.out.println(a instanceof Animal);
   System.out.println(c1 instanceof Animal);
   System.out.println(d1 instanceof Animal);
   System.out.println(a instanceof Cat);
   System.out.println(c1 instanceof Cat);
   //System.out.println(d1 instanceof Cat);
   System.out.println(a instanceof Dog);
  // System.out.println(c1 instanceof Dog);
   System.out.println(d1 instanceof Dog);


   a = new Dog("bigyellow","gray");
   System.out.println(a.name);
  // System.out.println(a.furcolor);
   Dog d2 = (Dog)a;
   System.out.println(d2.name);
   System.out.println(d2.furcolor);

   }

}
