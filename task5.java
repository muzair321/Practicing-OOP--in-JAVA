public class task5{
  public static void main(String[] args){
    Shape rect = new Rectangle();
    Shape circ = new Circle();
    System.out.println("Area Of Rectangle Is: " + rect.calculateArea(20,40));
    System.out.println("Area Of Circle Is: " + circ.calculateArea(10));
  }
}
class Shape{
  public double calculateArea(){
    return 0;
  }
}
class Rectangle extends Area{
  @Override
  public double calculateArea(double len, double wid){
    return len*wid;
  }
}
class Circle extends Area{
  @Override
  public double calculateArea(double r){
    return r*r*Math.PI;
  }
}
