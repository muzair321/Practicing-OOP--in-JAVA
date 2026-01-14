public class task10{
  public static void main(String[] args){
    Remote remote = new TV();
    remote.turnOn();
    remote.turnOff();
    remote = new AC();
    remote.turnOn();
    remote.turnOff();
  }
}
interface Remote{
  void turnOn();
  void turnOff();
}
class TV implements Remote{
  @Override
  public void turnOn(){
    System.out.println("TV Turned On");
  }
  @Override
  public void turnOff(){
    System.out.println("TV Turned Off");
  }
}
class AC implements Remote{
  @Override
  public void turnOn(){
    System.out.println("AC Turned On");
  }
  @Override
  public void turnOff(){
    System.out.println("AC Turned Off");
  }
}
