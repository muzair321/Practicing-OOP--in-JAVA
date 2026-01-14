public class task8{
  public static void main(String[] args){
  }
}
class Payment{
  void pay(){
    System.out.println("Payment Completed");
  }
}
class CashPayment extends Payment{
  @Override
  void pay(){
    System.out.println("Payment Completed via Cash");
  }
}
class CardPayment extends Payment{
  @Override
  void pay(){
    System.out.println("Payment Completed via Card");
  }
}
class OnlinePayment extends Payment{
  @Override
  void pay(){
    System.out.println("Payment Completed via Online Banking");
  }
}
