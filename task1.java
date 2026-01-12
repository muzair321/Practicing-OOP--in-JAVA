public class task1{
  public static void main(String[] args){
    Student uzi = new Student("Muhammad Uzair", "FA25-BCS-000", 77);
    uzi.displayInfo();
    Student ahm = new Student("Ahmad Ali", "FA25-BCS-000", 80);
    ahm.displayInfo();
    Student ham = new Student("Hamza Farooq", "FA25-BCS-000", 85);
    ham.displayInfo();
  }
}
class Student{
  String  name;
  String roll;
  double marks;
  Student(String name, String roll, double marks){
    this.name = name;
    this.roll = roll;
    this.marks = marks;
  }
  public void displayInfo(){
    System.out.println("Name: " + name + "\nRoll: " + roll + "\nMarks: " + marks);
  }
}
