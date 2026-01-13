public class task5{
  public static void main(String[] args){
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
