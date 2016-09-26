class Person{
   private String name;
   private int age;
   protected void setName(String name){
      this.name = name;   
   }
   public void setAge(int age){
      this.age = age;
   }
   public String getName(){
      return name;
   }
   public int getAge(){
      return age;   
   }
}
class Student extends Person{
    private String school;
    public String getSchool(){
       return school;
    }
    public void setSchool(String school){
      this.school = school;   
   }
}

public class TestPerson{
   public static void main(String args[]){
   Student student1 = new Student();
   student1.setName("jianbing");
   student1.setAge(21);
   student1.setSchool("huiansanzhong");
   System.out.println(student1.getName());
   System.out.println(student1.getAge());
   System.out.println(student1.getSchool());
   
   }
   
}
