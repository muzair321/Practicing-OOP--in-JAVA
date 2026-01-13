import java.util.Scanner;

public class task4{
  
  public static void main(String[] args){
    User uzi = new User("uzi2011","123");
    uzi.login();
  }
}
class GlobalScanner{
  public static Scanner inp = new Scanner(System.in);
}
class User{
  private String user;
  private String password;
  User(String user, String password){
    this.user = user;
    this.password = password;
  }
  public void login(){
    System.out.print("Enter User Name: ");
    String inpUser = GlobalScanner.inp.nextLine();
    System.out.print("Enter Password: ");
    String inpPass = GlobalScanner.inp.nextLine();
    if(user.equals(inpUser) && password.equals(inpPass)){
      System.out.println("Logged In Successfully");
    }else{
      System.out.println("Invalid Credentials");
    }
  }
}
