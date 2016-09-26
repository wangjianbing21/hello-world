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
   public String getInfo(){
      return "Name:"+name+"\n"+"age:"+age;
   }


}
class Student extends Person{
    private String school;
    public void setSchool(String school){
      this.school = school;   
   }
    public String getSchool(){
       return school;
    }
    public String getInfo(){
      return "Name:"+getName()+"\nage:"+getAge()+"\nschool"+getSchool();
   }
}

public class TestOverWrite{
   public static void main(String args[]){
   Student student1 = new Student();
   Person  person1 = new Person();
   person1.setName("bingoo");
   person1.setAge(20);
   student1.setName("jianbing");
   student1.setAge(21);
   student1.setSchool("huiansanzhong");
   System.out.println(student1.getInfo());
   System.out.println(person1.getInfo());
   
   
   }
   
}
