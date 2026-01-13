public class task6{
  public static void main(String[] args){
  }
}
class Person{
  private String  name;
  private int age;
}
class Student extends Person{
  String roll;
  Student(String name, int age, String roll){
    super.name = name;
    super.age = age;
    this.roll = roll;
  }
}
class Teacher extends Person{
  String subject;
  Student(String name, int age, String subject){
    super.name = name;
    super.age = age;
    this.subject = subject;
  }
}
