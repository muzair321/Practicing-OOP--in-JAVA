public class task2{
  public static void main(String[] args){
    BankAccount bank = new BankAccount("12345678", "Muhammad Uzair");
    bank.deposit(10000);
    bank.checkBalance();
    bank.withdraw(12000);
    bank.checkBalance();
    bank.withdraw(2000);
    bank.checkBalance();
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
      System.out.println("Successfully Deposited");
    }
    else{
      System.out.println("Insufficient Balance");
    }
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
