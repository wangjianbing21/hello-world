public class TestStatic{
   private static int sid=0;
   private String name;
   int id;
    TestStatic (String name){
      this.name = name;
      id = sid++;
   }
   public void Info(){
      System.out.println("my name is " + name + "\nmy id is " + id);
   }
public static void main(String args[]){
     TestStatic.sid=21;
     TestStatic s1 = new TestStatic("bingoo");
     TestStatic s2 = new TestStatic("jianjian");
     s1.Info();
     System.out.println(sid);
     s1.sid=2000;
     s2.Info();
     System.out.println(sid);
    }
}
