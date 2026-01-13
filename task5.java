public class task5{
  public static void main(String[] args){
    Shape rect = new Rectangle(20,40);
    Shape circ = new Circle(10);
    System.out.println("Area Of Rectangle Is: " + rect.calculateArea());
    System.out.println("Area Of Circle Is: " + circ.calculateArea());
  }
}
class Shape{
  double calculateArea(){
    return 0;
  }
}
class Rectangle extends Shape{
  double len;
  double wid;
  Rectangle(double len, double wid){
    this.len = len;
    this.wid = wid;
  }
  @Override
  double calculateArea(){
    return len*wid;
  }
}
class Circle extends Shape{
  double r;
  Circle(double r){
    this.r = r;
  }
  @Override
  double calculateArea(){
    return r*r*Math.PI;
  }
}
