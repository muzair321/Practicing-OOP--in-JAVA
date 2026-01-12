public class task2{
  public static void main(String[] args){
  }
}
class BankAccount{
  private String  accountNo;
  private String holderName;
  private double balance;
  BankAccount(String accountNo, String holderName){
    this.accountNo = accountNo;
    this.holderName = holderName;
  }
  public void deposit(double amount){
    if(amount >= 0){
      balance += amount;
    }
    System.out.println("Successfully Deposited");
  }
  public void withdraw(double amount){
    if(amount <= balance){
      balance -= amount;
    }
    System.out.println("Amount Withdrawn, Remaining Balance: " + balance);
  }
  public void checkBalance(){
    System.out.println("  Holder Name: " + holderName + "\n  Account Number: " + accountNo + "\n  Balance: " + balance);
  }
}
