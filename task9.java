public class task9{
  public static void main(Stringl[] args){
    Vehicle car = new Car();
    Vehicle bike = new Bike();
    car.start();
    bike.start();
    car.stop();
    bike.stop();
  }
}
abstract class Vehicle{
  public abstract void start();
  public void stop(){
    System.out.println("Vehicle Stopped");
  }
}
class Car extends Vehicle{
  @Override
  void start(){
    System.out.println("Car Started");
  }
}
class Bike extends Vehicle{
  @Override
  void start(){
    System.out.println("Bike Started");
  }
}
