public class task1{
  public static void main(String[] args){
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
