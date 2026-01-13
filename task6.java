public class task6{
  public static void main(String[] args){
  }
}
class Person{
  String  name;
  int age;
  void display(){
    System.out.println("Name: " + name + "\nAge: " + age);
  }
}
class Student extends Person{
  private String roll;
  Student(String name, int age, String roll){
    super.name = name;
    super.age = age;
    this.roll = roll;
  }
  @Override
  void display(){
    System.out.println("Name: " + name + "\nAge: " + age + "\nRoll Number: " + roll);
  }
}
class Teacher extends Person{
  private String subject;
  Student(String name, int age, String subject){
    super.name = name;
    super.age = age;
    this.subject = subject;
  }
  @Override
  void display(){
    System.out.println("Name: " + name + "\nAge: " + age + "\nSubject: " + subject);
  }
}
