public class task8{
  public static void main(String[] args){
    Payment pay = new Payment();
    Payment cash = new CashPayment();
    Payment card = new CardPayment();
    Payment online = new OnlinePayment();
    pay.pay();
    cash.pay();
    card.pay();
    online.pay();
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
